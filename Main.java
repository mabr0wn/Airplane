package com.pluralsight.airplane;

import java.util.*;

import static java.util.Arrays.*;

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
    Passenger john = new Passenger(0,2);
    f.addPassenger(janet, john);

    Passenger fred = new Passenger(0, 2);
    Passenger sarah = new Passenger(0, 2);
    Passenger susie = new Passenger(0,0);



        //will be last since 45 minutes past 12 midnight
        Flight lax045 = new Flight();
        lax045.setFlightTime(45);
//will be first 15 minutes past midnight
        Flight slc015 = new Flight();
        slc015.setFlightTime(15);
//will be 2nd 30 minutes past midnight
        Flight nyc030 = new Flight();
        nyc030.setFlightTime(30);

//takes the variables and creates an array
        Flight[] flights = {
                lax045, slc015, nyc030
        };
//will sort the variables according to our compareTo method above.
        Arrays.sort(flights);




       System.out.println(Arrays.toString(flights));

        //look at it in code
        lax045 = new Flight(45);
        lax045.setFlightTime(45);
        Passenger bob = new Passenger(2, 2);
        bob.setLevelAndDays(1, 180);
        Passenger jane = new Passenger();
        jane.setLevelAndDays(1, 90);
        Passenger steve = new Passenger();
        steve.setLevelAndDays(2, 180);
        Passenger lisa = new Passenger();
        lisa.setLevelAndDays(3, 730);

        Passenger[] roster = new Passenger[] {bob, jane, steve, lisa};

        Arrays.sort(roster);
        //will return the array in string format caling Arrays.toString()
        System.out.println(Arrays.toString(roster));

        //add crew members:
        //Pilot Patty, CoPilot Karl, Marshal Mary
        //Add Passengers:
        //Bob, Jane, Steve, Lisa
        //use the interator to go through each person on that flight.
//        for (Flight lax = lax045; lax045.hasNext(); ) {
//            Person p =  lax045.next();
//            Passenger[] roster2 = {bob, jane, steve, lisa};
//            System.out.println(p.getName());
//        }

        //we need to identify the job that needs to be filled.
        // it will return back a crew member that can fill in that job without messing with a crew job that is already assigned.
        //now that we have a static initializer the program will automatically load up that array for us
        //it will initalize our classes prior to our first use. with no special calls on the part of the user
        CrewMember p = CrewMember.findAvailble(FlightCrewJob.CoPilot);

        System.out.println(p);

        Passenger Steven = new Passenger();
        Steven.setName("Steven");
        //setup his reward program by calling the getter
        //then call method on it and set his member level to 3
        Steven.getRewardProgram().setMemberLevel(3);
        //now set his member days to 180
        Steven.getRewardProgram().setMemberDays(180);

        //since we made the nest class public RewardProgram
        //we can use that ourside of that class
        //notice the name the enclosing class(Passenger) plus the nested class(RewardProgram)
        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        //set the platinum level to three
        platinum.setMemberLevel(3);
        //if Steven reward program level is 3 and platinum level is 3 then print our message
        if(Steven.getRewardProgram().getMemberLevel() == platinum.getMemberLevel())
            System.out.println("Steven is platinum");





    CargoFlight cf = new CargoFlight();

    cf.add1Package(1.0f, 2.5f, 3.0f );

    Passenger janebrown = new Passenger(0, 2);

    Flight f1 = new Flight();
    System.out.println(f1.getSeats());

    CargoFlight cf2 = new CargoFlight();
    System.out.println(cf.getSeats());

    Flight f2 = new CargoFlight();
    System.out.println(f2.getSeats());

    f2.add1Passenger();
    cf.add1Passenger();



    }
}
