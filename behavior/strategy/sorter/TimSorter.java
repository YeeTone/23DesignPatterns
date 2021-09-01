package behavior.strategy.sorter;

public class TimSorter implements Sorter{

    @Override
    public void sort() {
        System.out.println("Tim Sort is invoked! Time Complexity: O(n*logn)");
    }
}
