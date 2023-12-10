package Fraction;

import java.util.Objects;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction (int numerator, int denominator){

        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Fraction fraction = (Fraction) o;
        return this.numerator * fraction.denominator == fraction.numerator * this.denominator;
    }


}
