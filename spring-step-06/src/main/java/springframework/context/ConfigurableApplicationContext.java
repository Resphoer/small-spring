package springframework.context;

import springframework.beans.BeansException;

/**
 * SPI 接口配置应用上下文 SPI interface to be implemented by most if not all application contexts.
 */
public interface ConfigurableApplicationContext extends ApplicationContext{
    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
