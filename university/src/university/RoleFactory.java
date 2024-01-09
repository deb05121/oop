package university;

public class RoleFactory implements AbstractFactory<Role>{
    @Override
    public Role create(Class<? extends Role> clazz) {
        return switch (clazz.getSimpleName()){
            case "Professor" -> new Professor();
            case "Researcher" -> new Researcher();
            case "Student" -> new Student();
            default -> null;
        };
    }
}
