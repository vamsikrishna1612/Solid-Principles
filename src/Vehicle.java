public class Vehicle {
  public int wheels(){
    return 2;
  }

}

class EngineVehicle extends Vehicle{
  public boolean hasEngine(){
    return true;
  }
}

class motorCycle extends EngineVehicle{

}

class car extends EngineVehicle{
  @Override
  public int wheels(){
    return 4;
  }
}

class bicycle extends Vehicle{

}