package springframework.beans.factory;

import springframework.beans.BeansException;

/**
 * 定义 Bean 工厂接口
 */
public interface BeanFactory {
    /**
     * 返回 Bean 实例对象
     * @param name Bean 对象名称
     * @return 实例化的 Bean 对象
     * @throws BeansException Bean 异常
     */
    Object getBean(String name) throws BeansException;

    /**
     * 返回含构造参数的 Bean 实例对象
     * @param name Bean 对象名称
     * @param ars 构造参数
     * @return 实例化的 Bean 对象
     * @throws BeansException Bean 异常
     */
    Object getBean(String name, Object... ars) throws BeansException;

    /**
     * 返回指定泛型的对象
     * @param name
     * @param requiredType
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    /**
     * 返回指定泛型的对象
     * @param requiredType 类型
     * @param <T>          泛型
     * @return             实例化的 Bean 对象
     * @throws BeansException 不能获取 Bean 对象，则抛出异常
     */
    <T> T getBean(Class<T> requiredType) throws BeansException;

}
