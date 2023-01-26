package ast;

import interp.Closure;
import interp.Env;
import interp.Value;
import typer.Arrow;
import typer.Type;

/**
 * Classe qui gère les fonctions
 * */
public class Fun extends Term {
    private final VarEnter argument;
    private final Term execution;
    public Fun(VarEnter argument, Term execution) {
        this.argument = argument;
        this.execution = execution;
    }

    public VarEnter getArgValue() {
        return argument;
    }

    public Term getExecution() {
        return execution;
    }

    /**
     * Interpreteur qui enregistre la fonction
     * */
    @Override
    public Value interp(Env<Value> e) {
        return new Closure(argument, execution,e);
    }

    /**
     * Vérification du typage
     * */
    @Override
    public Type typer(Env<Type> e) {
        return new Arrow(argument.typer(e).deref(), execution.typer(e).deref()).deref();
    }
}