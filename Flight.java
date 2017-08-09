package com.pluralsight.airplane;

import java.util.Arrays;
import java.util.Iterator;

/**
  *Added to github 8/9/17
  */

public class Flight implements Comparable<Flight>, Iterator<Person> {
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
  {
    isSeatsAvailable = new boolean[seats];
    for (int i = 0; i < seats; i++)
      isSeatsAvailable[i] = true
  }
  
  Flight() { }

  Flight(Integer flightNumber) {
          this.flightNumber = flightNumber;
  }
  
  Flight(Character flightClass) {
    this.flightClass = flightClass;
  }
  
  boolean hasRoom(Flight f2) {
    int total = passengers + f2.passengers();
    return total <= seats;
  }
  
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
  
  void add1Passenger(Passenger... list) {
    if(hasSeating(list.length)) {
      passengers += list.length;
        for(Passenger passenger : list)
            totalCheckedBags += 
                        passenger.checkedBags;
    }
  }
  
  private boolean hasSeating(int length) { return hasSeating(); }
  
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
  
  private boolean hasSeating() { return passengers < getSeats; }
  
  private boolean hasCarryOnSpace(int carrysOns) { return totalCarryOns + carryOns <= maxCarryOns;}
  
  private void handleToMany() { System.out.println("Too Much Space"); }
  
  //Accessors && Mutators
  
  int getPassengers() { return passengers; }

  void setPassengers(int passengers) { this.passengers = passengers; }
  
  int getSeats() { return seats = 150;; }
  
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
}
