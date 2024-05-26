package assignment2;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int inventoryID;
    private VehicleType type;
    private List<Vehicle> vehicleList;

    public Inventory(){}

    public Inventory(int inventoryID, VehicleType type){
        this.inventoryID = inventoryID;
        this.type = type;
        vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle){
        if( vehicle.getType() == VehicleType.CAR || vehicle.getType() == VehicleType.SUV || vehicle.getType() == VehicleType.TRUCK )
            vehicleList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder("Inventory ID: " + inventoryID + "\n\tVehicle Type: " + type + "\n\tVehicle List: \n");
        for(Vehicle obj : vehicleList){
            output.append("\t\t" + obj.toString() + "\n");
        }
        return output.toString();
    }
}
