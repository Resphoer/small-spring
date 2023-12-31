package springframework.core.io;

/**
 * 资源加载器接口
 */
public interface ResourceLoader {
    /**
     *  Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";
    Resource getResource(String location);
}
