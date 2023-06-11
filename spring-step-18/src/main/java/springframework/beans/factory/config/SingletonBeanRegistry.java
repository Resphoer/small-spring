package springframework.beans.factory.config;

/**
 * 单例 bean 注册表接口
 */
public interface SingletonBeanRegistry {
    /**
     * 返回在给定名称下注册的（原始）单例对象。
     * @param beanName 单例 bean 的名称
     * @return 返回注册的单例对象
     */
    Object getSingleton(String beanName);

    /**
     * 注册单例对象
     * @param beanName 单例 bean 的名称
     * @param singletonObject 单例 bean 对象
     */
    void registerSingleton(String beanName, Object singletonObject);
}
