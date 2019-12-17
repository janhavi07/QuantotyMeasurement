package com.quantitymeasurement;

public class Feet {

    private double value;

    public Feet(double value) {
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet that = (Feet) o;
        return Double.compare(that.value, value) == 0;
    }
}
