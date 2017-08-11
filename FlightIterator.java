// package com.pluralfight.airplane;

// import java.util.Arrays;
// import java.util.Iterator;

// /**
//   * added to githut on 8/9/17 by MBROWN
//   */
// public class FlightIterator implements Iterator<Person> {
//   //we want to walk through every person on the flight we of course need an array
//   private CrewMember[] crew;
//   private Passenger[] roster;
//   //have a single index[0], [1], [2] that will walk through the entire combined list
//   private int index = 0;
//   lets create an constructor to accept those arrays
//   public FlightIterator (CrewMember[] crew, Passenger[] roster) {
//     //assign those to our memeber variables(up top)
//     this.crew = crew;
//     this.roster = roster;
//   }
  
//   //each time throws back a person
//   @Override
//   public boolean hasNext() {
//     //as long as our index is less than the entire crew array and roster there must be more to come
//     return index < (crew.length + roster.length)
//   }
  
//   @Override
//   public Person next() {
//     //then our next is going to return each individual person
//     //first we will walk through the crew array then the roster array
//     //if the index is less then the crew length, we will return the crew memeber that resovled to that index.
//     Person P = (index < crew.length) ?
//     //here we are doing is give me the crew index if there are three then it will show 3 crew members
//     //otherwise minus index from crew.length which will set back to zero for the start of the roster index
//     crew[index] : roster[index - crew.length];
//     //keep adding an crew or roster
//     index++
//     //return the list
//     return p;
//   }
 
//   @Override
//   public String toString() {
//     return "FlightIterator{" +
//            "crew=" + Arrays.toString(crew) +
//            ", roster=" + Arrays.toString(roster) +
//            ", index=" + index +
//            '}';
   
//   }
// }
