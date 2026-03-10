package parking;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<List<Vehicle>> floors;
    private int slotsPerFloor;

    public Garage(int floorCount, int slotsPerFloor) {
        this.slotsPerFloor = slotsPerFloor;
        this.floors = new ArrayList<>();
        
        for (int i = 0; i < floorCount; i++) {
            List<Vehicle> floor = new ArrayList<>();
            for (int j = 0; j < slotsPerFloor; j++) {
                floor.add(null);
            }
            floors.add(floor);
        }
    }
    
    public String leaveVehicle(String licensePlate) {
        for (int i = 0; i < floors.size(); i++) {
            List<Vehicle> currentFloor = floors.get(i);
            for (int j = 0; j < slotsPerFloor; j++) {
                Vehicle v = currentFloor.get(j);
                if (v != null && v.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                    currentFloor.set(j, null);
                    return "Vehicle " + licensePlate + " left. Slot [" + i + "][" + j + "] is now free.";
                }
            }
        }
        return "Error: Vehicle with plate " + licensePlate + " not found.";
    }
    
    public String parkVehicle(Vehicle vehicle) {
        for (int i = 0; i < floors.size(); i++) {
            List<Vehicle> currentFloor = floors.get(i);
            for (int j = 0; j < slotsPerFloor; j++) {
                if (currentFloor.get(j) == null) {
                    currentFloor.set(j, vehicle);
                    return "Vehicle parked! Floor: " + i + ", Slot: " + j;
                }
            }
        }
        return "Sorry, no free slots available.";
    }
    
    public String findVehicle(String licensePlate) {
        for (int i = 0; i < floors.size(); i++) {
            List<Vehicle> currentFloor = floors.get(i);
            for (int j = 0; j < slotsPerFloor; j++) {
                Vehicle v = currentFloor.get(j);
                if (v != null && v.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                    return "Vehicle " + licensePlate + " is at floor " + i + ", slot " + j;
                }
            }
        }
        return "Vehicle not found!";
    }
    
    public int freeSlots() {
        int count = 0;
        for (List<Vehicle> floor : floors) {
            for (Vehicle slot : floor) {
                if (slot == null) count++;
            }
        }
        return count;
    }
}