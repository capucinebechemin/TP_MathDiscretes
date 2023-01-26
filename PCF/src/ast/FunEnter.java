package ast;

import interp.Closure;
import interp.Env;
import interp.Value;
import typer.Type;
import typer.TypeError;

/**
 * Classe correspondant aux informations entrées d'une fonction
 * */
public class FunEnter extends Term {
    Term execution;
    Term argument;

    public FunEnter(Term execution, Term argument) {
        this.execution = execution;
        this.argument = argument;
    }

    /**
     * Interpreteur qui renvoie l'interpretation de la fonction
     * */
    @Override
    public Value interp(Env<Value> e) {
        Closure closure = (Closure) execution.interp(e);
        closure.setEnv(closure.getEnv().add(closure.getArgument().varName, this.argument.interp(e)));
        if (closure.getFunction() instanceof Fun function) {
            return new Closure(function.getArgValue(), function.getExecution(), closure.getEnv());
        }
        return closure.getFunction().interp(closure.getEnv());
    }

    /**
     * Vérification du typage
     * */
    @Override
    public Type typer(final Env<Type> e) {
        Type argType = argument.typer(e);
        Type execType = execution.typer(e);
        if(!execType.unify(argType))
            throw new TypeError("Ne peut pas regrouper l'argument et la fonction");
        return execution.typer(e).deref();
    }
}