package sortingForObject.service;

import sortingForObject.model.Phone;

import java.util.ArrayList;

public class SortingAlgorithms {
    private SortingAlgorithms() {
    }

    public static void insertionSort(ArrayList<Phone> allPhones) {
        for (int i = 1; i < allPhones.size(); i++) {
            Phone current = allPhones.get(i);
            int j = i - 1;
            while (j >= 0 && current.compareTo(allPhones.get(j)) < 0) {
                allPhones.set(j + 1, allPhones.get(j));
                j--;
            }
            allPhones.set(j + 1, current);
        }
    }

    private static void swap(ArrayList<Phone> phones, int n, int m) {
        Phone temp = phones.get(n);
        phones.set(n, phones.get(m));
        phones.set(m, temp);
    }

    private static int partition(ArrayList<Phone> phones, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (phones.get(i).compareTo(phones.get(pivot)) < 0) {
                swap(phones, counter, i);
                counter++;
            }
        }
        swap(phones, pivot, counter);
        return counter;
    }

    public static void quickSort(ArrayList<Phone> allPhones, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(allPhones, begin, end);
        quickSort(allPhones, begin, pivot - 1);
        quickSort(allPhones, pivot + 1, end);
    }
}
