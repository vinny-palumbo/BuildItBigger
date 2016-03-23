package com.udacity.gradle.jokes;

import java.util.Random;

public class Joker {
    String[] jokesArray = {
        "Joke A",
        "Joke B",
        "Joke C",
        "Joke D",
        "Joke E",
        "Joke F",
        "Joke G",
        "Joke H",
        "Joke I",
        "Joke J"
    };

    public String getJoke(){
        Random random = new Random();
        int index = random.nextInt(10);
        return jokesArray[index];
    }

}