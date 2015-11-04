public class Dice
{
    private int low;
    private int high;
    
    public Dice(int low, int high) //constructor
    {
        this.low = low;
        this.high = high;
    }
    
    public int GetLowBound()
    {
        return low;
    }
    
    public int GetHighBound()
    {
        return high;
    }
    
    public int GetANumber()
    {
        int gameNum = low +(int)(Math.random()*high);
        return gameNum;
    }
    
}