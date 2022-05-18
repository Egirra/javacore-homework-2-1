import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        ArrayList<Integer> listEvenPlus = new ArrayList<>();
        for (int x : list) {
            if (x > 0 && x % 2 == 0) {
                listEvenPlus.add(x);
            }
        }

        Collections.sort(listEvenPlus);
        for (Integer result : listEvenPlus) {
            System.out.println(result);
        }
    }
}