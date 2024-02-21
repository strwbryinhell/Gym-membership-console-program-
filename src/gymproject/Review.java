
package gymproject;
import java.util.Scanner;

public class Review {

static Scanner sc= new Scanner (System.in);

private static String questionText="press 0 to leave the website or 1 to give a review on our website!";
private static int rate;
public Review(String memberName,String CoachName){
    
}
public static  void rating(){
System.out.println("Please rate our website out of 10");
 rate = sc.nextInt();
System.out.println("you rate our website "+rate+" out of 10, Thank you for rating us!");
}
public static void goodbye() {
  System.out.println("You are leaving the website now. Thank you for visiting !"); 
}
    static void getQuestionText() {
        System.out.println(questionText);
    }
}

