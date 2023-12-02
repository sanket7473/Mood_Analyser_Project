package com.bridgelabz.mood_analyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
* @Desc:MoodAnalyserTest class is containing a
  givenTheMoodShouldReturnSad() and givenTheMoodShouldReturnHappy().
  *Updated code with UC1
**/
public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser=new MoodAnalyser();
    @Test
    //givenTheMoodShouldReturnSad() is analyseMood() comparing with the sad mood.
    public void givenTheMoodShouldReturnSad(){
        String mood=moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    //givenTheMoodShouldReturnHappy() is analyseMood() comparing with the sad mood.
    public void givenTheMoodShouldReturnHappy(){
        String mood=moodAnalyser.analyseMood("I am in happy mood");
        Assertions.assertEquals("HAPPY",mood);
    }
    @Test
    //givenTheMoodShouldReturnSadUsingConstructor () comparing with the sad mood.
    public void givenTheMoodShouldReturnSadUsingConstructor(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in sad mood");
        Assertions.assertEquals("SAD",moodAnalyser.analyseMoodConstructor());
    }
    @Test
    //givenTheMoodShouldReturnSadUsingConstructor () comparing with the happy  mood.
    public void givenTheMoodShouldReturnHappyUsingConstructor(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in happy mood");
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMoodConstructor());
    }
    @Test
    //givenTheNullMoodShouldReturnHappyHandleUsingTryCatch () for null pointer exception
    public void givenTheNullMoodShouldReturnHappyHandleUsingTryCatch(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        Assertions.assertEquals("HAPPY",moodAnalyser.analyseMoodConstructorUsingTryCatch());
    }

}
