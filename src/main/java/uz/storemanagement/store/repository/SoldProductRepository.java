package uz.storemanagement.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.storemanagement.store.entity.SoldProduct;

import java.util.UUID;

public interface SoldProductRepository extends JpaRepository<SoldProduct, UUID> {
}
