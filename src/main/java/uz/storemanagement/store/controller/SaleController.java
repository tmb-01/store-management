package uz.storemanagement.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.storemanagement.store.entity.Product;
import uz.storemanagement.store.entity.Sale;
import uz.storemanagement.store.repository.ProductRepository;
import uz.storemanagement.store.service.SaleService;

import java.util.List;

@RestController
@RequestMapping("api/v1/sale")
public class SaleController {

    @Autowired
    SaleService saleService;

    @Autowired
    ProductRepository productRepository;

    @PostMapping("sold")
    public void sold(@RequestBody List<Sale> soldList) {
//        for (Sale sale : soldList) {
//            Long id = sale.getProduct().getId();
//            Integer amount = sale.getAmount();
//            Product product = productRepository.getById(id);
//            product.setAmount(product.getAmount() - amount);
//            productRepository.save(product);
//
//        }
    }


}
