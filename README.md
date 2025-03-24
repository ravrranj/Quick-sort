# Quick-sort
How quick sort works 

Quick Sort is a divide and conquer algorithm that works by selecting a pivot element, partitioning the array around the pivot, and then recursively sorting the left and right subarrays.

🔹 Steps of Quick Sort:
Choose a Pivot: Pick an element as the pivot (commonly the last element, first element, or a random element).

Partitioning:

Rearrange elements so that all smaller elements are to the left of the pivot, and all greater elements are to the right.

The pivot is now in its correct sorted position.

Recursively Apply Quick Sort:

Sort the left and right subarrays separately.

Base Case: When the subarray has one or no elements, it's already sorted.

🔹 Example: Sorting {5, 3, 8, 4, 2, 7, 1, 10}
Choose Pivot: Let's take 10 (last element).

Partitioning:

All elements ≤ 10 stay left: {5, 3, 8, 4, 2, 7, 1} | 10

Pivot 10 is now in its correct position.

Recursively Quick Sort Left Subarray {5, 3, 8, 4, 2, 7, 1}

Choose pivot 1

After partitioning: 1 | {5, 3, 8, 4, 2, 7}

Now sort {5, 3, 8, 4, 2, 7} recursively.

Continue Until Fully Sorted

Eventually, every pivot gets placed correctly, leading to a sorted array.


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



Worst case happens when Quick Sort keeps making unbalanced partitions (like sorted arrays with bad pivot selection).

Use random or median-of-three pivots to avoid the O(n²) worst case.

Merge Sort is always O(n log n) but needs extra space, whereas Quick Sort can be optimized for better performance in practice.

However, in practice, Quick Sort is usually faster than Merge Sort because:
✅ Average-case complexity is O(n log n) (better pivot selection leads to balanced partitions).
✅ It sorts in-place (no extra space like Merge Sort's O(n) auxiliary space).
✅ Cache-friendly & efficient in real-world scenarios.

To avoid the worst-case, we can use:
👉 Randomized Quick Sort (choosing a random pivot).
👉 Median-of-Three pivot selection.


