package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;
import typer.Atom;
import typer.Type;

/**
 * Classe correspondant aux informations entrées d'une valeur entiere
 * */
public class Lit extends Term {
    public int value;

    public Lit(int value) {
        this.value = value;
    }

    /**
     * Interpreteur qui renvoie la valeur entiere en objet IntVal
     * */
    @Override
    public Value interp(Env<Value> e) {
        return new IntVal(value);
    }

    /**
     * Vérification du typage
     * */
    @Override
    public Type typer(Env<Type> e) {
        return Atom.INT;
    }
}
