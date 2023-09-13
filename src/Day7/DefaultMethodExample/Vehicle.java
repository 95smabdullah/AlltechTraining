package Day7.DefaultMethodExample;

public interface Vehicle {
    public static void cleanVehicle(){
        System.out.println("Cleaning Vehicle");
    }

    public default void startVehicle(){
        System.out.println("Starting Vehicle");
    }
}
