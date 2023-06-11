package springframework.beans.factory.support;

import springframework.beans.factory.config.BeanDefinition;

/**
 * Bean 定义注册接口
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
