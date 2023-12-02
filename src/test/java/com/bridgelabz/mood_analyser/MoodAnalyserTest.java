package com.bridgelabz.mood_analyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
* @Desc:MoodAnalyserTest class is containing a
  givenTheMoodShouldReturnSad() and givenTheMoodShouldReturnHappy().
**/
public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser=new MoodAnalyser();
    //givenTheMoodShouldReturnSad() is analyseMood() comparing with the sad mood.
    @Test
    public void givenTheMoodShouldReturnSad(){
        String mood=moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }

    //givenTheMoodShouldReturnHappy() is analyseMood() comparing with the happy mood.
    @Test
    public void givenTheMoodShouldReturnHappy(){
        String mood=moodAnalyser.analyseMood("I am in happy mood");
        Assertions.assertEquals("HAPPY",mood);
    }
}
