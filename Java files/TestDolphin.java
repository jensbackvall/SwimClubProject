import java.util.*;
import java.io.*;

public class TestDolphin {

    public static void main(String[] args) throws FileNotFoundException {


        //indhent data fra en fil med aktive trænere
        Scanner input = new Scanner(new File("coach_test_list.txt"));

        //definér en ArrayList at gemme de enkelte rækker i
        ArrayList<ArrayList> coaches = new ArrayList<ArrayList>();

        //definér en temporær ArrayList at lægge enkelte brugere i, før de
        //lægges i ArrayListen coaches
        ArrayList<String> temp;

        //gennemgå fil og opdel den i enkelte linjer som gemmes i ArrayList
        while(input.hasNextLine()) {
            temp = new ArrayList<String>();
            temp.add(input.nextLine());
            coaches.add(temp);
        }
        //test indhold af ArrayList coaches, for at se at den læser det ordentligt
        System.out.println(coaches);
        ArrayList<String> coach1 = new ArrayList<String>();
        coach1 = (coaches.get(1));

        System.out.println(coach1);

        System.out.println(coach1.get(0));

        //vælg træner

    }

}