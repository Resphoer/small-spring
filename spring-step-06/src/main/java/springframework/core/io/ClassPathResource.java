package springframework.core.io;

import cn.hutool.core.lang.Assert;
import springframework.util.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 根据路径获取资源类
 */
public class ClassPathResource implements Resource {
    private final String path;

    private ClassLoader classLoader;

    public ClassPathResource(String path, ClassLoader classLoader) {
        Assert.notNull(path, "Path must not be null");
        this.path = path;
        this.classLoader = classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader();
    }

    public ClassPathResource(String path) {
        this(path, (ClassLoader) null);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream resource = classLoader.getResourceAsStream(path);
        if (resource == null) {
            throw new FileNotFoundException(this.path + "cannot be opened because it does not exist");
        }
        return resource;
    }
}
