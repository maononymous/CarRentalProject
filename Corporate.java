package assignment2;

public class Corporate extends Customer{
    private String taxID;
    private String country;

    public Corporate(){}
    public Corporate(int id, String name, int discountRate, String taxID, String country){
        super(id, name, discountRate);
        this.taxID = taxID;
        this.country = country;
    }
    public void setTaxID(String taxID){
        this.taxID = taxID;
    }
    public String getTaxID(){
        return taxID;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    @Override
    public String generateReport(){
        StringBuilder report = new StringBuilder("\t\tID: " + getID() + "\n\t\tName: " + getName() + "\n\t\tCountry: " + getCountry() + "\n\t\tTax ID: " + getTaxID() + "\n\t\tDiscount Rate: " + getDiscountRate());
        return report.toString();
    }
}