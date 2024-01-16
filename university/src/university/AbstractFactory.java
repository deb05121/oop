package university;

public interface AbstractFactory<T> {
   // T create(Class<? extends T> clazz);

    Student createWithStringInput(String type, String name, String sudentId, Faculty major);
}
