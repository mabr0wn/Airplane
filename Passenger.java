package com.pluralsight.airplane;

/**
  * Added to gitHub on 8/3/17
  */
public class Passenger {
  private static final int freeBags = 1;
  int checkedBags;
  double perBagFee;
  
  Passenger() {  }
  
  Passenger(int freeBags) {
    this(freeBags > 1 ? 25.0d : 50:0d);
    //this.freebags = freebags;
  }
  
  Passenger(int freeBags, int checkedBags) {
    this(freeBags);
    this.checkedBags = checkedBags;
  }
  
  private Passenger(double perBagFee) { this.perBagFee = perBagFee; }
}
