package Tasks;

public class SecondHighestInArray {
    public static  void main(String[] args){
    int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

    int max = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;

        for (int k = 0; k < numbers.length; k++) {

        if (numbers[k] > max) {
            secondHighest = max;
            max = numbers[k];
        }
        else if (numbers[k] > secondHighest && numbers[k] != max) {
            secondHighest = numbers[k];
        }
    }

        System.out.println("Highest number: " + max);
        System.out.println("Second highest number: " + secondHighest);
}
}
