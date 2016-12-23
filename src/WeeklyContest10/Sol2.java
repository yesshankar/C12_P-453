package WeeklyContest10;

/**
 * Created by Shankar on 11/19/2016.
 */
public class Sol2 {
    public static void main(String[] args) {

    }

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {

        boolean result = false;
        int maxSum = (maxChoosableInteger * (maxChoosableInteger + 1))/2;
        int tempMax = maxChoosableInteger;

        if(desiredTotal < maxSum){
            if(desiredTotal <= maxChoosableInteger)
                result = true;


        }
        else if(desiredTotal == maxSum){
            if(maxChoosableInteger%2 != 0){
                result = true;
            }
        }


        return result;

    }
}
