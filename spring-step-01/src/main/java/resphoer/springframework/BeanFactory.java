package resphoer.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    /**
     * 根据bean对象名称获取bean
     * @param name // bean对象名称
     * @return bean // 返回bean对象
     */
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 注册bean对象，相当于将被定义的bean对象存储到HashMap中
     * @param name // 对象名称
     * @param beanDefinition // 被定义的bean对象
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
