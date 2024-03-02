package com.java.pack;

import java.util.ArrayList;
import java.util.List;

 class Vehicle {
	int vehicleNumber;
    long lastPolledEpochTime;
    int numberOfTimesFineImposed;

    public Vehicle(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.lastPolledEpochTime = 0;
        this.numberOfTimesFineImposed = 0;
    }
}

interface IVehicleTrackingService {
    void registerVehicle(int vehicleNumber);

    Vehicle getVehicleInfo(int vehicleNumber);

    boolean polledVehicleInfo(int vehicleNumber, long distanceTraveledInKm, long epochTime);

    List<Long> fineHistory(int vehicleNumber, int K);
}

 class VehicleTrackingService implements IVehicleTrackingService {
    private List<Vehicle> vehicles;

    public VehicleTrackingService() {
        this.vehicles = new ArrayList<>();
    }

    @Override
    public void registerVehicle(int vehicleNumber) {
        vehicles.add(new Vehicle(vehicleNumber));
    }

    @Override
    public Vehicle getVehicleInfo(int vehicleNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleNumber == vehicleNumber) {
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public boolean polledVehicleInfo(int vehicleNumber, long distanceTraveledInKm, long epochTime) {
        Vehicle vehicle = getVehicleInfo(vehicleNumber);

        if (vehicle != null) {
            if (vehicle.lastPolledEpochTime != 0) {
                long timeDifference = epochTime - vehicle.lastPolledEpochTime;
                double averageSpeed = (double) distanceTraveledInKm / timeDifference;

                if (averageSpeed > 60) {
                    vehicle.numberOfTimesFineImposed++;
                    return true;
                }
            }

            vehicle.lastPolledEpochTime = epochTime;
        }

        return false;
    }

    @Override
    public List<Long> fineHistory(int vehicleNumber, int K) {
        List<Long> history = new ArrayList<>();
        Vehicle vehicle = getVehicleInfo(vehicleNumber);

        if (vehicle != null) {
            // Assuming fine history is stored in descending order of timestamps
            for (int i = 0; i < Math.min(K, vehicle.numberOfTimesFineImposed); i++) {
                history.add(vehicle.lastPolledEpochTime - i);
            }
        }

        return history;
    }

}

public class Test1 {
	public static void main(String[] args) {
        // Example usage:
        IVehicleTrackingService trackingService = new VehicleTrackingService();
        trackingService.registerVehicle(0);
        trackingService.registerVehicle(1);

        System.out.println(trackingService.polledVehicleInfo(0, 10, 1600000200)); // true
        System.out.println(trackingService.polledVehicleInfo(0, 12, 1600000800)); // true
        System.out.println(trackingService.polledVehicleInfo(1, 1, 1600000030));  // false

        Vehicle vehicleInfo = trackingService.getVehicleInfo(0);
        System.out.println(vehicleInfo.lastPolledEpochTime + " " + vehicleInfo.numberOfTimesFineImposed); // 1600000800 2

        List<Long> fineHistory = trackingService.fineHistory(0, 2);
        System.out.println(fineHistory); // [1600000800, 1600000200]
    }
}
