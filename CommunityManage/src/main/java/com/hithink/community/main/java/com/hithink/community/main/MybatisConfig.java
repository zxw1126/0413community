package com.hithink.community.main;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@PropertySource(value = {"classpath:jdbc.properties"}, ignoreResourceNotFound = true)
public class MybatisConfig implements TransactionManagementConfigurer {

    private DriverManagerDataSource driverManagerDataSource;

    @Value("${}jdbc.url")
    private String jdbcUrl;
    @Value("${}jdbc.driverNameClass")
    private String driverNameClass;
    @Value("${}jdbc.username")
    private String username;
    @Value("${}jdbc.password")
    private String password;

    public DriverManagerDataSource driverManagerDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(driverNameClass);
        driverManagerDataSource.setPassword(password);
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setUrl(jdbcUrl);
        return driverManagerDataSource;
    }

    public SqlSessionFactory sqlSessionFactory() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(driverManagerDataSource);
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources("classpath:mapper/*.xml"));
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }



    @Override
    public TransactionManager annotationDrivenTransactionManager() {
        return null;
    }
}
