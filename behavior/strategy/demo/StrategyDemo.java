package behavior.strategy.demo;

import behavior.strategy.sortInvoker.SortInvoker;
import behavior.strategy.sorter.MergeSorter;
import behavior.strategy.sorter.QuickSorter;
import behavior.strategy.sorter.Sorter;
import behavior.strategy.sorter.TimSorter;

public class StrategyDemo {
    public static void main(String[] args) {
        Sorter tim =new TimSorter();
        Sorter merge = new MergeSorter();
        Sorter quick = new QuickSorter();

        SortInvoker invoker = new SortInvoker(tim);
        invoker.invokeSorter();

        invoker.setSorter(merge);
        invoker.invokeSorter();

        invoker.setSorter(quick);
        invoker.invokeSorter();
    }
}
