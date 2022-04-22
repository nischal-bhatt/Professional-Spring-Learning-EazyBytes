package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Beer;
import com.example.beans.Vehicle;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
@ComponentScan(basePackages="com.example.beans")
public class ProjectConfig {


    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
	
    @Bean
    Vehicle vehiclez() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi 823");
        return veh;
    }
    @Primary
    @Bean(name="ferr")
    Vehicle vehiclez3() {
        Vehicle veh = new Vehicle();
        veh.setName("ferrar");
        return veh;
    }
    
    
    @Bean
    Vehicle vehiclez2() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi 823---");
        return veh;
    }

    @Bean(name = "beerla")
    Beer Beer3() {
        Beer beerboy = new Beer();
        beerboy.setName("piminto");
        return beerboy;
    }
    
    /*
    The method names usually follow verbs notation.But for methods
    which we will use to create beans, can use nouns as names.
    This will be a good practise as the method names will become
    bean names as well in the context.
    * */
    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}

//stereotype annotations in spring - readability
/*
@Component
@service
@Repository
@Controller

comparison between bean vs component 
1. @Bean can create many bean instances 
2. @Component we can only create beans of dev classes
3. @Component write less code
4. @Bean developer can have more control
5. @Bean created based on instructions given by dev


*/