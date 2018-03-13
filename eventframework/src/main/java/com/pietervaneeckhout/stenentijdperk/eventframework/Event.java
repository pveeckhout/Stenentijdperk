package com.pietervaneeckhout.stenentijdperk.eventframework;

public interface Event {

	Class<? extends Event> getType();
}
