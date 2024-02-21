
package gymproject;

public class Member extends Person {
    private String memberID ;
    private String coachName ;
     private String name ;

    public Member(String name, long ContactNumber) {
        super(name, ContactNumber);
    }
    
   
    
    public void setMemberCard(String name ,String memberID){
    this.name =name ;
    this.memberID = memberID;
}
    public String getMemberCard (){
    return "~~ member name:"+name+", member ID: "+memberID+"~~";
   
    }
    
   public void setMemberID(String memberID ){
       this.memberID= memberID;
   }
    
    public String getMemberID(){
        return memberID;
    }
    
     
   public void setCoachName(String coachName ){
      this.coachName= coachName;
   }
   
    public String getCoachName(){
        return coachName;
    }
    
    @Override
    public String toString(){
    return "MemberCard : "+ getMemberCard () + "coach name :" + coachName ;}

}