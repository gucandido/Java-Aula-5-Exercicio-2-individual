package com.company;

public class Celular implements Precedente<Celular>{

    private String number;
    private String holder;

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        return celular.number.compareTo(this.number);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number='" + number + '\'' +
                ", holder='" + holder + '\'' +
                '}'+"\n";
    }
}
