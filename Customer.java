package assignment2;
import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements Reportable{
    private int id;
    private String name;
    private int discountRate;
    private List<RentalOrder> rentalOrderList;

    public Customer(){}

    public Customer(int id, String name, int discountRate){
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
        rentalOrderList = new ArrayList<RentalOrder>();
    }

    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getDiscountRate(){
        return discountRate;
    }
    public void addOrder(RentalOrder rentalOrder){
        rentalOrderList.add(rentalOrder);
    }
    public void removeOrder(RentalOrder rentalOrder){
        rentalOrderList.remove(rentalOrder);
    }
    public String getOrderHistory(){
        StringBuilder output = new StringBuilder();
        for (RentalOrder obj : rentalOrderList) {
            output.append(obj.getDetails() + "\n");
        }
        return output.toString();
    }
}
