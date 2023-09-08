package Day3.problem1;

import java.util.ArrayList;
import java.util.Random;

public class Advisor {
    ArrayList<String> message = new ArrayList<>(5);
    public Advisor(){
        message.add("Never give up");
        message.add("Keep up the good work");
        message.add("Be positive");
        message.add("Be Courteous");
        message.add("Be patient");

    }

    public String getAdvice(){
        Random r = new Random();
        int i = r.nextInt(5);
        return message.get(i);
    }

}
