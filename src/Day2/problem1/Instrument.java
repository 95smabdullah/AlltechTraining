package Day2.problem1;

import java.util.ArrayList;

public abstract class Instrument {
    public abstract void play();
}

class Main{
    public static void main(String[] args){
        ArrayList<Instrument> instrumentList = new ArrayList<>(10);
        Instrument p1 = new Piano();
        Instrument p2 = new Piano();
        Instrument p3 = new Piano();
        Instrument f1 = new Flute();
        Instrument f2 = new Flute();
        Instrument f3 = new Flute();
        Instrument g1 = new Guitar();
        Instrument g2 = new Guitar();
        Instrument g3 = new Guitar();
        Instrument g4 = new Guitar();
        instrumentList.add(p1);
        instrumentList.add(p2);
        instrumentList.add(p3);
        instrumentList.add(f1);
        instrumentList.add(f2);
        instrumentList.add(f3);
        instrumentList.add(g1);
        instrumentList.add(g2);
        instrumentList.add(g3);
        instrumentList.add(g4);

        int index = 0;
        for(Instrument i: instrumentList){
            i.play();
            boolean c1 = i instanceof Piano;
            boolean c2 = i instanceof Flute;
            boolean c3 = i instanceof Guitar;
            System.out.println("Is there a Piano at index " + index +" "+ c1 );
            System.out.println("Is there a Flute at index " + index +" "+ c2 );
            System.out.println("Is there a Guitar at index " + index +" "+ c3 );
            index++;
        }
    }
}
