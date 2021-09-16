package uz.storemanagement.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String productName;

    private Integer amount;

    private UUID imageId;

    private String description;

    private Long price;

    @CreationTimestamp
    private Timestamp createdAt;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<SoldProduct> soldProductList;
}