package ru.orderservice.model;

import jakarta.persistence.*;
import lombok.*;
import ru.orderservice.dto.OrderLineItemsDto;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "t_order_line_items")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
