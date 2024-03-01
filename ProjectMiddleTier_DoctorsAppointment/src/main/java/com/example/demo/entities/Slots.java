package com.example.demo.entities;

import java.time.LocalTime;

public class Slots {

	LocalTime slot_time;
	
	int status;

	public Slots() {
		super();
		this.status=1;
		// TODO Auto-generated constructor stub
	}

	public Slots(LocalTime slot_time, int status) {
		super();
		this.slot_time = slot_time;
		this.status = status;
	}

	public LocalTime getSlot_time() {
		return slot_time;
	}

	public void setSlot_time(LocalTime slot_time) {
		this.slot_time = slot_time;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
