package edu.wctc.springassignment;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((TheReport)context.getBean("theReport")).generateReport();
    }

}

/*
Use different shipping policies to determine the shipping amount for an order.
For example: free shipping, flat-rate domestic shipping, free shipping for orders over $X
Produce a detailed sales report or a summary report by country
 */