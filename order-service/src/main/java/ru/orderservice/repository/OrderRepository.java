package ru.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
