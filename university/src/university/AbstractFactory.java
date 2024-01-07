package university;

public interface AbstractFactory<T> {
    T create(Class<? extends T> clazz);
}
