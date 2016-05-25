package ChainOfResponsibility;
public class BasementBuilder extends Builder {
    public BasementBuilder() {
        super(HouseProject.Steps.CREATE_BASEMENT);
    }

    @Override
    public void buildImpl() {
        System.out.println("Building basement");
    }
}

