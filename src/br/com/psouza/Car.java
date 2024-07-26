package br.com.psouza;

public abstract class Car {

    private Long horsePower;

    private String color;

    public Car(String color, Long horsePower) {
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " horsePower=" + horsePower +
                ", color='" + color + '\'';
    }
}
