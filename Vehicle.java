package assignment2;

public class Vehicle {
    private int vehicleID;
    private String make;
    private String model;
    private int year;
    private float mileage;
    private VehicleType type;
    private boolean available = true;
    private float dailyRate;

    public Vehicle(){}
    public Vehicle(int vehicleID, String make, String model, int year, float mileage, VehicleType type, float dailyRate){
        setVehicleID(vehicleID);
        setMake(make);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setAvailable(available);
        setDailyRate(dailyRate);
        setType(type);
    }

    public int getVehicleID(){
        return vehicleID;
    }
    public void setVehicleID(int vehicleID){
        this.vehicleID = vehicleID;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public float getMileage(){
        return mileage;
    }
    public void setMileage(float mileage){
        this.mileage = mileage;
    }
    public boolean getAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
    public float getDailyRate(){
        return dailyRate;
    }
    public void setDailyRate(float dailyRate){
        this.dailyRate = dailyRate;
    }
    private void setType(VehicleType type){
        this.type = type;
    }
    public VehicleType getType(){
        return type;
    }

    public String toString(){
        return "Vehicle ID: " + getVehicleID() + "\n\t\tMake: " + getMake() + "\n\t\tModel: " + getModel() + "\n\t\tYear" + getYear() + "\n\t\tMileage: " + getMileage() + "\n\t\tVehicle Type: " + getType() + "\n\t\tAvailable? " + getAvailable() + "\n\t\tDaily Rate: " + getDailyRate();
    }

}