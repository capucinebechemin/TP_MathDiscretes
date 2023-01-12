package ast;

import interp.Env;
import interp.IntVal;

public abstract class Term extends AST {
    public abstract IntVal interp(Env e);
}
