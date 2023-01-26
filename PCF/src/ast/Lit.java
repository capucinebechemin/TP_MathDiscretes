package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

import java.util.Optional;

public class Lit extends Term {
    public int value;

    public Lit(int value) {
        this.value = value;
    }
    @Override
    public Value interp(Env<Value> e) {
        return new IntVal(value);
    }
}
