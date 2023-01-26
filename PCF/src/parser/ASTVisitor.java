package parser;

import ast.*;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends PCFBaseVisitor<AST> {

    /**
     * Récupération de l'entier
     * */
    @Override
    public AST visitLit(PCFParser.LitContext ctx) {
        return new Lit(Integer.parseInt(ctx.getText()));
    }

    /**
     * Récupération de l'opération
     * */
    @Override
    public AST visitBinOp(PCFParser.BinOpContext ctx) {
        OP op;
        if (ctx.OPHP() != null){
            //Opérande de priorité supérieure
            op = OP.parseOP(ctx.OPHP().getText());
        }else{
            op = OP.parseOP(ctx.OPLP().getText());
        }
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new BinOp(op, terms.get(0), terms.get(1));
    }

    /**
     * Récupération de la condition
     * */
    @Override
    public AST visitCond(PCFParser.CondContext ctx) {
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new Cond(terms.get(0), terms.get(1), terms.get(2));
    }

    /**
     * Récupération du terme parenthésé
     * */
    @Override
    public AST visitPar(PCFParser.ParContext ctx) {
        PCFParser.TermContext ANTLRTerm = ctx.term();
        Term term = (Term) visit(ANTLRTerm);
        return term;
    }

    /**
     * Récupération de la variable
     * */
    @Override
    public AST visitVarEnter(PCFParser.VarEnterContext ctx) {
        return new VarEnter(ctx.VAR().getText());
    }

    /**
     * Récupération de la déclaration d'une variable
     * */
    @Override
    public AST visitVarLet(PCFParser.VarLetContext ctx) {
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new VarLet(ctx.VAR().getText(), terms.get(0), terms.get(1));
    }

    /**
     * Récupération de la function
     * */
    @Override
    public AST visitFun(PCFParser.FunContext ctx) {
        return new Fun(new VarEnter(ctx.VAR().getText()), (Term) visit(ctx.term()));
    }

    /**
     * Récupération des deux termes de la fonction
     * */
    @Override
    public AST visitFunEnter(PCFParser.FunEnterContext ctx) {
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new FunEnter(terms.get(0),terms.get(1));
    }
}