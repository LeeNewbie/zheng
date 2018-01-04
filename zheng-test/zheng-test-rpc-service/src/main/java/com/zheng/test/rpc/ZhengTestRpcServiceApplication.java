package com.zheng.test.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @package: com.zheng.test.rpc
 * @ClassName: ZhengTestRpcServiceApplication
 * @Description:
 * @author: liting
 * @date: 2017-12-26 10:37
 */
public class ZhengTestRpcServiceApplication {
    public static final Logger LOGGER = LoggerFactory.getLogger(ZhengTestRpcServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> zheng-demo-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        LOGGER.info(">>>>> zheng-demo-rpc-service 启动完成 <<<<<");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
