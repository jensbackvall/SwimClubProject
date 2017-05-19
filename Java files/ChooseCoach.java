import java.util.*;
import java.io.*;

public class ChooseCoach {

    public ChooseCoach() {

    try {
        //indhent data fra en fil med aktive trænere
        Scanner input = new Scanner(new File("coach_test_list.txt"));
        //definér en ArrayList at gemme de enkelte rækker i
        ArrayList<String> coaches = new ArrayList<String>();
        //gennemgå fil og opdel den i enkelte linjer som gemmes i ArrayList
        while(input.hasNextLine()) {
            coaches.add(input.nextLine());
        }

        //opdel ArrayList coaches i enkelte ArrayLists for hver træner, split ved mellemrum for at få celleindhold

        //vælg træner
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    //test indhold af ArrayList coaches, for at se at den læser det ordentligt
    System.out.println(coaches);

    }

}