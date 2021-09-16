package uz.storemanagement.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SoldProduct {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Product product;

    private Integer amount;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Sale sale;
}
