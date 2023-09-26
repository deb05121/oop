package company;

public abstract class Validator<T> {
    abstract boolean isValid(T t);
    //ha ebből extendáltam, nem tudtam static-ká tenni a tényleges validátor osztályok metódusait,
    // ami pedig a teszteléshez kellett volna
    // Non-static method 'isValid(java.lang.String)' cannot be referenced from a static context
}
