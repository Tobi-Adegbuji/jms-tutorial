package dev.tobiadegbuji.jmstutorial.utils;

import com.github.javafaker.Faker;

public class FakerUtil {

    private static final Faker faker = Faker.instance();

    public static String getRandomName(){
        return faker.funnyName().name();
    }

}
