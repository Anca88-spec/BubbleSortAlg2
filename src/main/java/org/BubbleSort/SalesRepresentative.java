package org.BubbleSort;

public class SalesRepresentative {
    private final String name;
    private final int sales;
    private final double quota;

    public SalesRepresentative(String name, int sales, double quota) {
        this.name = name;
        this.sales = sales;
        this.quota = quota;
    }

    public double getRevenue() {
        return sales * quota;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{name='" + name + "', sales=" + sales + ", quota=" + quota + '}';
    }
}
