package com.gnust.www.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

import javax.sql.DataSource;

/**
 * @BelongsProject: blog_system
 * @BelongsPackage: com.gnust.www.config
 * @FileName: SecurityConfig
 * @Author: Sube
 * @Date: 2023/9/5
 * @Version: 1.0
 * @Description: 1
 */
@EnableWebFluxSecurity
public class SecurityConfig extends WebSecurityConfiguration {
    @Autowired
    private DataSource dataSource;
    @Value("${COOKIE.VALIDITY}")
    private Integer COOKIE_VALIDITY;

    /**
     * 重写configure(HttpSecurity http)方法，进行用户授权管理
     * @param http
     * @throws Exception
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {


    }


}
