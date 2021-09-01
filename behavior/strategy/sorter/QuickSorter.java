package behavior.strategy.sorter;

public class QuickSorter implements Sorter{
    @Override
    public void sort() {
        System.out.println("Quick Sort is invoked! Time Complexity: O(n*logn)");
    }
}
