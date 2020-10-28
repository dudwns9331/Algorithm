package BruteForce;

import java.util.*;

public class Bulk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int rank[] = new int[n];

        List<Person> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int w = input.nextInt();
            int h = input.nextInt();
            list.add(new Person(w, h));
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if(list.get(i).weight < list.get(j).weight &&
                        list.get(i).height < list.get(j).height)
                    rank[i]++;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(rank[i] + 1 + " ");
        }
    }

    public static class Person {
        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }
}
