package com.epam.spring.homework1.config;

import com.epam.spring.homework1.processor.MyBeanFactoryPostProcessor;
import com.epam.spring.homework1.processor.MyBeanPostProcessor;
import com.epam.spring.homework1.beans.BeanA;
import com.epam.spring.homework1.beans.BeanE;
import com.epam.spring.homework1.beans.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import(OtherConfig.class)
public class BeansConfig {
    @Bean(initMethod = "customInitMethod",destroyMethod = "customDestroyMethod")
    public BeanA beanA(){
        return new BeanA("beanA", 1);
    }

    @Bean
    public BeanE beanE(){
        return new BeanE("beanE",2);
    }

    @Bean
    @Lazy
    public BeanF beanF(){
        return new BeanF("beanF", 3);
    }

    @Bean
    public static MyBeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    public static MyBeanPostProcessor beanPostProcessor(){
        return new MyBeanPostProcessor();
    }
}