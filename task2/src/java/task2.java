import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws FileNotFoundException {

        float x;
        float y;
        float r;

        float xI;
        float yI;

        Scanner in = new Scanner(System.in);
        System.out.print("Задайте адрес файла с координатами и радиусом окружности: ");
        String f1 = in.next();
        System.out.print("Задайте адрес файла с координатами точек: ");
        String f2 = in.next();

        List<String> listOfStrings = new ArrayList<String>();

        Scanner sc = new Scanner(new FileReader(f1));

        String str;

        while (sc.hasNext()) {
            str = sc.next();
            listOfStrings.add(str);
        }

        String[] array = listOfStrings.toArray(new String[0]);
        float [] numbers = new float[array.length];
        int counter = 0;
        for(String number : array) {
            numbers[counter++] = Float.parseFloat(number);
        }
        x = numbers[0];
        y = numbers[1];
        r = numbers[2];

        sc.close();

        List<String> listOfStrings2 = new ArrayList<String>();

        Scanner sc2 = new Scanner(new FileReader(f2));

        String str2;

        while (sc2.hasNext()) {
            str2 = sc2.next();
            listOfStrings2.add(str2);
        }

        String[] array2 = listOfStrings2.toArray(new String[0]);
        float [] numbers2 = new float[array2.length];
        int counter2 = 0;
        for(String number : array2) {
            numbers2[counter2++] = Float.parseFloat(number);
        }

        for (int i=0; i< array2.length; i= i+ 2) {

            xI = numbers2[i];
            yI = numbers2[i+1];

            float xIFinaly = xI - x;
            float yIFinaly = yI - y;

            double hipot = Math.sqrt(Math.pow(xIFinaly, 2) + Math.pow(yIFinaly, 2));

            int g = (i+1)/2;

            if (hipot < r){
                System.out.printf("%d - точка внутри\n",g);
            }
            else if (hipot > r){
                System.out.printf("%d - точка снаружи\n",g);
            }
            else {
                System.out.printf("%d - точка лежит на окружности\n",g);
            }

        }
        sc.close();

    }
}