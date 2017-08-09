package com.pluralsight.airplane;

import java.util.Iterator;

/**
  * Added to github on 8/9/17 by mbrown
  */
public interface Iterable<T>{
  //has one member which is iterator
  //<T> stands for type aka class
  Iterator<T> iterator();
  
  //tells that there is more to come.
  boolean hasNext();
  //the method next which return you back the next thing.
  //in our case it would be the next person
  T next();
}
