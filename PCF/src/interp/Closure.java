package interp;

import ast.VarEnter;
import ast.Term;

/**
 * Classe qui gère l'ensemble des éléments
 * permettant d'obtenir le resultat d'une fonction
 * dans un environnement avec un certain argument
 * */
public final class Closure extends Value {
    Term function;
    VarEnter argument;
    Env<Value> env;

    public Closure(VarEnter argument, Term function, Env<Value> env) {
        this.argument = argument;
        this.function = function;
        this.env = env;
    }

    public Term getFunction() {
        return function;
    }
    public VarEnter getArgument(){
        return argument;
    }

    @Override
    public String toString() {
        return "Closure ->" +
                "\n function : " + function +
                "\n argument : " + argument +
                "\n env : " + env +
                "\n";
    }

    public Env<Value> getEnv() {
        return env;
    }

    public void setEnv(Env<Value> env) {
        this.env = env;
    }
}