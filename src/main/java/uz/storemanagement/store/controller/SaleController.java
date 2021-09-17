package uz.storemanagement.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.storemanagement.store.entity.Product;
import uz.storemanagement.store.entity.Sale;
import uz.storemanagement.store.entity.SoldProduct;
import uz.storemanagement.store.payload.SoldProductDto;
import uz.storemanagement.store.repository.ProductRepository;
import uz.storemanagement.store.service.SaleService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/sale")
@CrossOrigin
public class SaleController {

    @Autowired
    SaleService saleService;

    @Autowired
    ProductRepository productRepository;

    @PostMapping("sold")
    public void sold(@RequestBody List<SoldProductDto> soldProducts) {
        saleService.sold(soldProducts);
    }

    @GetMapping("history")
    public List<Sale> getHistory(){
        return saleService.getHistory();
    }
}
