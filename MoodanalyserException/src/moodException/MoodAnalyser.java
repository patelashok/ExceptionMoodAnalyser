package moodException;

public class MoodAnalyser {

public String message;

	public MoodAnalyser(String message){ 
		this.message = message;
	}
	public String analyseMood(String message){ 
		this.message = message;
		return analyseMood();
	}
	public String analyseMood(){
		try {
		if (message.contains("sad"))
			return "SAD";
		else
		 	return "HAPPY";
		}catch (NullPointerException e) {
			return "HAPPY";
	
		}
	}
}	