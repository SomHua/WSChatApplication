package com.wschatapplication.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.wschatapplication.handler.ChatWebSocketHandler;

import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;



@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer{

    private final static String CHAT_ENDPOINT = "/chat";

	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addHandler(getChatWebSocketHandler(), CHAT_ENDPOINT);
		
	}


	private WebSocketHandler getChatWebSocketHandler() {
		// TODO Auto-generated method stub
        return new ChatWebSocketHandler();
	}

}
