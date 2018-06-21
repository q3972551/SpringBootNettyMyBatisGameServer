package common.listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 启动监听类
 * @author peanut
 * @date   2018/05/24
 */


public class StartupListener implements ApplicationContextAware{

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.init();
        System.out.println("Application start!  AccessStart...");
    }

    /**
     * 初始化
     */
    private void init()
    {

    }
}
