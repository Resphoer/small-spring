package springframework.context.event;

/**
 * Event raised when an <code>ApplicationContext</code> gets initialized or refreshed.
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event
     *
     * @param source
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
