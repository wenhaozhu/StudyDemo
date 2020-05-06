package SpringBoot.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author: TingTing Wei
 * @create: 5/5/20
 * @project: Final_P1.java
 */
public class Final_P1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("final_p1_input.txt"));
        String[] line = sc.nextLine().split(" ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.print("Input text is:");
        for (String num : line) {
            System.out.print(" "+num);
            if (Integer.parseInt(num) > max) max = Integer.parseInt(num);
            if (Integer.parseInt(num) < min) min = Integer.parseInt(num);
        }
        System.out.println("\nSmallest integer is: "+min+"\nLargest integer is: "+max);
        sc.close();
    }
}
