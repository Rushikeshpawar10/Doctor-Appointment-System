package com.example.demo.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.time.LocalTime;

public class SlotSchedule {

	Date date;
	
	List<Slots> slots;

	public SlotSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SlotSchedule(Date date, List<Slots> slots) {
		super();
		this.date = date;
		this.slots = slots;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Slots> getSlots() {
		return slots;
	}

	public void setSlots(List<Slots> slots) {
		this.slots = slots;
	}

	

	
	
	
}
