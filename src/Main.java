import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new car());
    vehicles.add(new motorCycle());
    vehicles.add(new bicycle());
    for (Vehicle vehicle : vehicles) {
      System.out.println(vehicle.wheels());
    }
  }
}