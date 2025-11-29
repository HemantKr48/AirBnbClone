package com.example.AirBnbClone.service;

import com.example.AirBnbClone.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);
}
