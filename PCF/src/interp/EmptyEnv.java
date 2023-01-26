package interp;

import java.util.Optional;

public class EmptyEnv<T> extends Env<T>{
    public EmptyEnv() {
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Binding last() {
        return null;
    }

    @Override
    public Env<T> previous() {
        return null;
    }

    @Override
    public Optional<Value> lookup(String id) {
        return Optional.empty();
    }
}
