package springframework.beans.factory.config;

import springframework.beans.factory.ConfigurableListableBeanFactory;
import springframework.beans.BeansException;

/**
 * 自定义修改 BeanDefinition 属性信息
 */
public interface BeanFactoryPostProcessor {
    /**
     * 在所有的 BeanDefinition 加载完成后，在 Bean 实例化前，提供修改 BeanDefinition 属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
