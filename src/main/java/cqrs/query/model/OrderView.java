package cqrs.query.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OrderView", schema = "cqrs-read-schema")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderView {

    @Id
    private Long id;

    private String product;

    private int quantity;

}
