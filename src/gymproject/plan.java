package gymproject;


public class plan {

    
    public plan (){
        
    }
    public plan(String name,long memberID ){
    }
    
    public static void startingPlan (){
    String [] startingPlan = {"yoga class","boxing class","1 cardio session with a coach"};
for(int i=0;i<startingPlan.length;i++){
    System.out.print("-"+startingPlan[i]);
    System.out.print("- \n");
    }
}
  public static void  upgradedPlan(){
    String []upgradedPlan= {"yoga class","boxing class","3 cardio sessions with a coach","weekly health check up"};
for(int i=0;i<upgradedPlan.length;i++){
    System.out.print("-"+upgradedPlan[i]);
    System.out.print("- \n");   
  }
  }
  public static void  ultimatePlan(){
    String []ultimatePlan={"yoga class","boxing class","3 cardio sessions with a coach","weekly health check up"
            ,"free advice sessions with your preferred coach","two new activities each month"
    };
for(int i=0;i<ultimatePlan.length;i++){
    System.out.print("-"+ultimatePlan[i]);
    System.out.print("- \n");   
     
}
  }
}