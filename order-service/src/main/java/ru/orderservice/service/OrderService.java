package ru.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.orderservice.dto.OrderLineItemsDto;
import ru.orderservice.dto.OrderRequest;
import ru.orderservice.model.Order;
import ru.orderservice.repository.OrderRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = Order.builder()
                .orderNumber(UUID.randomUUID().toString())
                .orderLineItemsList(orderRequest.getOrderLineItemsDtoList()
                        .stream()
                        .map(OrderLineItemsDto::from)
                        .toList())
                .build();


        orderRepository.save(order);
    }
}
