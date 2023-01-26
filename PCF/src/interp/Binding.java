package interp;

/**
 * Classe permettant d'associé un nom à une valeur
 * */
public class Binding<T> {
    public String name;
    public T value;

    public Binding(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public T getValue() {
        return this.value;
    }
}
