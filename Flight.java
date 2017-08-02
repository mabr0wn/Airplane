public class Flight {
  static final int MAX_FAA_SEATS = 550;
  private int passengers, seats = 150;
  private Integer flightNumber;
  private Character flightClass;
  private boolean[] isSeatsAvailable;
  int totalCheckedBags;
  int maxCarryOns = seats * 2, totalCarryOns;
  //Initializer
  {
    isSeatsAvailable = new boolean[seats];
    for (int i = 0; i < seats; i++)
      isSeatsAvailable[i] = true
  }
  
  flight() { }

  flight(int flightNumber) {
          this.flightNumber = flightNumber;
  }
  
  
}
