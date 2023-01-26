package ast;

import interp.Env;
import interp.Value;
import typer.Type;

public class VarLet extends Term{
    String name;
    Term value;
    Term expression;

    public String getName() {
        return name;
    }

    public Term getValue() {
        return value;
    }

    public VarLet(String name, Term value, Term expression) {
        this.name = name;
        this.value = value;
        this.expression = expression;
    }

    @Override
    public Value interp(Env<Value> e) {
        e = e.add(name,value.interp(e));
        return expression.interp(e);
    }

    @Override
    public Type typer(Env<Type> e) {
        e = e.add(name,value.typer(e));
        return expression.typer(e);
    }
}
