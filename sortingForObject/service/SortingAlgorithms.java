package sortingForObject.service;

import sortingForObject.model.Phone;

import java.util.ArrayList;

public class SortingAlgorithms {
    private SortingAlgorithms() {
    }

    public static <T extends Comparable<T>> void insertionSort(ArrayList<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            int j = i - 1;
            while (j >= 0 && current.compareTo(list.get(j)) < 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, current);
        }
    }

    private static <T extends Comparable<T>> void swap(ArrayList<T> list, int n, int m) {
        T temp = list.get(n);
        list.set(n, list.get(m));
        list.set(m, temp);
    }

    private static <T extends Comparable<T>> int partition(ArrayList<T> list, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (list.get(i).compareTo(list.get(pivot)) < 0) {
                swap(list, counter, i);
                counter++;
            }
        }
        swap(list, pivot, counter);
        return counter;
    }

    public static <T extends Comparable<T>> void quickSort(ArrayList<T> list, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(list, begin, end);
        quickSort(list, begin, pivot - 1);
        quickSort(list, pivot + 1, end);
    }
}
