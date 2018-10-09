package com.demo.service.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@EnableTransactionManagement
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "com.demo.service.**.mapper")
public class MybatisPlusConfiguration {
/*    private static Log logger = LogFactory.getLog(MybatisPlusConfiguration.class);
    @Value("${mybatis-plus.type-aliases-package}")
    private String typeAliasesPackage;

    @Value("${mybatis-plus.mapper-locations}")
    private String mapperLocations;
    @Autowired
    private DataSource dataSource;*/

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

    //分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

/*        // 提供SqlSeesion
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        try {
            MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
            sqlSessionFactory.setDataSource(dataSource);
*//*            // 读取配置
            sqlSessionFactory.setTypeAliasesPackage(typeAliasesPackage);
            //
            Resource[] resources = new PathMatchingResourcePatternResolver()
                    .getResources(mapperLocations);
            sqlSessionFactory.setMapperLocations(resources);*//*

            MybatisConfiguration configuration = new MybatisConfiguration();
            //configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
            configuration.setJdbcTypeForNull(JdbcType.NULL);
            configuration.setMapUnderscoreToCamelCase(true);
            configuration.setCacheEnabled(false);
            sqlSessionFactory.setConfiguration(configuration);
            //sql

            return sqlSessionFactory.getObject();
        } catch (IOException e) {
            logger.error("mybatis resolver mapper*xml is error", e);
            return null;
        } catch (Exception e) {
            logger.error("mybatis sqlSessionFactoryBean create error", e);
            return null;
        }
    }*/
}
