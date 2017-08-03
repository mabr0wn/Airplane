package com.pluaralsight.airplane;

/**
  *Added to github on 8/3
  */
public abstract class Pilot {
  private Flight currentFlight;
  
  void fly(Flight f) {
    if(canAccept(f))
      currentFlight = f;
    else
       handleCantAccept();
  }
  
  abstract boolean canAccept(Flight f);
  
  private void handleCantAccept() { System.out.println("Can't Accept"); }
}  
