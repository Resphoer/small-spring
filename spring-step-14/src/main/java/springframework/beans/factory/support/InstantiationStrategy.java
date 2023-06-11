package springframework.beans.factory.support;

import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.BeansException;

import java.lang.reflect.Constructor;

/**
 * Bean 实例化策略接口
 */
public interface InstantiationStrategy {
    /**
     * Bean 实例化方法
     * @param beanDefinition 被定义的 Bean 对象
     * @param beanName Bean 对象名称
     * @param constructor Bean 构造器
     * @param args 构造参数列表
     * @return 实例化的 Bean 对象
     * @throws BeansException Bean 异常
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
