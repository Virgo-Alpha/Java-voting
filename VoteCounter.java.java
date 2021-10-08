
/**
 * Write a description of class VoteCounter here.
 * 
 * @Benson Mugure (your name) 
 * @version 1(a version number or a date)
 */
public class VoteCounter
{
    private String candidate1;
    private String candidate2;
    private int candidate1Votes;
    private int candidate2Votes;
    private boolean completed;
    public String result;
    
   public VoteCounter(String candidate1, String candidate2)
   {
       this.candidate1 = candidate1;
       this.candidate2 = candidate2;
       this.candidate1Votes = 0;
       this.candidate2Votes = 0;
       this.completed = false;
   }
   
   public VoteCounter()
   {
       this("CANDIDATE 1", "CANDIDATE 2");
       
       // or could implement as:
       //        this.candidate1 = "CANDIDATE 1";
       //        this.candidate2 = "CANDIDATE 2";
       //        this.candidate1Votes = 0;
       //        this.candidate2Votes = 0;
       //        this.completed = false;
    
    }
    public String getCandidate1(){
        return this.candidate1;
    }
    
    public String getCandidate2(){
        return this.candidate2;
   }
   
   public boolean getCompleted(){
        return this.completed;
   }
   
   public void setCompleted(boolean status){
        this.completed = status;
   }
   
   public String vote(int choice) {
        String result1 = "your vote has been cast";
        String result2 = "invalid choice, no vote cast vote has been cast";
        String result3 = "Apologies, Voting has ended";
        
        if (completed) {
            result = result3;
                }
        else {
           if (choice == 1) {
            this.candidate1Votes += 1;
           result = result1;
           }
           else 
               if(choice == 2){
                this.candidate2Votes += 1;
               result = result1;
                }
                
            else {
        result = result2;
        }
    
    }
    return result;
}
   
    public void printResults() {
    
        int totalVotes = candidate1Votes + candidate2Votes;
        double candidate1Share = ((double) candidate1Votes/totalVotes) * 100;
        double candidate2Share = ((double) candidate2Votes/totalVotes) * 100;
        
        if (totalVotes != 0) {
            if (completed) {
        System.out.format("CANDIDATE - %s\n", this.candidate1);
        System.out.format("received %3.1f percent of the votes\n",
            candidate1Share);
        System.out.format("CANDIDATE - %s\n", this.candidate2);
        System.out.format("received %3.1f percent of the votes\n",
             candidate2Share);
            }
        }
}
}