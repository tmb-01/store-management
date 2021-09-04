package uz.storemanagement.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.storemanagement.store.entity.Product;
import uz.storemanagement.store.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public void update(Long id, Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    public void save(Product product) {
        productRepository.save(product);
    }
}
