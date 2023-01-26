package ast;

/**
 * Classe liant les noms des opérations avec les opérandes
 * */
public enum OP {
    PLUS, MINUS, TIMES, DIVIDE;

    public static OP parseOP(String op) {
        return switch (op) {
            case "+" -> PLUS;
            case "-" -> MINUS;
            case "*" -> TIMES;
            case "/" -> DIVIDE;
            default          -> throw new IllegalArgumentException("Opérande inconnue: " + op);
        };
    }
}
