package final_assignment.model;

public class DisplayShelf {
    private LegoSet[] sets;
    private static int setCount = 0;

    public DisplayShelf() {
        sets = new LegoSet[5];
        sets[setCount++] = new LegoSet();
        sets[setCount++] = new LegoSet();
        sets[setCount++] = new LegoSet();
        sets[setCount++] = new LegoSet();
    }
    
}
