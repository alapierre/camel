/**
 * Copyright 2016-02-17 the original author or authors.
 */
package pl.com.softproject.camel.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public class CamelContext {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("camel-context.xml");



    }

}
