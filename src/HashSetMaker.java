import java.util.HashSet;

public class HashSetMaker {
    private HashSet<Integer> list = new HashSet<>();


    //Used for when generating winning numbers hashset
    public HashSetMaker() {
        generateWinningNumbers();
    }

    public HashSet<Integer> getList() {
        return this.list;
    }

    private void generateWinningNumbers() {
        RandomNumberGen rng = new RandomNumberGen();
        while (this.list.size() != 7) {
            this.list.add(rng.generate());
        }
    }

    public String toString() {
        String tmp = "";
        for (Integer number : this.list) {
            tmp += number + " ";
        }
        return tmp;
    }
}
