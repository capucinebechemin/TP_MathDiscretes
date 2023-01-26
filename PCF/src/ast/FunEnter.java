package ast;

import interp.Closure;
import interp.Env;
import interp.Value;
import typer.Type;
import typer.TypeError;

public class FunEnter extends Term {
    Term execution;
    Term argument;

    public FunEnter(Term execution, Term argument) {
        this.execution = execution;
        this.argument = argument;
    }

    @Override
    public Value interp(Env<Value> e) {
        Closure closure = (Closure) execution.interp(e);
        closure.setBlockEnv(closure.getBlockEnv().add(closure.getArgument().varName, this.argument.interp(e)));
        if (closure.getFunction() instanceof Fun function) {
            return new Closure(function.getArgValue(), function.getExecution(), closure.getBlockEnv());
        }
        return closure.getFunction().interp(closure.getBlockEnv());
    }

    @Override
    public Type typer(final Env<Type> e) {
        Type argType = argument.typer(e);
        Type execType = execution.typer(e);
        if(!execType.unify(argType))
            throw new TypeError("Couldn't unify funtion and argument");
        return execution.typer(e).deref();
    }
}