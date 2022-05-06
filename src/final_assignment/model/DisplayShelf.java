package final_assignment.model;
import java.util.Scanner;

import utilitys.UIUtility;
import utilitys.InputUtility;

public class DisplayShelf {
    private LegoSet[] sets;
    private static int setCount = 0;

    public DisplayShelf() {
        sets = new LegoSet[5];
        sets[setCount++] = new LegoIdeas("Pop-Up-Book", 21315, 859, "Allemann and Davis");
        sets[setCount++] = new LegoSet("Creator", "Roller Coaster", 10261, 4124);
        sets[setCount++] = new LegoSet("City", "City Square", 60097, 1683);
        sets[setCount++] = new LegoSet("Star Wars", "Anakin's Podracer - 20th Anniversary Edition", 75258, 275);
    }
    
    public void addSet(Scanner in){
        System.out.println("\n## Add A Set ##\n");

        if(setCount == sets.length){
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
        if(setCount == 0){
            System.out.println("There are no sets to remove.");
            return;
        }
        String menuTitle = "## Remove A Set ##";
        String prompt = "Which set do you want to remove?";
        String[] menuOptions = new String[setCount];
        for(int i = 0; i < setCount; i++){
            menuOptions[i] = sets[i].toString();
        }
        int removeIndex = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in) - 1;
        if(removeIndex < 0 || removeIndex >= menuOptions.length){
            System.out.println("Exiting update method");
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
        if(setCount == 0){
            System.out.println("There are no LEGO sets on the shelf.");
            return;
        }

        for(LegoSet set: sets){
            if (set != null) {
                System.out.println(set.toString());
            }            
        }
    }

    public void selectUpdateIndex(Scanner in){
        if(setCount == 0){
            System.out.println("There are no sets to update.");
            return;
        }
        String menuTitle = "## Update Set Data ##";
        String prompt = "Which set do you want to update?";
        String[] menuOptions = new String[setCount];
        for(int i = 0; i < setCount; i++){
            menuOptions[i] = sets[i].toString();
        }
        int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
        if(choice < 1 || choice > menuOptions.length){
            System.out.println("Exiting update method");
            return;
        }
        try{
            this.updateIdeasData((LegoIdeas)sets[choice - 1], in);
        }
        catch(Exception ex){
            this.updateData(sets[choice - 1], in);
        }
       
    }

    private void updateIdeasData(LegoIdeas set, Scanner in){ 
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
            if (choice == menuOptions.length + 1){
                System.out.println("Exiting update method");
                break;
            }
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

    private void updateData(LegoSet set, Scanner in){
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

    public void selectSortType(Scanner in){
        if(setCount == 0 || setCount == 1){
            System.out.println("Nothing to sort.");
            return;
        }
        String menuTitle = "## Sort Sets ##";
        String prompt = "How would you like the sets to be sorted";
        String[] menuOptions = {
                "Set Name", "Set Number", "Number of Pieces"
            };
        while(true){
            int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1){
                System.out.println("Exiting sort method");
                break;
            }
            switch (choice) {
                case 1:
                    sortByName();
                    return;
                case 2:
                    sortBySetNumber();
                    return;
                case 3:
                    sortByNumberOfPieces();
                    return;
            }
        }
    }

    private void sortByName(){
        LegoSet[] sortSets = new LegoSet[setCount];
        for(int i = 0; i < setCount; i++){
            sortSets[i] = sets[i];
        }
        for(int j = sortSets.length - 1; j > 0; j--){
            for(int k = 0; k < j; k++){
                if(sortSets[k].compareTo(sortSets[k + 1]) > 0){
                    LegoSet temp = sortSets[k];
                    sortSets[k] = sortSets[k + 1];
                    sortSets[k + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Order:\n");
        for(LegoSet set: sortSets){
            System.out.println(set.toString());
        }
        System.out.println("Exiting sort method");
    }

    private void sortBySetNumber(){
        LegoSet[] sortSets = new LegoSet[setCount];
        for(int i = 0; i < setCount; i++){
            sortSets[i] = sets[i];
        }
        for(int j = sortSets.length - 1; j > 0; j--){
            for(int k = 0; k < j; k++){
                if(sortSets[k].getSetNumber() > sortSets[k + 1].getSetNumber()){
                    LegoSet temp = sortSets[k];
                    sortSets[k] = sortSets[k + 1];
                    sortSets[k + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Order:\n");
        for(LegoSet set: sortSets){
            System.out.println(set.toString());
        }
        System.out.println("Exiting sort method");
    }

    private void sortByNumberOfPieces(){
        LegoSet[] sortSets = new LegoSet[setCount];
        for(int i = 0; i < setCount; i++){
            sortSets[i] = sets[i];
        }
        for(int j = sortSets.length - 1; j > 0; j--){
            for(int k = 0; k < j; k++){
                if(sortSets[k].getNumberOfPieces() > sortSets[k + 1].getNumberOfPieces()){
                    LegoSet temp = sortSets[k];
                    sortSets[k] = sortSets[k + 1];
                    sortSets[k + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Order:\n");
        for(LegoSet set: sortSets){
            System.out.println(set.toString());
        }
        System.out.println("Exiting sort method");
    }

    public void changeOrder(Scanner in){
        if(setCount == 0 || setCount == 1){
            System.out.println("Nothing to swap.");
            return;
        }
        String menuTitle = "## Change Order ##";
        String prompt = "Which set do you want to move?";
        String[] menuOptions = new String[setCount];
        for(int i = 0; i < setCount; i++){
            menuOptions[i] = sets[i].toString();
        }
        int moveIndex = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in) - 1;
        if(moveIndex < 0 || moveIndex >= menuOptions.length){
            System.out.println("Exiting update method");
            return;
        }
        int swapIndex = InputUtility.getInt("Which set do you want to swap it with", in) - 1;
        if(swapIndex < 0 || swapIndex >= menuOptions.length){
            if(swapIndex != menuOptions.length){System.out.println("Invalid option");}
            System.out.println("Exiting update method");
            return;
        }
        LegoSet temp = sets[moveIndex];
        sets[moveIndex] = sets[swapIndex];
        sets[swapIndex] = temp;
        System.out.println("Order Changed");
    }

    public void replaceSet(Scanner in){
        if(setCount == 0){
            System.out.println("There are no sets to replace.");
            return;
        }
        String menuTitle = "## Replace A Set ##";
        String prompt = "Which set do you want to replace?";
        String[] menuOptions = new String[setCount];
        for(int i = 0; i < setCount; i++){
            menuOptions[i] = sets[i].toString();
        }
        int replaceIndex = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in) - 1;
        if(replaceIndex < 0 || replaceIndex >= menuOptions.length){
            System.out.println("Exiting replace method");
            return;
        }
        String newSeries = InputUtility.getString("The new set's series is", in).strip();
        String newName = InputUtility.getString("The new set's name is", in).strip();
        int newSetNumber = InputUtility.getIntInRange("The new set's set number is ... (first set was 234)", 234, Integer.MAX_VALUE, in);
        int newNumberOfPieces = InputUtility.getInt("The number of pieces in the new set is", in);
        if(newSeries.equalsIgnoreCase("Ideas")){
            String newFanDesigner = InputUtility.getString("The new set's fan designer is", in).strip();
            sets[replaceIndex] = new LegoIdeas(newName, newSetNumber, newNumberOfPieces, newFanDesigner);
        }
        else{
            sets[replaceIndex] = new LegoSet(newSeries, newName, newSetNumber, newNumberOfPieces);
        }
        System.out.println("Set replaced.");
    }

    public void totalPieces(){
        System.out.println("\n## Total Pieces ##\n");
        int totalPieces = 0;
        for(LegoSet set: sets){
            if(set != null){
                totalPieces += set.getNumberOfPieces();
            }   
        }
        System.out.println("There are " + totalPieces + " LEGO bricks on the shelf.");

    }
}
