import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits = twoDigits();
        int greaterThan500 = greaterThan500();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double mean = mean();
        //int mode = mode();
        System.out.println("THIS IS THE START OF THE CODE");
        System.out.println(" ");
        System.out.println("odds: " + odds);
        System.out.println("evens: " + evens);
        System.out.println("two digits: " + twoDigits);
        System.out.println("greater than 500: " + greaterThan500);
        System.out.println("greatest: " + greatest);
        System.out.println("least: " + least);
        System.out.println("sum: " + sum);
        System.out.println("mean: " + mean);
        //System.out.println("mode: " + mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;
        int num = 0;
        while (s.hasNext()) {
            num = s.nextInt();
            if (num > 9 && num < 100)
                twoDigits++;
        }
        return twoDigits;
    }

    public static int greaterThan500() throws FileNotFoundException{
        s = new Scanner(f);
        int greaterThan500 = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                greaterThan500++;
        }
        return greaterThan500;
    }

    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext()) {
            if (s.nextInt() > greatest) {
                greatest = s.nextInt();
            }
        }
        return greatest;
    }


    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 10000;
        while (s.hasNext()) {
            if (s.nextInt() < least) {
                least = s.nextInt();
            }
        }
        return least;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }

    public static double mean() throws FileNotFoundException{
        s = new Scanner(f);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (s.hasNext()) {
            nums.add(s.nextInt());
        }
        double sum = sum();
        double mean = sum/nums.size();
        return mean;
    }

    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (s.hasNext()) {
            nums.add(s.nextInt());
        }

        int maxCount = 0;
        int mode = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == nums.get(i)) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = nums.get(i);
            }
        }

        return mode;
    }
}