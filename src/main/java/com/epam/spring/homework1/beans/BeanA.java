package com.epam.spring.homework1.beans;

import com.epam.spring.homework1.abstraction.Validator;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean, Validator {
    String name;
    int value;

    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void validate() {
        if (name!=null&&value>=0){
            System.out.println("valid A");
        }
    }

    private void customInitMethod() {
        System.out.println("in beanA init method");
    }

    private void customDestroyMethod() {
        System.out.println("in beanA destroy method");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("inside beanA InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void destroy() {
        System.out.println("inside beanA DisposableBean.destroy()");
    }
}
