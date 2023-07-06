
public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue(double cash)
    {
        this.cash = cash;
        
    }
    public RewardValue(int miles)
    {
        this.miles = miles;
        cash =(double) miles*0.0035;
    }
    

    public double getCashValue()
    {
        return cash;
    }

    public double getMilesValue()
    {
       
       
        miles = (int) (cash/0.0035);
        return miles;
        
    }
}
