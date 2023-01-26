package ast;

import interp.Env;
import interp.Value;
import typer.Type;

/**
 * Classe abstraite initialisant les divers termes utilisés
 * */
public abstract class Term extends AST {
    public abstract Value interp(Env<Value> e);
    public abstract Type typer(Env<Type> e);
}
