package com.pietervaneeckhout.stenentijdperk.events;

public abstract class AbstractEvent implements Event {

	public Class<? extends Event> getType() {
		return getClass();
	}
}
