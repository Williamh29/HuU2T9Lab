public class LuckyNumbers
{
    public int randomIntegerBetween(int min, int max)
    {
        int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        return randomNum;
    }
    public String getLuckyNumbers()
    {
        int num1 = randomIntegerBetween(1, 65);
        int num2 = randomIntegerBetween(1, 65);
        int num3 = randomIntegerBetween(1, 65);
        int num4 = randomIntegerBetween(1, 65);
        int num5 = randomIntegerBetween(1, 65);
        int superBall = randomIntegerBetween(1, 30);
        String str = "Your lucky numbers are: ";
        str += num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + "\n";
        str += "The super ball is: " + superBall;

        return str;
    }
}
