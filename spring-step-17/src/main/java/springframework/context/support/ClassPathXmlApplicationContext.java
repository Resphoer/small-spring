package springframework.context.support;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{
    private String[] configLocations;

    public ClassPathXmlApplicationContext(String configLocations) {
        this(new String[]{configLocations});
    }
    public ClassPathXmlApplicationContext(String[] configLocations) {
        this.configLocations = configLocations;
        refresh();
    }

    public ClassPathXmlApplicationContext() {
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }

}
