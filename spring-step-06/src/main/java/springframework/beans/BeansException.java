package springframework.beans;

/**
 * 定义 Bean 异常
 */
public class BeansException extends RuntimeException {
    /**
     * 构造异常
     * @param msg 异常信息
     */
    public BeansException(String msg) {
        super(msg);
    }

    /**
     * 构造异常
     * @param msg 异常信息
     * @param cause 异常原因
     */
    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
