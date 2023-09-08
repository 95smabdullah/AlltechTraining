package Day3.IOandSerProblems.problem7;

import java.io.*;

public class ExternalizedCDR implements Externalizable {
    public String A_Number;
    public String B_Number;
    public int duration;
    public double calculatedCharge;

    public ExternalizedCDR() {

    }

    public ExternalizedCDR(String A_Number, String B_Number, int duration) {
        this.A_Number = A_Number;
        this.B_Number = B_Number;
        this.duration = duration;
        this.calculatedCharge = duration * 1.0;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeUTF(A_Number);
        out.writeUTF(B_Number);
        out.writeInt(duration);
        out.writeDouble(calculatedCharge);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        A_Number = in.readUTF();
        B_Number = in.readUTF();
        duration = in.readInt();
        calculatedCharge = in.readDouble();
    }

    @Override
    public String toString() {
        return "A_Number: " + A_Number +
                ", B_Number: " + B_Number +
                ", Duration: " + duration + " minutes" +
                ", Calculated Charge: $" + calculatedCharge;
    }
}
