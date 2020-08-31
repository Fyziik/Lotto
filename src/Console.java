import java.util.HashSet;

public class Console {

    public void intro() {
        System.out.println("Welcome to my lotto game!");
        System.out.println("In this game, you pick 7 numbers between (including) 1-36");
        System.out.println("and try to get as many right numbers as possible. Good luck!");
    }

    public void pickNumber(HashSet<Integer> list) {
        System.out.print("Pick #" + (list.size() + 1) + " number: ");
    }

    public void alreadyPickedNumber() {
        System.out.println("You've already picked that number!");
    }

    public void invalidNumber() {
        System.out.println("Invalid number! Can only be numbers between (including) 1-36");
    }

    public void correctNumbers(String tmp) {
        System.out.println(tmp);
    }

    public void allWrongNumbers() {
        System.out.println("You had no right answers. Sorry!");
    }
}
