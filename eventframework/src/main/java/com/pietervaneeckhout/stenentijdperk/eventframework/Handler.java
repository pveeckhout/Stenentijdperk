package com.pietervaneeckhout.stenentijdperk.eventframework;

public interface Handler<E extends Event> {

	void onEvent(E event);

	void reset();

	void recover();
}
