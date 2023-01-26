package ast;

import interp.Env;
import interp.Value;
import typer.Type;
import typer.Var;

/**
 * Classe correspondant à un nom de variable dans e
 * */
public class VarEnter extends Term {
    String varName;

    public VarEnter(String varName) {
        this.varName = varName;
    }

    /**
     * Intérpreteur qui renvoie la valeur de la variable si elle a été déclarée
     * */
    @Override
    public Value interp(Env<Value> e) {
        return e.lookup(varName).orElseThrow(()->new RuntimeException(String.format("La variable %s n'est pas déclarée", varName)));
    }

    /**
     * Vérification du typage
     * */
    @Override
    public Type typer(Env<Type> e) {
        return e.lookup(varName).orElse(new Var()).deref();
    }
}
