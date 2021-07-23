package sortingForObject;

import sortingForObject.model.Phone;

import java.util.ArrayList;
import java.util.Arrays;

import static sortingForObject.service.SortingAlgorithms.insertionSort;
import static sortingForObject.service.SortingAlgorithms.quickSort;

public class SortingMain {
    public static void main(String[] args) {
        Phone phone = new Phone("iphone", "xs", 2018, 300_000);
        Phone phone1 = new Phone("iphone", "12", 2020, 450_000);
        Phone phone2 = new Phone("iphone", "xs max", 2019, 350_000);
        ArrayList<Phone> allPhones = new ArrayList<>(Arrays.asList(phone, phone1, phone2));
        System.out.println("\nafter  insertion sort");
        insertionSort(allPhones);
        System.out.println(allPhones);
        quickSort(allPhones, 0, 2);
        System.out.println("\nafter  quick sort");
        System.out.println(allPhones);
    }


}
