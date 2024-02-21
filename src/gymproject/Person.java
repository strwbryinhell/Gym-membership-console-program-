package gymproject;

public abstract class Person  {
    private String name;
    private long ContactNumber;
    
    public Person(String name,long ContactNumber){
        this.name=name;
        this.ContactNumber=ContactNumber;
    }
    
    @Override
    public String toString(){
        return"";
    }
    public String getName(){
        return name;
    }
public long getContact(){
    return ContactNumber;
}    

    public static void helloThere(){
        System.out.println("a \"hello there! im in this gym too!\" message has been sent to them!");
    }
    public static void bonusClass(){
        System.out.println("we highly encourage you to workout together, everything is better with friends!");
        System.out.println("so, a bonus service with them has been added to your plan!");
        System.out.println("the service:"+ associateCoach.BONUS);
        
    }
}
