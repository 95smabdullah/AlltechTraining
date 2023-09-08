package Day2.problem3;

public class Medicine {
    String companyName;
    String companyAddress;
    public Medicine(String companyName, String companyAddress){
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }
    public void displayLabel(){
        System.out.println("Company Name: "+companyName+"\nCompany Address: "+companyAddress);
    }
}
