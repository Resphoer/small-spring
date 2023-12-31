package springframework.core.io.context;

/**
 * 事件发布者接口
 */
public interface ApplicationEventPublisher {
    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
