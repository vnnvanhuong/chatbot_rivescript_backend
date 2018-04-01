package vn.nvanhuong.chatbot.rivescript.backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vn.nvanhuong.chatbot.rivescript.backend.ChatBot;

public class ChatBotTest {
	
	@Test
	public void should_say_hello() {
		ChatBot bot = new ChatBot();
		
		assertEquals("Hello Human!", bot.getMsg("Hello Bot"));
	}
}
