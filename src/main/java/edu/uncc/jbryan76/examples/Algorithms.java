package edu.uncc.jbryan76.examples;

import java.util.List;

public class Algorithms {

    // BinarySearch is an efficient searching algorithm that only works on sorted arrays.
    // The goal of binary search is to halve the searched array with each iteration creating a runtime of O(log n)
    public int iterativeBinarySearch(int value, List<Integer> array) {
        // Use a low and high index to narrow the search, start with the whole array
        int low = 0;
        int high = array.size()-1;

        // We want to run this algorithm until our search is narrowed to only 2 elements
        // i.e. low is 0, high is 1: the element has to be at either index 0 or 1
        // therefore our while look will not actually look for the value, only narrow the search
        while (high - low > 1) {
            // The mid should be calculated on each iteration. We do high plus low divided by 2
            // because we want to select the value between high low
            // i.e: low 20, high 30 - (30+20)/2 = 25 (valid middle index)
            int mid = (high + low) / 2;

            // Using this mid we narrow the search. We know that the array is sorted, so we can compare this middle value
            if (array.get(mid) > value) {
                // If the middle is more than the value we want to focus on the left half of the array, so we move the high.
                high = mid-1;
            }
            else if (array.get(mid) < value) {
                // If the middle is less than the value we want to focus on the right half of the array, so we move the low.
                low = mid+1;
            } else {
                // If the value isn't more than or less than it has to be equal to, we can return the index early
                return mid;
            }
        }

        // At this point, the answer should be between two options: high and low index
        if (array.get(low) == value) {
            // The low value is equal to the search value we can return the low index
            return low;
        }
        else if (array.get(high) == value) {
            // The high value is equal to the search value we can return the high index
            return high;
        }

        // Neither high nor low, the value is not found, so we can return -1
        return -1;
    }

    // We're completing the same algorithm as above so the concept is largely the same.
    // Since we are using recursion there is no explicit loop, we just call the function again
    public int recursiveBinarySearch(int value, List<Integer> array, int low, int high) {
        // We don't define high and low because it is passed as an argument.
        // But we still calculate the mid
        int mid = (high + low) / 2;

        // Our condition has changed, we want to iterate until high is less than low
        // Because we will continue to either add one to the low or subtract one from the high
        // Meaning eventually low will be more than high and the element should be found
        if (high >= low) {
            // The middle value is equal to the search value so we can return mid
            if (array.get(mid) == value) {
                return mid;
            }
            else if (array.get(mid) > value) {
                // The middle is more than the value, so we narrow to the left half
                // This is what starts the recursion, notice instead of setting the values
                // We call the function again with our changed arguments and return that result
                return recursiveBinarySearch(value, array, low, mid-1);
            } else {
                // If it is not equal to or more than it has to be less than, so we focus on the right half
                return recursiveBinarySearch(value, array, mid+1, high);
            }
        }

        // If we haven't returned by the time the low is more than the high
        // we pass -1 back up to call stack because value isn't found.
        return -1;
    }
}
