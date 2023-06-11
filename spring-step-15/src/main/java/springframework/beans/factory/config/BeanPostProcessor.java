package springframework.beans.factory.config;

import springframework.beans.BeansException;

/**
 * 修改实例化 Bean 对象的拓展点
 */
public interface BeanPostProcessor {
    /**
     * 在 Bean 对象执行初始化方法前，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
