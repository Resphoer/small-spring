package springframework.beans.factory;

import springframework.beans.BeansException;

import java.util.Map;

/**
 *
 */
public interface ListableBeanFactory {
    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的 Bean 名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
