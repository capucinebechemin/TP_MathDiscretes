package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;
import typer.Atom;
import typer.Type;

public class Lit extends Term {
    public int value;

    public Lit(int value) {
        this.value = value;
    }
    @Override
    public Value interp(Env<Value> e) {
        return new IntVal(value);
    }

    @Override
    public Type typer(Env<Type> e) {
        return Atom.INT;
    }
}
