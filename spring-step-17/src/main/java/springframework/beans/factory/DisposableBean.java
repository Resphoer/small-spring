package springframework.beans.factory;

/**
 * 释放资源和销毁Bean
 */
public interface DisposableBean {
    void destroy() throws Exception;
}
