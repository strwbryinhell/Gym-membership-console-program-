
package gymproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GYMprojectEDIT {

    public static void main(String[] args) {
    
        Scanner scan= new Scanner(System.in);
        //coaches
        Person coach1 = new Coach("khlood",533921);
        Person coach2 = new Coach("abeer",48889);
        Person coach3 = new Coach("lana",28331);
        //starting point
              String name= JOptionPane.showInputDialog("hello there! please enter your name to join! :D");
        System.out.println("welcome "+name+" !");
        long contactNumber= Long.parseLong(JOptionPane.showInputDialog("please enter your contact number!"));
        Member member = new Member(name,contactNumber);
        JOptionPane.showMessageDialog(null,"please move to the output console! :D");
        //console
        System.out.println("to finish signing up, we need a password from you: ");
        String password= scan.next();
        System.out.println("please refrain from sharing this password to anyone else");
        System.out.println("you will also be asked to type this password later on, so you better remember it!");
        System.out.println("--------------------------------------");
       System.out.println("okay great! you are now a member of our gym.");
       System.out.println("now its time for you to be as creative as you can be!");
       System.out.println("make a unique ID for you as a member, it can be whatever you like!");
       System.out.println("we always encourage creativity!");
       String memberID = scan.next();
       member.setMemberID(memberID);
        System.out.println("--------------------------------------");       
       System.out.println("alright! your member ID is: "+ member.getMemberID());
       member.setMemberCard(name,memberID);
       System.out.println("your member card is now ready! how exciting!");
       System.out.println(member.getMemberCard());
       System.out.println("--------------------------------------");       
       
              System.out.println("ooh! your current plan is: ");
                    plan.startingPlan();
                     System.out.println("press 0 to leave the website or 1 to view other plans");
                     int num1 = scan.nextInt();
                     System.out.println("--------------------------------------"); 
        switch (num1) {
            case 1:
                System.out.println("the other plans are: upgraded plan");
                plan.upgradedPlan();
                System.out.println("ultimate plan:");
                plan.ultimatePlan();
                System.out.println("--------------------------------------");
                break;
            case 0:
                Review.goodbye();
                System.exit(0);                 
                break;
            default:
                System.out.print("invalid! please only pick 0 or 1!: ");
                int secondNum = scan.nextInt();
                 switch(secondNum){
                     case 0:
                Review.goodbye();
                System.exit(0);                 
                break;
                     case 1:
                System.out.println("the other plans are: upgraded plan");
                plan.upgradedPlan();
                System.out.println("ultimate plan:");
                plan.ultimatePlan();
                System.out.println("--------------------------------------");
                break;
                     default:
                   System.out.println("you dont seem to follow the guidelines...");
                   System.out.println("so, unfortunatly..");
                   Review.goodbye();
                   System.exit(0);
                   break;                         
                 }
                 //inner switch bracket
                 
                break;
        }
        //above is  outer switch case bracket
        System.out.println("if you would like to keep your current plan press 0");
        System.out.println("if you would like to upgrade to upgraded plan press 1");        
        System.out.println("if you would like to upgrade to ultimate plan press 2");     
        int num2 = scan.nextInt();
        
                switch (num2) {
            case 0:
                System.out.println("nice, sticking with the original! you are keeping your starting plan!");
                System.out.println("--------------------------------------");
                break;
            case 1:
                System.out.println("congrats! you have upgraded to the upgraded plan!!");
                System.out.println("your available services are:");
                plan.upgradedPlan();
                System.out.println("a payment billing message will be sent to your contact number: "+member.getContact());
                System.out.println("--------------------------------------");                
                break;
            case 2:
                System.out.println("congrats! you have upgraded to the ultimate plan!!");
                System.out.println("your available services are:");
                 plan.ultimatePlan();
                 System.out.println("a payment billing message will be sent to your contact number: "+member.getContact());
                System.out.println("--------------------------------------");                
                break;
            default:
                System.out.println("invalid! please pick only 0,1 or 2!: ");
                int thirdNum= scan.nextInt();
                switch(thirdNum){
            case 0:
                System.out.println("nice, sticking with the original! you are keeping your starting plan!");
                System.out.println("--------------------------------------");
                break;
            case 1:
                System.out.println("congrats! you have upgraded to the upgraded plan!!");
                System.out.println("your available services are:");
                plan.upgradedPlan();
                System.out.println("a payment billing message will be sent to your contact number: "+member.getContact());
                System.out.println("--------------------------------------");                
                break;
            case 2:
                System.out.println("congrats! you have upgraded to the ultimate plan!!");
                System.out.println("your available services are:");
                 plan.ultimatePlan();
                 System.out.println("a payment billing message will be sent to your contact number: "+member.getContact());
                System.out.println("--------------------------------------");                
                break;
            default:
                   System.out.println("you dont seem to follow the guidelines...");
                   System.out.println("so, unfortunatly..");
                   Review.goodbye();
                   System.exit(0);
                   break;                 
                    
                }
                //inner switch bracket
        }
        //above is the second switch case bracket
        System.out.println("now that we are done with that, we need to set you up with a coach!");
        System.out.println("if you have a coach in mind, press 0, or if you would like to see our available coaches press 1");
        int num3 = scan.nextInt();
        
        switch (num3) {
            case 0:
            System.out.println("wonderful! please enter their name:");
            String coachName= scan.next();
            System.out.println("now enter their contact number:");
            long coachcontactNumber= scan.nextLong();
             Person coach4 = new Coach(coachName,coachcontactNumber);
             System.out.println("well done! your coach is: "+ coach4.getName());
             Person.helloThere();
             Person.bonusClass();
             System.out.println("--------------------------------------");             
             break;
            case 1:
            System.out.println("well, our "+Coach.getNumOfCoaches()+" available coaches are:");
            System.out.println(coach1.getName());
            System.out.println(coach2.getName());
            System.out.println(coach3.getName());  
            System.out.println("press 1,2 or 3 respectivly for the coach you would like to train with");
            int coachNum= scan.nextInt();
                                if(coachNum==1){
                        Coach C = new Coach(coach1.getName(),coach1.getContact());
                        System.out.println("well done! your coach is: "+ C.getName());
                    }
                    else if (coachNum==2){
                        Person C= new Coach(coach2.getName(),coach2.getContact());
                        System.out.println("well done! your coach is: "+ C.getName());                        
                    }
                    else if (coachNum ==3){
                        Person C = new Coach(coach3.getName(),coach3.getContact());
                        System.out.println("well done! your coach is: "+ C.getName());                        
                    }
            break;
            default:
                System.out.println("invalid! please only pick 0 or 1!: ");
                int fourthNum= scan.nextInt();
                switch(fourthNum){
             case 0:
            System.out.println("wonderful! please enter their name:");
            String coachNAME= scan.next();
            System.out.println("now enter their contact number:");
            long coachcontactNUMBER= scan.nextLong();
             Person coachFOUR = new Coach(coachNAME,coachcontactNUMBER);
             System.out.println("well done! your coach is: "+ coachFOUR.getName());
             Person.helloThere();
             Person.bonusClass();
             System.out.println("--------------------------------------");             
             break;
            case 1:
            System.out.println("well, our "+Coach.getNumOfCoaches()+" available coaches are:");
            System.out.println(coach1.getName());
            System.out.println(coach2.getName());
            System.out.println(coach3.getName());  
            System.out.println("press 1,2 or 3 respectivly for the coach you would like to train with");
            int coachNUM= scan.nextInt();
                                if(coachNUM==1){
                        Coach C = new Coach(coach1.getName(),coach1.getContact());
                        System.out.println("well done! your coach is: "+ C.getName());
                    }
                    else if (coachNUM==2){
                        Person C= new Coach(coach2.getName(),coach2.getContact());
                        System.out.println("well done! your coach is: "+ C.getName());                        
                    }
                    else if (coachNUM ==3){
                        Person C = new Coach(coach3.getName(),coach3.getContact());
                        System.out.println("well done! your coach is: "+ C.getName());                        
                    }
            break;  
            default:
                   System.out.println("you dont seem to follow the guidelines...");
                   System.out.println("so, unfortunatly..");
                   Review.goodbye();
                   System.exit(0);
                   break;                 
                              
                }
                //inner switch bracket
                break;              
        }
        
        //above is third switch case bracket

 System.out.println("now lets get to scheduling!");
 System.out.println("please pick one of the following days to schedule a session with your coach");
 System.out.println("and also make sure to choose EXACTLY one of those numbers to avoid any errors");
 System.out.println("a lot of members often race for certain times so please refrain from holding back the scheduling process");
 schedule.days();
   int num4 = scan.nextInt();
   switch(num4){
       case 1: 
           System.out.println("alright! you have scheduled a session at: thursday 1pm");
       break;
       case 2: 
           //CASE 2
           schedule.fullScheduling();
           System.out.println("the current available dates are: thursday 1pm, friday 6pm.");
           System.out.println("would: thursday 1pm. be alright with you?(yes or no answer please)");
           String answer = scan.next().toLowerCase();
           if (answer.equals("yes"))
               System.out.println("alright! you have scheduled a session at: thursday 1pm");
           else if(answer.equals("no")){
           System.out.println("would: friday 6pm. be alright with you?(yes or no answer please)");
           String answer2 = scan.next().toLowerCase();   
           if(answer2.equals("yes"))
               System.out.println("alright! you have schedules a session at: friday 6pm.");
           else{
               System.out.println("hmm..looks like you dont like any of the available dates");
               System.out.println("check back later for updated dates and timings!");
           }               
           }
           else{
               System.out.println("you dont seem to follow the given guidelines..");
               System.out.println("maybe check back later when you are ready to schedule properly!");               
           
           }
           //END OF CASE2
           break;
       case 3:   
           System.out.println("alright! you have scheduled a session at: friday 6pm.");
       break;  
       case 4:
           //CASE 4
           schedule.fullScheduling();
           System.out.println("the current available dates are: thursday 1pm, friday 6pm.");
           System.out.println("would: thursday 1pm. be alright with you?(yes or no answer please)");
           String answer3 = scan.next().toLowerCase();
           if (answer3.equals("yes"))
               System.out.println("alright! you have scheduled a session at: thursday 1pm");
           else if(answer3.equals("no")){
           System.out.println("would: friday 6pm. be alright with you?(yes or no answer please)");
           String answer4 = scan.next().toLowerCase();   
           if(answer4.equals("yes"))
               System.out.println("alright! you have schedules a session at: friday 6pm.");
           else{
               System.out.println("weird..looks like you dont like any of the available dates");
               System.out.println("check back later for updated dates and timings!"); 
           }
           }
           else{
              System.out.println("you dont seem to follow the given guidelines..");
               System.out.println("maybe check back later when you are ready to schedule properly!");               
           }
           break;
           //END OF CASE4
       default:
               System.out.println("weird..looks like you dont like any of the available dates");
               System.out.println("check back later for updated dates and timings!");  
               break;
   }
   //above is the fourth switch bracket
   System.out.println("--------------------------------------");    
   System.out.println("for security purposes, we need your password again to make sure its really you! ");
   String secondPass = scan.next();
    if(secondPass.equals(password)){
        System.out.println("well done! we hope you dont forget this password!");
        System.out.println("--------------------------------------");       
    }
    else{
     System.out.println("oh no! you got it wrong unfortunatly! you now have 1 more try: ");
     String thirdPass= scan.next();
         if(thirdPass.equals(password)){
        System.out.println("well done! we hope you dont forget this password again!");
        System.out.println("--------------------------------------"); 
         }
         else{
         System.out.println("oh no! you got it wrong AGAIN!");
         Review.goodbye();   
        System.exit(0);         
         }
    }
   
   Review.getQuestionText();
   int num5 = scan.nextInt();
   switch (num5){
       case 0:
           Review.goodbye();
        System.exit(0);            
           break;
       case 1:
           Review.rating();
           Review.goodbye();  
           System.exit(0);
           break;
       default:
           System.out.println("invalid! please enter eith 0 or 1");
           int num6= scan.nextInt();
           switch(num6){
               case 0:
                   System.exit(0);
               case 1:
           Review.rating();
           Review.goodbye();  
           System.exit(0);
           break;
               default:
                   System.out.println("you dont seem to follow the guidelines...");
                   System.out.println("so, unfortunatly..");
                   Review.goodbye();
                   System.exit(0);
                   break;
           }
   }
   //above is the fifth switch bracket
        
        
    }
    //above is main class bracket

}

    

