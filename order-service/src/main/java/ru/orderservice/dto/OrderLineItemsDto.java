package ru.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.orderservice.model.OrderLineItems;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

    public static OrderLineItems from(OrderLineItemsDto dto){
        return OrderLineItems.builder()
                .skuCode(dto.getSkuCode())
                .quantity(dto.getQuantity())
                .price(dto.getPrice())
                .build();
    }

    public static List<OrderLineItems> from(List<OrderLineItemsDto> dtoList){
        return dtoList.stream().map(OrderLineItemsDto::from).toList();
    }
}
