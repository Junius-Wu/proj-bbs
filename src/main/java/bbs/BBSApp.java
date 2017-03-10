package bbs;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.BeansException;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by jun on 17/3/10.
 */
@SpringBootApplication//程序入口
@EnableCaching// 启用缓存支持
public class BBSApp extends SpringBootServletInitializer {


    public static void main(String args[]) {
        // 方式一：直接设置加载类 并 运行
        SpringApplication.run(BBSApp.class, args);

//        // 方式二：先获取SpringApplication，可以设置一些东西
//        // 设置加载类为BbsMain
//        SpringApplication springApplication = new SpringApplication(BBSApp.class);
//        //去掉运行时console中的Spring字样 没什么卵用
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        // 运行
//        springApplication.run(args);

    }


}
