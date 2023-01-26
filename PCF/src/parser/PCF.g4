grammar PCF;

// règles syntaxiques

program : term EOF ;
term : LIT                                   # Lit
     | VAR                                   # VarEnter
     | term term                             # FunEnter
     | '(' term ')'                          # Par
     | term OPHP term                        # BinOp
     | term OPLP term                        # BinOp
     | 'ifz' term 'then' term 'else' term    # Cond
     | 'let' VAR '=' term 'in' term          # VarLet
     | 'fun' VAR '->' term                   # Fun
     ;

// règles lexicales
VAR : [a-zA-Z]+;
OPHP  : '*' | '/' ;
OPLP  : '+' | '-' ;
LIT : '0' | [1-9][0-9]* ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;
