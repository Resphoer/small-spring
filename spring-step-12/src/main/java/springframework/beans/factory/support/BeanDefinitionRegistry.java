package springframework.beans.factory.support;

import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.BeansException;

/**
 * Bean 定义注册接口
 */
public interface BeanDefinitionRegistry {
    /**
     * 注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 通过 beanNam 查询 BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判读是否包含指定名称的 BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取注册表中所有 BeanDefinition 名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
