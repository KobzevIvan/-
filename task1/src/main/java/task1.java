import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Задайте длину массива  шага: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int k = 0;
        int i = 1;

        int next;
        do {
            next = 1 + (i + m - 2) % n;
            k++;
            i=next;
        } while (next != 1);
        int t=k;


        int[] arr2 = new int[t];
        k=0;
        i=1;
        next=1;
        do {
            arr2[k]=i;
            next = 1 + (i + m - 2) % n;
            k++;
            i=next;
        } while (next != 1);

        StringBuilder builder = new StringBuilder();
        for (int a : arr2) {
            builder.append(a);
        }
        String text = builder.toString();
        System.out.println(text);


        in.close();
    }
}
