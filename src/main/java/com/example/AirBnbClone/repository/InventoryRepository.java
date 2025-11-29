package com.example.AirBnbClone.repository;

import com.example.AirBnbClone.entity.Inventory;
import com.example.AirBnbClone.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    void deleteByRoom(Room room);
}
