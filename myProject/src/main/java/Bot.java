import com.viber.bot.Request;
import com.viber.bot.api.ViberBot;
import com.viber.bot.profile.BotProfile;

public class Bot {

	public static void main(String[] args){
		ViberBot bot = new ViberBot(new BotProfile("SampleBot", "http://viber.com/avatar.jpg"), "4cc02c8f73a7d3bf-a3827ce94adcb153-ff77dede97bb5b8b");
	    
		bot.onMessageReceived((event, message, response) -> response.send(message));

	     //somewhere else in your web server of choice:
	    bot.incoming(Request.fromJsonString("..."));
	}
}