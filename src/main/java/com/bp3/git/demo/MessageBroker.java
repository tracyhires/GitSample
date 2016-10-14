package com.bp3.git.demo;

public interface MessageBroker {

	void sendMessage(Message m);
	
	Message receive();
	
	void disconnect();
}
