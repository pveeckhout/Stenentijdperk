package com.pietervaneeckhout.stenentijdperk.events;

public interface Handler<E extends Event> {

	void onEvent(E event);

	void reset();

	void recover();
}
