package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<StudentWithGPA> {
    @Override
    public int compare(StudentWithGPA o1, StudentWithGPA o2) {
        if (o1.getGpa() < o2.getGpa()) return -1;
        if (o1.getGpa() > o2.getGpa()) return 1;
        return 0;
    }

    public void quickSort(StudentWithGPA[] students, int low, int high){
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        double pivot = students[low + (high - low) / 2].getGpa();

        // Divide into two lists
        StudentWithGPA exchange;
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (students[i].getGpa() < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (students[j].getGpa() > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange = students[i];
                students[i] = students[j];
                students[j] = exchange;
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quickSort(students, low, j);
        if (i < high)
            quickSort(students, i, high);
    }

}
