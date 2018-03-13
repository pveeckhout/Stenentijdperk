package com.pietervaneeckhout.stenentijdperk.events;

public interface Event {

	Class<? extends Event> getType();
}
