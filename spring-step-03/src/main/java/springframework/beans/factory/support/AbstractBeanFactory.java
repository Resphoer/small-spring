package springframework.beans.factory.support;

import springframework.beans.BeansException;
import springframework.beans.factory.BeanFactory;
import springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象的 Bean 工厂基类，定义模板方法
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    /**
     * 获取 Bean
     * @param name Bean 对象名称
     * @return 返回实例化的 Bean 对象
     * @throws BeansException Bean 异常
     */
    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if(bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }
    /**
     * 定义 Bean 的模板方法，由子类实现
     * @param beanName Bean 对象名称
     * @return 返回定义后的 Bean 对象
     * @throws BeansException Bean 异常
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创造 Bean 的模板方法，由子类实现
     * @param beanName Bean 对象名称
     * @param beanDefinition 被定义的 Bean 对象
     * @return 返回实例化的 Bean 对象
     * @throws BeansException Bean 异常
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
