package org.BubbleSort;

public class Main {


    public SalesRepresentative[] sort(SalesRepresentative[] representatives) {
        for (int i = 0; i < representatives.length - 1; i++) {
            for (int j = 0; j < representatives.length - 1 - i; j++) {
                if (representatives[j].getRevenue() < representatives[j + 1].getRevenue()) {
                    SalesRepresentative temp = representatives[j];
                    representatives[j] = representatives[j + 1];
                    representatives[j + 1] = temp;
                }
            }
        }


        return representatives;
    }

    public static void main(String[] args) {
        SalesRepresentative[] representatives = new SalesRepresentative[]{
                new SalesRepresentative("guy 1", 10, 500),
                new SalesRepresentative("guy 2", 7, 800),
                new SalesRepresentative("guy 3", 17, 1100),
                new SalesRepresentative("guy 4", 6, 900)
        };


        Main main = new Main();
        SalesRepresentative[] sortedRepresentatives = main.sort(representatives);

        System.out.println("Sorted Sales Representatives (Descending by Revenue):");
        for (SalesRepresentative rep : sortedRepresentatives) {
            System.out.println(rep);
        }
    }
}