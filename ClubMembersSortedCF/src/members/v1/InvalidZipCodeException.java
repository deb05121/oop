package members.v1;

public class InvalidZipCodeException extends Throwable{
    public InvalidZipCodeException(String s) {
        System.out.println(s);
    }
}
