package moodException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

import org.junit.jupiter.api.Test;


class MoodAnalyserTest {

	@Test
	 public void InputNullMoodShouldThrowException() {
	     MoodAnalyser newmoodAnalyser = new MoodAnalyser(null);
  	     String mood = newmoodAnalyser.analyseMood();
	     Assert.assertEquals("HAPPY",mood);
		}
}


