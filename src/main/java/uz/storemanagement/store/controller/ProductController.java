package uz.storemanagement.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.storemanagement.store.entity.Product;
import uz.storemanagement.store.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    private List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping
    private void add(@RequestBody Product product) {
        productService.save(product);
    }

    @PutMapping("{id}")
    private void update(@PathVariable Long id, @RequestBody Product product) {
        productService.update(id, product);
    }

    @DeleteMapping("{id}")
    private void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
