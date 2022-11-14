import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class task3 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        System.out.print("Задайте адрес файла  содержимым: ");
        String f1 = in.next();

        List<String> listOfStrings = new ArrayList<String>();

        Scanner sc = new Scanner(new FileReader(f1));

        String str;

        while (sc.hasNext()) {
            str = sc.next();
            listOfStrings.add(str);
        }

        String[] array = listOfStrings.toArray(new String[0]);
        int [] nums = new int[array.length];
        int counter = 0;
        for(String number : array) {
            nums[counter++] = Integer.parseInt(number);
        }

        sc.close();

        Arrays.sort(nums);
        int v = nums[(array.length)/2];
        int steps = 0;

        for(int number : nums) {
            steps = steps + abs(number - v);
        }
        System.out.println(steps);

    }
}
