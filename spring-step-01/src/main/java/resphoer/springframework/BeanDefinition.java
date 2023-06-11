package resphoer.springframework;

/**
 * 定义bean对象
 */
public class BeanDefinition {
    private Object bean;

    // 定义bean对象
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    // 获取被定义的bean对象
    public Object getBean() {
        return bean;
    }
}
