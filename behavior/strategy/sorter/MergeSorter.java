package behavior.strategy.sorter;

public class MergeSorter implements Sorter{
    @Override
    public void sort() {
        System.out.println("Merge Sort is invoked! Time Complexity: O(n*logn)");
    }
}
