package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

import java.util.Optional;

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
    public Value interp(Env<Value> e) {
        if (((IntVal) test.interp(e)).val != 0) {
            return branchTrue.interp(e);
        } else {
            return branchFalse.interp(e);
        }
    }
}
