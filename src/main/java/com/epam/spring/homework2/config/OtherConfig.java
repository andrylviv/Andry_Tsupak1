package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("bean-prop")
public class OtherConfig {
    @Value("${beanB.name}")
    private String nameB;
    @Value("${beanB.value}")
    private int valueB;

    @Value("${beanC.name}")
    private String nameC;
    @Value("${beanC.value}")
    private int valueC;

    @Value("${beanD.name}")
    private String nameD;
    @Value("${beanD.value}")
    private int valueD;

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    @DependsOn(value = {"beanD"})
    public BeanB beanB(){
        return new BeanB(nameB, valueB);
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    @DependsOn(value = {"beanB"})
    public BeanC beanC(){
        return new BeanC(nameC, valueC);
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanD beanD(){
        return new BeanD(nameD, valueD);
    }
}
