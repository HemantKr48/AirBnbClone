package com.example.AirBnbClone.service;

import com.example.AirBnbClone.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
}
