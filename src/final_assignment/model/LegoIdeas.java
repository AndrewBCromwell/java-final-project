package final_assignment.model;

import java.util.List;

public class LegoIdeas extends LegoSet {
    
    
    private String series = "Ideas";

    private String fanDesigner;

    public LegoIdeas(){
        super();
        series = "Ideas";
        fanDesigner = "unknown";
    }

    public LegoIdeas(String name, int setNumber, int numberOfPieces, String fanDesigner){
        super("Ideas", name, setNumber, numberOfPieces);
        setFanDesigner(fanDesigner);
    }

    public String getFanDesigner(){
        return fanDesigner;
    }

    public void setFanDesigner(String fanDesigner){
        validateFanDesigner(fanDesigner);
        this.fanDesigner = fanDesigner;
    }

    private void validateFanDesigner(String name){
        if(fanDesigner== null || fanDesigner.equals("")){
            throw new IllegalArgumentException("\"Fan Designer\" is requiered.");
        }
    }

    @Override
    public String toString(){
        return getName() + "\nLEGO " + series + "\n" + getSetNumber() + "\n" + 
            getNumberOfPieces() + "pieces\nFan Designer: " + fanDesigner + "\n\n";
    }
}
