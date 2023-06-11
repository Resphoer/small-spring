package springframework.core.io.context.event;

/**
 * Event raised when an <code>ApplicationContext</code> gets closed.
 */
public class ContextClosedEvent extends ApplicationContextEvent {
    /**
     * Constructs a prototypical Event
     *
     * @param source
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
