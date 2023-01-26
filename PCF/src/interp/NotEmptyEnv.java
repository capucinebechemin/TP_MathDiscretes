package interp;

import java.util.Optional;

public class NotEmptyEnv<T> extends Env<T>{
    private final Env<T> previous;
    private final Binding last;

    public NotEmptyEnv(Env<T> previous, Binding last) {
        this.previous = previous;
        this.last = last;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Binding last() {
        return last;
    }

    @Override
    public Env<T> previous() {
        return previous;
    }

    @Override
    public Optional<Value> lookup(String id) {
        return this.last.getName().equals(id) ? Optional.of(this.last.getValue()) : this.previous().lookup(id);
    }
}
