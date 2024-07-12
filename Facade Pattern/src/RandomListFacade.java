import java.util.List;

public class RandomListFacade {
    private ListFilter filter;
    private ListPrinter printer;
    private RandomList rand;
    private RandomNumber rn;

    public void printRandomEvenList(List<Integer> list, int size, int min, int max) {
        this.printer.printList(this.filter.filterOdd(list));
        this.rn.generateInteger(min, max);
        this.rand.generateList(size, min, max);
    }
}
