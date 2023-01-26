package interp;

/**
 * Classe d'une valeur de type entière
 * */
public class IntVal extends Value{
    public int val;

    public IntVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return Integer.toString(this.val);
    }
}
