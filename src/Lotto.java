import java.util.HashSet;

public class Lotto {

    HashSetMaker winningNumbers = new HashSetMaker();
    Console console = new Console();
    HashSet<Integer> pickedNumbers;


    public Lotto() {
        console.intro();
        Input input = new Input(console);
        this.pickedNumbers = input.getList();
        compareResults();
    }

    private void compareResults() {
        winningNumbers.getList().retainAll(pickedNumbers);
        if (winningNumbers.getList().size() > 0) {
            String tmp = "Correct numbers: ";
            for (Integer number : winningNumbers.getList()) {
                tmp += number + " ";
            }

            //Give a reward if 4 or more numbers were correct
            if (winningNumbers.getList().size() >= 4) {
                tmp += "- You had " + winningNumbers.getList().size() + " numbers right! You've been rewarded with " + Math.pow(100, (winningNumbers.getList().size() - 3)) + "$";
            }

            console.correctNumbers(tmp);
        }
        else {
            console.allWrongNumbers();
        }
    }


}
