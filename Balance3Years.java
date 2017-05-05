
public class Balance3Years
{
    public static void main(String[] args) 
    {
        // E1.4
        double total = 1000;
        System.out.println("First year:" + total);
        double rate = 1.05;
        total *= rate;
        System.out.println("Second year: " + total);
        total *= rate;
        System.out.println("Third year: " + total);
    }
}