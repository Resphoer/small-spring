package springframework.core.io.context;

import springframework.beans.BeansException;
import springframework.beans.factory.Aware;

/**
 * 实现此接口，可以感知所属的ApplicationContext上下文信息
 */
public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
