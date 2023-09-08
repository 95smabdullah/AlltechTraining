package Day3.IOandSerProblems.problem6;

import java.io.Serializable;

public class CDR implements Serializable {
    public String A_Number;
    public String B_Number;
    public int duration;
    public double calculatedCharge;

    public CDR(String A_Number, String B_Number, int duration) {
        this.A_Number = A_Number;
        this.B_Number = B_Number;
        this.duration = duration;
        this.calculatedCharge = duration * 1.0; // $1 per minute charge
    }

    @Override
    public String toString() {
        return "A_Number: " + A_Number +
                ", B_Number: " + B_Number +
                ", Duration: " + duration + " minutes" +
                ", Calculated Charge: $" + calculatedCharge;
    }
}

