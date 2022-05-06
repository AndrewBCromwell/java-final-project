package final_assignment.model;

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

    public LegoSet(String series, String name, int setNumber, int numberOfPieces){
        setSeries(series);
        setName(name);
        setSetNumber(setNumber);
        setNumberOfPieces(numberOfPieces);
    }

    public String getSeries(){
        return series;
    }

    public void setSeries(String series){
        validateSeries(series);
        this.series = series;
    }

    private void validateSeries(String series){
        if(series == null || series.equals("")){
            throw new IllegalArgumentException("\"Series\" is requiered.");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        validateName(name);
        this.name = name;
    }

    private void validateName(String name){
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("\"name\" is requiered.");
        }
    }

    public int getSetNumber(){
        return setNumber;
    }

    public void setSetNumber(int setNumber){
        validateSetNumber(setNumber);
        this.setNumber = setNumber;
    }

    private void validateSetNumber(int setNumber){
        if(setNumber < 234){ // set 234 is largly aggreed upon as the first lego set.
            throw new IllegalArgumentException("That is not a valid Set number.(first set was 234)");
        }
    }

    public int getNumberOfPieces(){
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces){
        validateNumberOfPieces(numberOfPieces);
        this.numberOfPieces = numberOfPieces;
    }

    private void validateNumberOfPieces(int numberOfPieces){
        if(numberOfPieces <= 0){
            throw new IllegalArgumentException("Number of pieces must be positive.");
        }
    }

    @Override
    public String toString(){
        return name + "\nLEGO " + series + "\n" + setNumber + "\n" + numberOfPieces + " pieces\n";
    }


    @Override
    public int compareTo(LegoSet other){
        int difference = this.name.compareTo(other.getName());
        return difference;
    }

}