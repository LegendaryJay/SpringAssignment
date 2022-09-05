package edu.wctc.springassignment;

import edu.wctc.springassignment.iface.SalesInput;
import edu.wctc.springassignment.iface.SalesReport;
import edu.wctc.springassignment.iface.ShippingPolicy;
import edu.wctc.springassignment.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.springassignment")
public class AppConfig {

    @Bean
    public SalesReport salesReport(){
        return new byCountryReport();
    }

    @Bean
    public SalesInput salesInput(){
        return new FileInput();
//        return new ConsoleInput();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return new FreeShippingPolicy();
    }
}
