package com.dk.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dk.inventoryservice.model.Inventory;

@Repository
public interface InventoryRepository  extends JpaRepository<Inventory, Long>{

	Optional<Inventory> findBySkuCode(String skuCode);

}
