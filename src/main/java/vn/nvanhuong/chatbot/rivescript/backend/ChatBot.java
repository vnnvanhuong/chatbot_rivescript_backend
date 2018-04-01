package vn.nvanhuong.chatbot.rivescript.backend;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.rivescript.Config;
import com.rivescript.RiveScript;
import com.sun.jersey.spi.resource.Singleton;

@Path("/bot")
@Singleton
public class ChatBot {
	private RiveScript bot;
	
	public ChatBot() {
		String rivescriptFilePath = ChatBot.class.getClassLoader().getResource("rivescript").getFile();
		bot = new RiveScript(Config.utf8());
		
		bot.loadDirectory(rivescriptFilePath);
        bot.sortReplies();
	}
	
	@POST
	public String getMsg(String msg) {
		return bot.reply("user", msg);
	}

}
