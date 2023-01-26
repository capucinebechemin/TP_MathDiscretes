package ast;

import interp.Env;
import interp.Value;

import java.util.Optional;

public abstract class Term extends AST {
    public abstract Value interp(Env<Value> e);
}
