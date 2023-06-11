package springframework.context.event;

import springframework.context.ApplicationContext;
import springframework.context.ApplicationEvent;

/**
 * Base class for events raised for an <code>ApplicationContext</code>.
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event
     *
     * @param source
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }
    /**
     * Get the <code>ApplicationContext</code> that the event was raised for
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
