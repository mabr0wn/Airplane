package com.pluralsight.airplane;

public class Main {
  
    public static void main(String[] args) {
    
      Flight lax1 = new Flight();
      Flight lax2 = new Flight();
        Flight lax3 = new Flight();
        if(lax1.hasRoom(lax2))
          lax3 = lax1.createNewWithBoth(lax2);
        System.out.println(lax3);
        
        Flight f = new Flight();
        Passenger janet = new Passenger(0, 1);
        Passenger jonh = new Passenger(0, 2);
        f.addPassenger(janet, john);
        
        Passenger fred = new Passenger(0, 2);
        Passenger sarah = new Passenger(0, 2);
        Passenger susie = new Passenger(0, 0);
        
        CargoFlight cf = new CargoFlight();
        
        cf.add1Package(1.0f, 2.5f, 3.0f);
        
        Passenger jane = new Passenger(0, 2);
        
        Flight f1 = new Flight();
        System.out.println(f1.getSeats());
        
        CargoFlight cf2 = new CargoFlight();
        System.out.println(f2.getSeats());
        
        f2.add1Passenger();
        cf.add1Passenger();
    }


}
