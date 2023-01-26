package ast;

import interp.Env;
import interp.Value;

import java.util.Optional;

public class VarEnter extends Term {
    String varName;

    @Override
    public Value interp(Env<Value> e) {
        return e.lookup(varName).orElseThrow(()->new RuntimeException(String.format("The variable %s is not declared", varName)));
    }

    public VarEnter(String varName) {
        this.varName = varName;
    }
}
