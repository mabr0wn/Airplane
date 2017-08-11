package com.pluralsight.airplane;

/**
  *Added to github 8/3
  */
public class CrewMember extends Person {
 //need to have a constant of a filename we want to load from
  private final static String FILENAME = "C:\\Users\mattd429\Desktop\CrewMembers.txt";
  //need to have an array of CrewMembers
  private static CrewMembers[] pool;
  private FlightCrewJob job;
 
  //then have your FindAvailable Static Method
  //look for a crewmember who is not already assigned to that job.
  public static CrewMember
    FinaAvailable(FlightCrewJob job) {
    //have a avariable to hold the matching CrewMember
    CrewMember cm = null;
    //loop through the pool crewMembers
    for(int i = 0; i < pool.length; i++) {
     //then inside there we basically want to check
     //is there is a valid spot in the pool
     //is the job matches then we know we want that person
     if(pool[i] != null && pool[i].jon == job) {
      //store a reference of them to the pool
      cm = pool[i];
      //will remove them from the pool for two different jobs
      pool[i] = null;
      break;
     }
    }
    return cm;
  }
  //this will run before anything else in this class
  //this is where static initialization blocks will play the part
  //the question is how does the pool get initailized from the file.txt(FILENAME), it would be nice to know the pool field will get automatically loaded prior to our first use.
  //we have to wrap it in a try, catch since we have to handle all checked exceptions
  //static intializer are aways marked static outside of any method or constructor
  //will only run once
  static{
    //we want to read from the so we will start our buffer reader
    BufferedReader reader = null;
    try{
        //we need to add the FileReader to read the constant file.
        reader = new BufferedReader(new FileReader(FILENAME));
        //need to have the variable String read each line from the file
        String line = null;
        //start the index with[0], to track our way through the array
        int idx = 0;
        //allocate some space in the array
        //will load the pool array prior to our first use
        pool = new CrewMember[10];
        //then we will start reading through the file
        while ((line = reader.readLine()) != null) {
         //read the line and split it into its parts look for the ","
         //first part is the string representing their job[0] second is their name[1]
         String[] parts = line.split(",");
         FlightCrewJob job = 
                   //We want to map that string into our flightCrewJob enum
                   //As long as the case sensitive matches out enum values we can use the valueOf method
                   FlightCrewJob.valueOf(parts[0]);
                   //go ahead and create an instance of crew member based on that job
         pool[idx] = new CrewMember(job);
         //set their name from value insde the file
         pool[idx].setName(parts[1]);
         //then index through the array of [10]
         idx++;
        }
     //show me the IOException if it can not read the local file
    } catch(IOException e) {
      //will show me the error
    }
   
  }//will create a toString()
  
  CrewMember(FlightCrewJob job) { this.job = job; }
  void setJob(FlightCrewJob job) { this.job = job; }
  
  }
