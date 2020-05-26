package Homework3.Problem1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Problem1 {
    public static void main(String[] args) {
        arrayList();
        System.out.println(" ");
        linkedList();

    }

    public static void arrayList() {
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 99999; i++) {
            arrayList.add("c");
        }

        long beforeArray;
        long afterArray;
        System.out.println(beforeArray = System.currentTimeMillis());
        arrayList.add(0, "a");
        System.out.println(arrayList);
        System.out.println(afterArray = System.currentTimeMillis());
        long substractArray = afterArray - beforeArray;
        System.out.println("The difference in ms before and after adding the value is: " + substractArray + "ms");
    }

    public static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();

        long beforeLinked;
        long afterLinked;
        // if we want to measure the time for adding only one element same as arrayList just de-comment this "for" method and comment the multiple "for" method
        //        for (int i = 0; i < 99999; i++) {
        //            linkedList.add("a");
        //        }

        System.out.println(beforeLinked = System.currentTimeMillis());
        //        linkedList.add(0, "b");

        for(int i =0; i <= 99999; i++){
            for(i = 99999; i <= 999999; i++){
                for(i = 999999; i <= 9999999; i++){
                    for(i = 9999999; i <= 99999999; i++){
                        linkedList.add("a");
                    }
                }
            }
        }

        System.out.println(linkedList);
        System.out.println(afterLinked = System.currentTimeMillis());
        long substractLinked = afterLinked - beforeLinked;
        System.out.println("The difference in ms before and after adding the value is: " + substractLinked + "ms");
    }

}
