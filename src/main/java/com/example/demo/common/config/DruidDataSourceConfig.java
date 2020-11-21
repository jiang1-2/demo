package com.example.demo.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"com.example.demo.mapper",},sqlSessionFactoryRef = "YHYCORESqlSessionFactory")
public class DruidDataSourceConfig {


    @Value("${spring.datasource.type}")
    private String type;
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;


    /**
     * 创建druid数据库连接池bean
     *
     * @return
     */
    @Bean(name = "SCMDataSource")
    @Primary
    public DataSource MMISDataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setDbType(type);
        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        return datasource;
    }
    @Bean(name = "OracleTransactionManager")
    @Primary
    public DataSourceTransactionManager OracleTransactionManager() {
        return new DataSourceTransactionManager(MMISDataSource());
    }

    @Bean(name = "YHYCORESqlSessionFactory")
    @Primary
    public SqlSessionFactory YHYCORESqlSessionFactory(
            @Qualifier("SCMDataSource") DataSource MMISDateSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(MMISDateSource);
        //开启驼峰
        sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sessionFactory.getObject();
    }


}