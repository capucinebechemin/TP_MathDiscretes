package ast;

import interp.Env;
import interp.Value;
import typer.Type;
import typer.Var;

public class VarEnter extends Term {
    String varName;

    @Override
    public Value interp(Env<Value> e) {
        return e.lookup(varName).orElseThrow(()->new RuntimeException(String.format("The variable %s is not declared", varName)));
    }

    public VarEnter(String varName) {
        this.varName = varName;
    }

    @Override
    public Type typer(Env<Type> e) {
        return e.lookup(varName).orElse(new Var()).deref();
    }
}
