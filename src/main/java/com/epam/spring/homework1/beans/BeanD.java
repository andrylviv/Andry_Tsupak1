package com.epam.spring.homework1.beans;

import com.epam.spring.homework1.abstraction.Validator;

public class BeanD implements Validator {
    String name;
    int value;

    public BeanD(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void validate() {
        if (name!=null&&value>=0){
            System.out.println("valid D");
        }
    }

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
