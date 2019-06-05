package net.h2so.alphalock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description Spring配置
 * @Auther mikicomo
 * @Date 2019-06-04 15:51
 */
@Configuration
@ComponentScan(basePackages = "net.h2so.alphalock")
@EnableAspectJAutoProxy
public class SpringConfigManager {

}
