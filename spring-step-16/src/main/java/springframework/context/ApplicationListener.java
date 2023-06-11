package springframework.context;

import java.util.EventListener;

/**
 * Interface to be implemented by application event listeners.
 * @param <E>
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    /**
     * Handle an application event.
     * @param event
     */
    void onApplicationEvent(E event);
}
