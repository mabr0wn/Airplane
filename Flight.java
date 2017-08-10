package com.pluralsight.airplane;

import java.util.Arrays;
import java.util.Iterator;

/**
  *Added to github 8/9/17
  */

public class Flight implements Comparable<Flight>, Iterator<Person> {
  //set static final to int which will not ever change
  static final int MAX_FAA_SEATS = 550;
  private int passengers, seats = 150;
  //add wrapper class for null
  private Integer flightNumber;
  private Character flightClass;
  private boolean[] isSeatsAvailable;
  int checkedBags;
  int totalCheckedBags;
  int maxCarryOns = seats * 2, totalCarryOns;
  private int flightTime;
  private CrewMemeber[] crew;
  private Passenger[] roster;
  public int compareTo(Flight f) {
    //if(flightTime < f.flightTime)
    //return -1
    //else if(flightTime > f.flightTime)
    // return 1;
    //can wirte in simple arithmetic with the Comaprable interface
    //saying heres that varaible flightTime minus the past in f.flightTime
    //if passed negative value it will be sorted before
    //if positive it will be sorted after
    return flightTime - f.flightTime;
  }
  //iterator is also an interface and has two methods on it
  public Iterator<Person> iterator() {
    //now we can return back that instance back after creating that class below.
    return new FlightIterator(crew, roster);
  }
  //Initializer
  //if seats are avialable add(loop) seats until it reached 150.
  {
    isSeatsAvailable = new boolean[seats];
    for (int i = 0; i < seats; i++)
      isSeatsAvailable[i] = true
  }
  //Constructors
  Flight() { 
         //Seats = 150;
         //passengers = 0;
  }
  //Declare variable flightNumber to constructor flightNumber
  Flight(Integer flightNumber) {
          this.flightNumber = flightNumber;
  }
  //Declare variable flightClass to constructor flightClass
  Flight(Character flightClass) {
    this.flightClass = flightClass;
  }
  //combine flights if has room loops through passengers as long as less then seats @ 150
  boolean hasRoom(Flight f2) {
    int total = passengers + f2.passengers();
    return total <= seats;
  }
 
  //Create a new flight combine two flights
 //Passengers from Flight plus passengers from 2nd flgith return newFlight
  Flight createNewWithBoth(Flight f2) {
    Flight newFlight = new Flight();
    newFlight.seats = seats;
    newFlight.passengers = passengers + f2.passengers;
    return newFlight;
  }
      
  //    public void add1Passenger() {
  //        if(passengers < seats)
  //            passengers += 1;
  //    }
 
  //Methods
  @Override
  public boolean hasNext() {
      return false;
  }
  
  @Override
  public Person next() {
      return null;
  }
  
  //Return Passengers
  private int passengers() { return passengers; }
  
 //Add Ellipse list of passenger(...) since we do not know how many passengers will board plane
 //Loop through the lsit as long as it hasSeating();
  void add1Passenger(Passenger... list) {
    if(hasSeating(list.length)) {
      passengers += list.length;
        for(Passenger passenger : list)
            totalCheckedBags += 
                        passenger.checkedBags;
    }
  }
  
  private boolean hasSeating(int length) { return hasSeating(); }
  //add a passenger if seating is available
 //we may remove since we have ellipse.
  void add1Passenger() {
    if(hasSeating()) 
      passenger += 1;
    else 
      handleToMany();
  }
  
  void add1Passenger(int checkedBags) {
    if(hasSeating()) {
      add1Passenger();
      totalCheckedBags += checkedBags;
    }
  }
  
  @Override
  boolean equals(Object o) {
    if(super.equals(o))
      return true;
    if(!(o instanceOf Flight))
      return false;
    
    Flight other = (Flight) o;
    
    return
        
        flightNumber == other.flightNumber && flightClass == other.flightClass;
  }
  //boolean to return true is less then seats 150;
  private boolean hasSeating() { return passengers < getSeats; }
  
 //return true as long as carryOns is less then maxCarryOns
  private boolean hasCarryOnSpace(int carrysOns) { return totalCarryOns + carryOns <= maxCarryOns;}
  
 //Handle too many if there is not enough space
  private void handleToMany() { System.out.println("Too Much Space"); }
  
  //Accessors && Mutators
  
  int getPassengers() { return passengers; }

  void setPassengers(int passengers) { this.passengers = passengers; }
  
  int getSeats() { return seats = 150;; }
  
 //if seats is less than MAX_FAA_SEATS
 //return this(seats)
  void setSeats(int seats) {
    if(seats  <= MAX_FAA_SEATS)
      this.seats = seats;
    else
      handleToMany();
  }
  int getCheckedBags() { return checkedBags; }
  
  @Override
  String toString() {
    if(flightNumber != null)
      return "Flight #" + flightNumber;
    else if(flightClass != null)
      return "Flight class " + flightClass;
    else
      return "Flight identity not set"
  }
 
     //convert objects into strings
//    @Override
//    public String toString() {
//        if(flightNumber != null)
//            return "Flight #" + flightNumber;
//        else if(flightClass != null)
//            return "Flight Class " + flightClass;
//        else
//            return "Flight identity not set ";
//
//        //create SB builder.
//    }


    @Override
    public String toString() {
        return "Flight{" +
                "passengers=" + passengers +
                ", seats=" + seats +
                ", flightNumber=" + flightNumber +
                ", flightClass=" + flightClass +
                ", isSeatAvailble=" + Arrays.toString(isSeatAvailble) +
                ", checkedBags=" + checkedBags +
                ", totalCheckedBags=" + totalCheckedBags +
                ", maxCarryOns=" + maxCarryOns +
                ", totalCarryOns=" + totalCarryOns +
                ", flightTime=" + flightTime +
                ", crew=" + Arrays.toString(crew) +
                ", roster=" + Arrays.toString(roster) +
                '}';
    }
}
