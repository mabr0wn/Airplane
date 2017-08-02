package com.pluralsight.airplane;
/**
  * added to github by MBROWN 082/17
  */
public class CargoFlight extends Flight {
  float maxCargoSpace = 1000.0f;
  float usedCargoSpace;
  
  public CargoFlight(int flightNumber) {
    super(flightNumber);
  }
}
