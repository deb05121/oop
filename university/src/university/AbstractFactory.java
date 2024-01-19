package university;

public interface AbstractFactory<T> {

    Student createWithStringInput(StudentType studentType, String name, String studentId, Faculty major);
}
