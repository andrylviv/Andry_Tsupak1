package com.epam.spring.homework1.config;

import com.epam.spring.homework1.beans.BeanB;
import com.epam.spring.homework1.beans.BeanC;
import com.epam.spring.homework1.beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("bean-prop")
public class OtherConfig {
    @Value("${beanB.name}")
    String nameB;
    @Value("${beanB.value}")
    int valueB;

    @Value("${beanC.name}")
    String nameC;
    @Value("${beanC.value}")
    int valueC;

    @Value("${beanD.name}")
    String nameD;
    @Value("${beanD.value}")
    int valueD;

    @Bean
    @DependsOn(value = {"beanD"})
    public BeanB beanB(){
        return new BeanB(nameB, valueB);
    }

    @Bean
    @DependsOn(value = {"beanB"})
    public BeanC beanC(){
        return new BeanC(nameC, valueC);
    }

    @Bean
    public BeanD beanD(){
        return new BeanD(nameD, valueD);
    }
}
