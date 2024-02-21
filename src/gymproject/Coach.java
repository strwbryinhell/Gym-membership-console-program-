package gymproject;


public class Coach extends Person {
    //below are class attributes
    private static int numOfTrainees;
    private static int numOfCoaches= 3;

    public Coach(String name, long ContactNumber) {
        super(name, ContactNumber);
    }
    
   // class methods 
    
    //setter and getter of number of trainees
    public  void SetNumOfTrainees(int numOfTrainees){
        this.numOfTrainees = numOfTrainees;
   }
    
    public  static int getNumOfTrainees(){
        return numOfTrainees;
    }
    //setter and getter for number of coaches
    public void SetNumOfCoaches(int numOfCoaches){
        this.numOfCoaches= numOfCoaches;
   }
    
    public static  int getNumOfCoaches(){
        return numOfCoaches;
    } 

    
}

