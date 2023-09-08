package Day2.problem3;

public class Syrup extends Medicine{
    String medInstruction;
    public Syrup(String companyName, String companyAddress, String medInstruction) {
        super(companyName, companyAddress);
        this.medInstruction = medInstruction;
    }

    @Override
    public void displayLabel() {
        System.out.println("Company Name: "+companyName+" | Company Address: "+companyAddress+" | Medicine Type"+ medInstruction);
    }
}