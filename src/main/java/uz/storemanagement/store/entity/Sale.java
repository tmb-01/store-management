package uz.storemanagement.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Sale {
    @Id
    @GeneratedValue
    private UUID id;


    @OneToMany(mappedBy = "sale",cascade = CascadeType.ALL)
    private List<SoldProduct> productList;

    @CreationTimestamp
    private Timestamp createdAt;
}
