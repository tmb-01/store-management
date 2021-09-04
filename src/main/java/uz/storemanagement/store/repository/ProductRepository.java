package uz.storemanagement.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.storemanagement.store.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
