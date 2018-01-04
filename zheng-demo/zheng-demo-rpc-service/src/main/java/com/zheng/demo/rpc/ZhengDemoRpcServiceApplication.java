package com.zheng.demo.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @package: com.zheng.demo.rpc
 * @ClassName: ZhengDemoRpcServiceApplication
 * @Description:
 * @author: liting
 * @date: 2017-12-25 10:08
 */
public class ZhengDemoRpcServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZhengDemoRpcServiceApplication.class);

    public static void main(String[] args) throws IOException {
        LOGGER.info(">>>>> zheng-demo-rpc-service 正在启动 <<<<<");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        context.start();
        LOGGER.info(">>>>> zheng-demo-rpc-service 启动完成 <<<<<");
        System.in.read(); // 按任意键退出
    }
}
