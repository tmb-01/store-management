package uz.storemanagement.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.storemanagement.store.entity.Sale;

import java.util.UUID;

public interface SaleRepository extends JpaRepository<Sale, UUID> {
}
