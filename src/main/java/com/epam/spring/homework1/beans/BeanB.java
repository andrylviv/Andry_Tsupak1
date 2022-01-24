package com.epam.spring.homework1.beans;

import com.epam.spring.homework1.abstraction.Validator;

public class BeanB implements Validator {
    String name;
    int value;

    public BeanB(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void validate() {
        if (name!=null&&value>=0){
            System.out.println("valid B");
        }
    }

    public void init(){
        System.out.println("init method beanB set by BFPP");
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
