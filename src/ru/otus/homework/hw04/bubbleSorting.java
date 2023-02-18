package ru.otus.homework.hw04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bubbleSorting {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            int rond = (int) (Math.random() * 5000);
            arrayList.add(rond);
            arrayList2.add(rond);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        long startTimeBubbleSorting = System.currentTimeMillis();
        int temp = 0;
        for (int i = arrayList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        long endTimeBubbleSorting = System.currentTimeMillis();
        System.out.println("Время сортировки пузырьком = " + (endTimeBubbleSorting - startTimeBubbleSorting) + " мсек");

       System.out.println(arrayList);


        long startTimeCollectionSort = System.currentTimeMillis();
        Collections.sort(arrayList2);
        long endTimeCollectionSort = System.currentTimeMillis();

       System.out.println(arrayList2);
        System.out.println("Время сортировки Collections.sort = " + (endTimeCollectionSort - startTimeCollectionSort) + " мсек");
    }


}
