package uz.storemanagement.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.storemanagement.store.entity.Product;
import uz.storemanagement.store.entity.Sale;
import uz.storemanagement.store.entity.SoldProduct;
import uz.storemanagement.store.payload.SoldProductDto;
import uz.storemanagement.store.repository.ProductRepository;
import uz.storemanagement.store.repository.SaleRepository;
import uz.storemanagement.store.repository.SoldProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    SoldProductRepository soldProductRepository;

    @Autowired
    ProductRepository productRepository;

    public void sold(List<SoldProductDto> soldProducts){
        Sale sale = saleRepository.save(new Sale());
        for (SoldProductDto soldProductDto:soldProducts) {
            Long productId = soldProductDto.getProductId();
            Integer productAmount = soldProductDto.getAmount();
            Product product = productRepository.getById(productId);
            product.setAmount(product.getAmount() - productAmount);
            productRepository.save(product);

            SoldProduct soldProduct = new SoldProduct();
            soldProduct.setProduct(product);
            soldProduct.setSale(sale);
            soldProduct.setAmount(productAmount);
            soldProductRepository.save(soldProduct);
        }
    }


    public List<Sale> getHistory() {
        return saleRepository.findAll();
    }
}
