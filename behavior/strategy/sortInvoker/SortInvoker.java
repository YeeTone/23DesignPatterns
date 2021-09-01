package behavior.strategy.sortInvoker;

import behavior.strategy.sorter.Sorter;

import java.util.Objects;

public class SortInvoker {
    private Sorter sorter;

    public SortInvoker(Sorter sorter){
        Objects.requireNonNull(this.sorter = sorter);
    }

    public void setSorter(Sorter sorter) {
        Objects.requireNonNull(this.sorter = sorter);
    }

    public void invokeSorter(){
        this.sorter.sort();
    }
}
