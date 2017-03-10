package bbs.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by jun on 17/3/10.
 * 数据源设置 包括数据库用户名 密码等
 */
@Configuration
public class DataBaseConfig {

    /**
     * 将数据源 打包成Bean
     * DruidDataSource by alibaba 只要设置initialSize 和 maxActive即可
     */
    @Bean(name = "datasource")
    public DataSource druidDataSource(Environment env) {
        DruidDataSource druidDataSource = new DruidDataSource();

        // env 可以视为 application.properties配置文件
        druidDataSource.setDriverClassName(env.getProperty("bbs.driver"));
        druidDataSource.setUrl(env.getProperty("bbs.dbUrl"));
        druidDataSource.setUsername(env.getProperty("bbs.dbUserName"));
        druidDataSource.setPassword(env.getProperty("bbs.dbPassowrd"));

        /**
         *  DruidDataSource 方法
         */
        // 检测连接是否有效
        druidDataSource.setValidationQuery("SELECT 1 FROM DUAL");
        // 初始化时建立连接个数
        druidDataSource.setInitialSize(5);
        // 最大连接数
        druidDataSource.setMaxActive(10);

        return druidDataSource;
    }
}
