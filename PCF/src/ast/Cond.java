package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;
import typer.Atom;
import typer.Type;
import typer.TypeError;

/**
 * Classe qui gère les expressions conditionnelles
 * */
public class Cond extends Term {
    public Term test;
    public Term branchTrue; // non zero
    public Term branchFalse;

    public Cond(Term test, Term branchTrue, Term branchFalse) {
        this.test = test;
        this.branchTrue = branchTrue;
        this.branchFalse = branchFalse;
    }

    /**
     * Interpreteur qui renvoie true si la condition et vraie et false sinon
     * */
    @Override
    public Value interp(Env<Value> e) {
        if (((IntVal) test.interp(e)).val == 0) {
            return branchTrue.interp(e);
        } else {
            return branchFalse.interp(e);
        }
    }

    /**
     * Vérification du typage
     * */
    @Override
    public Type typer(Env<Type> e) {
        Type test = this.test.typer(e).deref();
        Type trueBranch = branchTrue.typer(e).deref();
        Type falseBranch = branchFalse.typer(e).deref();
        if (!test.equals(Atom.INT)) {
            throw new TypeError("La branche n'est pas un entier");
        }
        if(trueBranch != falseBranch) {
            throw new TypeError("Les deux branches ont un typage différents");
        }
        return trueBranch;
    }
}
