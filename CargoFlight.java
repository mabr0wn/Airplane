package com.pluralsight.airplane;
/**
  * added to github by MBROWN 082/17
  */
public class CargoFlight extends Flight {
  float maxCargoSpace = 1000.0f;
  float usedCargoSpace;
  
 CargoFlight(int flightNumber) {
    super(flightNumber);
   
  }
 
 CargoFlight(int flightNumber, float maxCargoSpace) {
  this(flightNumber);
  this.maxCargoSpace = maxCargoSpace;
 }
 
 CargoFlight() {
 
 }
 
 Cargoflight(float maxCargoSpace) {
  this.maxCargoSpace = maxCargoSpace;
 }
 
 //method

 void add1Package(float h, float w, float d){
  double size = h * w * d;
  if(hasCargoSpace((float) size))
    usedCargoSpace += size;
  else
    handleNoSpace();
 }
 
 private boolean hasCargoSpace(float size) {
  return usedCargoSpace + size <= maxCargoSpace //1000.0f
   }
 private void handleNoSpace() {
  System.out.println("Not Enough Space");
 }
 
 @Override
 int getSeats() { return 12; }
 
 
}
