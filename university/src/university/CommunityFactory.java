package university;

public class CommunityFactory implements AbstractFactory<Community>{
    @Override
    public Community create(Class<? extends Community> clazz) {
        return new Course();
    };
}

