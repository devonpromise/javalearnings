package flight;

//final public to prevent inheritance
public class Passenger implements Comparable<Passenger> {

    private String name;

    public static class RewardProgram{
        private int memberLevel; // 3  (1st Priority), 2, 1
        private int memberDays;

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }
    }

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    private RewardProgram rewardProgram = new RewardProgram();

    int val;
    int checkedBags;

    public Passenger(int val, int checkedBags) {
        this.val = val;
        this.checkedBags = checkedBags;
    }

    public Passenger(String name) {
        this.name = name;
    }

    int getCheckedBags(){
        return this.checkedBags;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        rewardProgram.memberLevel = memberLevel;
        rewardProgram.memberDays = memberDays;
    }

    //Generic interfaces  - JAVA generics
    public int compareTo(Passenger p){
       // Passenger p = (Passenger) o;
        int returnValue = p.rewardProgram.memberLevel - rewardProgram.memberLevel;

        if (returnValue == 0)
                returnValue = p.rewardProgram.memberDays -  rewardProgram.memberDays;

        return returnValue;
    }
}
