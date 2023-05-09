package ru.inventoryservice.repositoory;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.inventoryservice.model.Inventory;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
