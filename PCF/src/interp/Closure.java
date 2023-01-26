package interp;

import ast.VarEnter;
import ast.Term;

public final class Closure extends Value {
    Term function;
    VarEnter argument;
    Env<Value> blockEnv;

    public Closure(VarEnter argument, Term function, Env<Value> blockEnv) {
        this.argument = argument;
        this.function = function;
        this.blockEnv = blockEnv;
    }

    public Term getFunction() {
        return function;
    }
    public VarEnter getArgument(){
        return argument;
    }

    @Override
    public String toString() {
        return "Closure{" +
                "\n    function=" + function +
                ",\n    argument=" + argument +
                ",\n    blockEnv=" + blockEnv +
                "\n}";
    }

    public Env<Value> getBlockEnv() {
        return blockEnv;
    }

    public void setBlockEnv(Env<Value> blockEnv) {
        this.blockEnv = blockEnv;
    }
}