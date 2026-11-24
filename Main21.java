abstract class Vehicle{
    abstract void startEngine();

    void stopEngine(){
        System.out.println( "Vehicle engine stopped");
    }
}
class Bike extends Vehicle{
    @Override 
    
    void startEngine(){
        System.out.println("Bike engine started using self-start");
    }

}
class Main20{
    public static void main(String[] args) {
        
    
    Bike b = new Bike();
    b.stopEngine();
    b.startEngine();
    }
}