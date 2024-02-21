
package gymproject;

public class schedule {
    private static int numOfVisitors= 15;
    private static int visitorLimit= 20;
    
 public schedule(String name,long ContactNumber)  {
     
 }
 public static void fullScheduling(){
    System.out.println("uh oh! the visitor limit of "+visitorLimit+" people has been reached!pick another date");
 }
 public static void  days(){
     System.out.println("1-thursday 1pm");
     System.out.println("2-thursday 4pm");//busy day
     System.out.println("3-friday 6pm");
     System.out.println("4-friday 8pm");  //busy day
     System.out.println("PLEASE NOTE: our usual number of visitors each day is: "+ numOfVisitors);
 }
}
