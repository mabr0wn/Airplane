package com.pluralsight.airplane;

/**
  *Added to github 8/3
  */
public class CargoOnlyPilot extends Pilot {
  //sets passenger = 0
  @Override
  boolean canAccept(Flight f) { return f.getPassengers() == 0; }
}  
