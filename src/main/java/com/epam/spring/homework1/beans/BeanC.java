package com.epam.spring.homework1.beans;

import com.epam.spring.homework1.abstraction.Validator;

public class BeanC implements Validator {
    String name;
    int value;

    public BeanC(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void validate() {
        if (name!=null&&value>=0){
            System.out.println("valid C");
        }
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
