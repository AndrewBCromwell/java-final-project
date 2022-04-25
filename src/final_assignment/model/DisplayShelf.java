package final_assignment.model;

public class DisplayShelf {
    private LegoSet[] sets;
    private static int setCount = 0;

    public DisplayShelf() {
        sets = new LegoSet[5];
        sets[0] = new LegoSet();
        setCount++;
        sets[1] = new LegoSet();
        setCount++;
        sets[2] = new LegoSet();
        setCount++;
        sets[3] = new LegoSet();
        setCount++;
    }
    
}
