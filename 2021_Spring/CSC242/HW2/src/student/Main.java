package student;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

    static boolean LLTEST1 = true;
    static boolean LLTEST2 = true;

    public static void main(String[] args) {
        if (LLTEST1){
            LinkedListDS<Integer> testOne = new LinkedListDS<Integer>();
            System.out.println("Getting the size: " + testOne.size());

            testOne.add(1);
            System.out.println("Getting 1st Value: " + testOne.get(1));
            System.out.println("Getting the size: " + testOne.size());

            testOne.add(2);
            System.out.println("Getting 2nd Value: " + testOne.get(2));
            System.out.println("Getting the size: " + testOne.size());

            testOne.add(3);
            System.out.println("Getting 3rd Value: " + testOne.get(3));
            System.out.println("Getting the size: " + testOne.size());

            try {
                System.out.println("Getting 4th Value: " + testOne.get(4));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(ex);
            }

            System.out.println("Getting the size: " + testOne.size());

            System.out.println("Clearing the Linked List: ");
            testOne.clear();
            System.out.println("Getting the size: " + testOne.size());

            Integer[] list = new Integer[]{1, 2, 3, 4};
            testOne.addAll(1, Arrays.asList(list));
            System.out.println("Getting the size: " + testOne.size());
        }

        if (LLTEST2){

        }
    }
}
