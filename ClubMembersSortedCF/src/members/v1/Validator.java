package members.v1;

public abstract class Validator<T> {
    abstract boolean isValid(T t);
}
