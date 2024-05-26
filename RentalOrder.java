package assignment2;

public class RentalOrder {
    private float totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;

    public RentalOrder(){}
    public RentalOrder(Customer customer, Vehicle vehicle){
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = 1;
    }
    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength){
        this(customer,vehicle);
        setRentalLength(rentalLength);
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setRentalLength(int rentalLength){
        this.rentalLength = rentalLength;
    }
    public int getRentalLength(){
        return rentalLength;
    }

    public float calculateTotalCost(){
        totalCost = vehicle.getDailyRate()*rentalLength - vehicle.getDailyRate()*rentalLength*customer.getDiscountRate()*(0.01f);
        return totalCost;
    }

    public void completeOrder(){
        calculateTotalCost();
        customer.addOrder(this);
        vehicle.setAvailable(false);
    }

    public String getDetails(){
        return "Customer: \n" + customer.generateReport() + "\n\tVehicle: \n\t\t" + vehicle.toString() + "\n\t\tTotal Cost: " + totalCost;
    }
}