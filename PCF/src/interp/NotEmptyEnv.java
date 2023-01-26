package interp;

import java.util.Optional;

/**
 * Classe d'un environnement non vide
 * */
public class NotEmptyEnv<T> extends Env<T>{
    private final Env<T> previous;
    private final Binding<T> last;

    public NotEmptyEnv(Env<T> previous, Binding<T> last) {
        this.previous = previous;
        this.last = last;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Binding<T> last() {
        return last;
    }

    @Override
    public Env<T> previous() {
        return previous;
    }

    @Override
    public Optional<T> lookup(String id) {
        return this.last.getName().equals(id) ? Optional.of(this.last.getValue()) : this.previous().lookup(id);
    }
}
