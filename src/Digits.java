import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num){
        digitList = new ArrayList<>();

        if (num < 10){
            digitList.add(num);
        } else {
            while (num > 0){
                int numVal = num % 10;
                digitList.add(0, numVal);
                num = num / 10;

            }


        }
    }


    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing(){
        if (digitList.size() < 2) {
            return true;
        }
        for (int i = 0; i < digitList.size() - 1; i++){
            if (digitList.get(i) >= digitList.get(i + 1)){
                return false;
            }
        }

        return true;
    }


}

