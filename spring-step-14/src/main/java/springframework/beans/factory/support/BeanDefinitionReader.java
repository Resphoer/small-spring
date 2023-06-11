package springframework.beans.factory.support;

import springframework.beans.BeansException;
import springframework.core.io.Resource;
import springframework.core.io.ResourceLoader;

/**
 * 读取BeanDefinition接口
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
