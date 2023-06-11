package springframework.beans.factory;

import springframework.beans.BeansException;

/**
 * 实现此接口，可以感知所属的ClassLoader类加载器
 */
public interface BeanClassLoaderAware extends Aware{
    void setBeanClassLoader(ClassLoader classLoader);
}
