package springframework.beans.factory;

/**
 * 实现此接口，可以感知所属的Bean对象名称
 */
public interface BeanNameAware extends Aware{
    void setBeanName(String name);
}
