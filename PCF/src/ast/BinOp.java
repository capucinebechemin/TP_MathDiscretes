package ast;

import interp.Env;
import interp.IntVal;

public class BinOp extends Term {
    public OP op;
    public Term term1;
    public Term term2;
    public BinOp(OP op, Term term1, Term term2) {
        this.op = op;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public IntVal interp(Env e) {
        return switch (op) {
            case PLUS ->  new IntVal(term1.interp(e).val+term2.interp(e).val);
            case MINUS ->  new IntVal(term1.interp(e).val-term2.interp(e).val);
            case TIMES ->  new IntVal(term1.interp(e).val*term2.interp(e).val);
            case DIVIDE ->  new IntVal(term1.interp(e).val/term2.interp(e).val);
            default          -> throw new IllegalArgumentException("Unexpected operator: " + op);
        };
    }
}
