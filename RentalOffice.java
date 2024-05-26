package assignment2;
import java.util.ArrayList;
import java.util.List;

public class RentalOffice implements Reportable{
    private int officeID;
    private String locationZip;
    private List<Inventory> inventoryList;
    private List<RentalOrder> rentalOrderList;

    public RentalOffice(int officeID, String locationZip){
        this.officeID = officeID;
        this.locationZip = locationZip;
        inventoryList = new ArrayList<Inventory>();
        rentalOrderList = new ArrayList<RentalOrder>();
    }

    public void addInventory(Inventory inventory){
        if(/*check if type exists */true)
        inventoryList.add(inventory);
    }

    public void removeInventory(Inventory inventory){
        inventoryList.remove(inventory);
    }

    public void addOrder(RentalOrder rentalOrder){
        if(/*check if type exists */true)
        rentalOrderList.add(rentalOrder);
    }

    @Override
    public String generateReport(){
        StringBuilder output = new StringBuilder("Office ID: " + officeID + "\nLocation Zipcode: " + locationZip + "\nInventory List:\n");
        for(Inventory obj : inventoryList){
            output.append("\t" + obj.toString());
        }
        output.append("Order List:\n");
        for(RentalOrder obj : rentalOrderList){
            output.append("\t" + obj.getDetails() + "\n");
        }
        return output.toString();
    }
}