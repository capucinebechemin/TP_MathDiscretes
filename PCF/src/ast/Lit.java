package ast;

import interp.Env;
import interp.IntVal;

public class Lit extends Term {
    public int value;

    public Lit(int value) {
        this.value = value;
    }
    @Override
    public IntVal interp(Env e) {
        return new IntVal(this.value);
    }
}
