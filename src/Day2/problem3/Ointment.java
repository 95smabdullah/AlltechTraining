package Day2.problem3;

public class Ointment extends Medicine{
    String medInstruction;
    public Ointment(String companyName, String companyAddress, String medInstruction) {
        super(companyName, companyAddress);
        this.medInstruction = medInstruction;
    }

    @Override
    public void displayLabel() {
        System.out.println("Company Name: "+companyName+" | Company Address: "+companyAddress+" | Instruction"+ medInstruction);
    }
}