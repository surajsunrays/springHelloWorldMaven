package com.app.test;

import com.app.bean.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(r);
        HelloWorld h= (HelloWorld) beanFactory.getBean("hello");
        h.Hello();
    }
}
