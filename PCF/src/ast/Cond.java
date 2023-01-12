package ast;

import interp.Env;
import interp.IntVal;

public class Cond extends Term {
    public Term test;
    public Term branchTrue; // non zero
    public Term branchFalse;

    public Cond(Term test, Term branchTrue, Term branchFalse) {
        this.test = test;
        this.branchTrue = branchTrue;
        this.branchFalse = branchFalse;
    }
    @Override
    public IntVal interp(Env e) {
        return new IntVal(1);
    }
}
