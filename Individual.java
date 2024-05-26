package assignment2;

public class Individual extends Customer{
    private int age;
    private String state;
    private String zip;

    public Individual(){}
    public Individual(int id, String name, int discountRate, int age, String state, String zip){
        super(id, name, discountRate);
        this.age = age;
        this.state = state;
        this.zip = zip;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    public String getZip(){
        return zip;
    }
    @Override
    public String generateReport(){
        StringBuilder output = new StringBuilder();
        output.append("\t\tID: ").append(getID()).append("\n");
        output.append("\t\tName: ").append(getName()).append("\n");
        output.append("\t\tAge: ").append(getAge()).append("\n");
        output.append("\t\tState: ").append(getState()).append("\n");
        output.append("\t\tZip: ").append(getZip()).append("\n");
        output.append("\t\tDiscount Rate: ").append(getDiscountRate()).append("\n");
        output.append("\t\tOrder History: \n");
        return output.toString();
    }
}