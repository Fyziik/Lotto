import java.util.HashSet;
import java.util.Scanner;

public class Input {

    private Scanner scan = new Scanner(System.in);
    HashSet<Integer> list = new HashSet<>();

    public Input(Console console) {
        askForNumbers(console);
    }

    private void askForNumbers(Console console) {
        while (list.size() != 7) {
            console.pickNumber(list);
            int pickedNumber = Integer.parseInt(scan.nextLine());
            //Make sure picked number is between 1-36
            if (pickedNumber > 0 && pickedNumber < 37) {
                //Check if number is currently picked, if not, add to list, else "skip"
                if (!list.contains(pickedNumber)) {
                    list.add(pickedNumber);
                }
                else {
                    console.alreadyPickedNumber();
                }
            }
            else {
                console.invalidNumber();
            }
        }
    }

    public HashSet<Integer> getList() {
        return this.list;
    }

    public String toString() {
        String tmp = "";
        for (Integer number : this.list) {
            tmp += number + " ";
        }
        return tmp;
    }

}
