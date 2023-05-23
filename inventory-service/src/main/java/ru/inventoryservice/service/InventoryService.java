package ru.inventoryservice.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.inventoryservice.dto.InventoryResponse;
import ru.inventoryservice.repositoory.InventoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @SneakyThrows // for simulate
    public List<InventoryResponse> isInStock(List<String> skuCode) {
//        log.info("Wait Started");
//        Thread.sleep(10000); // simulate slow behavior
//        log.info("Wait Ended");
        return inventoryRepository.findBySkuCodeIn(skuCode)
                .stream()
                .map(InventoryResponse::from)
                .toList();
    }

}
