package com.example.configs;

import com.example.entities.Bobik;
import com.example.entities.Cat;
import com.example.entities.Dog;
import com.example.entities.Elephant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat(Elephant elephant){
        Cat cat = new Cat();
        cat.setName(elephant.getName() + " killer");
        return cat;
    }
    @Bean("Dog")
    public Dog getDog(){
        return new Dog();
    }
    @Bean
    public Elephant getElephant(){
        return new Elephant();
    }

    @Bean("Bobik")
    public Bobik getBobik(){
        return new Bobik();
    }
}
