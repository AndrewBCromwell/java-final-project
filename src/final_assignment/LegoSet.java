package final_assignment;

import java.util.List;

public class LegoSet implements Comparable<LegoSet> {
    private String series;
    private String name;
    private int setNumber;
    private int numberOfPieces;

    public LegoSet(){
        series = "unknown";
        name = "unknown";
        setNumber = -1;
        numberOfPieces = -1;
    }

    public void SetSeries(String series){
        validateSeries(series);
        this.series = series;
    }

    private void validateSeries(String series){
        if(series == null || series.equals("")){
            throw new IllegalArgumentException("\"Series\" is requiered.");
        }
    }


    @Override
    public int compareTo(LegoSet other){

        return 0;
    }

}