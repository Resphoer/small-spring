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
}
