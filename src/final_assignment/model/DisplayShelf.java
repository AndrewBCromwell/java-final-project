package final_assignment.model;
import java.util.Scanner;

import utilitys.UIUtility;
import utilitys.InputUtility;

public class DisplayShelf {
    private LegoSet[] sets;
    private static int setCount = 0;

    public DisplayShelf() {
        sets = new LegoSet[5];
        sets[setCount++] = new LegoSet("Star Wars", "Anakin's Podracer - 20th Anniversary Edition", 75258, 275);
        sets[setCount++] = new LegoSet("Creator", "Roller Coaster", 10261, 4124);
        sets[setCount++] = new LegoSet("City", "City Square", 60097, 1683);
        sets[setCount++] = new LegoSet("Creator", "Winter Village Station", 10259, 902);
    }
    
    public void addSet(Scanner in){
        System.out.println("\n## Add A Set ##\n");

        if(setCount == 5){
            System.out.println("There is no room on the shelf.");
        } else{
            String series = InputUtility.getString("What series is this set from?", in).strip();
            String setName = InputUtility.getString("What is the set's name?", in).strip();
            int setNumber = InputUtility.getIntInRange("What is the set number? (first set was 234)", 234, Integer.MAX_VALUE, in);
            int numberOfPieces = InputUtility.getIntInRange("How many pieces dose the set have?", 0, Integer.MAX_VALUE, in);
            if(series.equalsIgnoreCase("Ideas")){
                String fanDesigner = InputUtility.getString("Who is the fan designer?", in).strip();
                this.sets[setCount++] = new LegoIdeas(setName, setNumber, numberOfPieces, fanDesigner);
            } else{
                this.sets[setCount++] = new LegoSet(series, setName, setNumber, numberOfPieces);
            }
            System.out.println("The set was added.\n");
        }
    }

    public void removeSet(Scanner in){
        String menuTitle = "## Remove A Set ##";
        String prompt = "Which set do you want to remove?";
        String[] menuOptions = new String[setCount];
        for(int i = 0; i < setCount; i++){
            menuOptions[i] = sets[i].toString();
        }
        int removeIndex = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in) - 1;
        if(removeIndex == menuOptions.length){
            return;
        }
        if(removeIndex < 0 || removeIndex > menuOptions.length){
            System.out.println("There is no LEGO set there.\nExiting update method");
            return;
        } else{
            while(removeIndex < setCount){ // repetes until the removeIndex refers to the last set on the shelf.
                sets[removeIndex] = sets[++removeIndex]; // replace set at remove index index with the set in the next index.
            }
            sets[removeIndex] = null; // the location that used to hold the last set is now empty.
            setCount--; // one less set in count.
            System.out.println("Set Removed.");
        }
    }

    public void showSetData(){
        System.out.println("\n## Show Set Data ##\n");

        for(LegoSet set: sets){
            if (set != null) {
                System.out.println(set.toString());
            }            
        }
    }

    public void selectUpdateIndex(Scanner in){
        String menuTitle = "## Update Set Data ##";
        String prompt = "Which set do you want to update?";
        String[] menuOptions = new String[setCount];
        for(int i = 0; i < setCount; i++){
            menuOptions[i] = sets[i].toString();
        }
        int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
        if(choice < 1 || choice > menuOptions.length){
            System.out.println("There is no LEGO set there.\nExiting update method");
            return;
        }
        this.updateData(sets[choice - 1], in);
    }

    public void updateData(LegoSet set, Scanner in){
        System.out.println("Current Data:\n" + set.toString());
        String menuTitle = "Update Menu";
        String prompt = "Select a piece of data to update";
        String[] menuOptions = {
                "Series", "Set Name", "Set Number", "Number of Pieces"
            };
        while(true){
            int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    set.setSeries(InputUtility.getString("New series", in));
                    System.out.println("The series has been updated.\n\nAything else?");
                    break;
                case 2:
                    set.setName(InputUtility.getString("New set name", in));
                    System.out.println("The set name has been updated.\n\nAything else?");
                    break;
                case 3:
                    set.setSetNumber(InputUtility.getIntInRange("New set number (first set was 234)", 234, Integer.MAX_VALUE, in));
                    System.out.println("The set number has been updated.\n\nAything else?");
                    break;
                case 4:
                    set.setNumberOfPieces(InputUtility.getIntInRange("New number of pieces", 0, Integer.MAX_VALUE, in));
                    System.out.println("The number of pieces has been updated.\n\nAything else?");
                    break;
            }
        }        
    }

    public void updateData(LegoIdeas set, Scanner in){ // Overloded method so that if the set is a LEGO ideas set they get the option to change the fan designer and not change the series.
        System.out.println("Current Data:\n" + set.toString());
        String menuTitle = "Update Menu";
        String prompt = "Select a piece of data to update";
        String[] menuOptions = {
                "Set Name", "Set Number", "Number of Pieces", "Fan Designer"
            };
        while(true){
            int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    set.setName(InputUtility.getString("New set name", in));
                    System.out.println("The set name has been updated.\n\nAything else?");
                    break;
                case 2:
                    set.setSetNumber(InputUtility.getIntInRange("New set number (first set was 234)", 234, Integer.MAX_VALUE, in));
                    System.out.println("The set number has been updated.\n\nAything else?");
                    break;
                case 3:
                    set.setNumberOfPieces(InputUtility.getIntInRange("New number of pieces", 0, Integer.MAX_VALUE, in));
                    System.out.println("The number of pieces has been updated.\n\nAything else?");
                    break;
                case 4:
                    set.setFanDesigner(InputUtility.getString("New fan designer", in));
                    System.out.println("The fan designer has been updated.\n\nAything else?");
                    break;
            }
        }        
    }


}
