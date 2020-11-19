import java.util.Random;

public class LuckyDip {

    private static int[] deltas(int[] array) {
        int i;
        int[] delta = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        for (i = 0; i < 15; i++) {
            delta[i] = array[i+1] - array[i];
            // System.out.println(delta[i]);
        }

        return delta;
    }

    private static int sum(int[] array) {
        int i;
        int sum = 0;

        for (i = 0; i < 16; i++) {
            sum += array[i];
        }

        return sum;
    }

    private static int range(int[] array) {
        int i;
        int highest = 0;
        int lowest = 16;

        for (i = 0; i < 16; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }

        return highest - lowest;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int num;
        int i;
        int[] randArray = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        for (i = 0; i < 16; i++) {
            num = rand.nextInt(16);
            num += 1;
            randArray[i] = num;
        }

        for (i = 0; i < 16; i++) {
            System.out.println(randArray[i]);
        }

        System.out.println("range = " + range(randArray));
        System.out.println("sum = " + sum(randArray));
        System.out.println("deltas = " + deltas(randArray));
    }

}
