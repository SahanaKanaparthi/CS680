package edu.umb.cs680.hw13.multicast;

public class DJIAEvent {
	private float eventDjia;

	public float getDjia() {
		return eventDjia;
	}

	public DJIAEvent(float djia) {
		this.eventDjia = djia;
	}

	public void setDjia(float djiaEvent) {
		this.eventDjia = djiaEvent;
	}
	public static void main(String[] args) {
		System.out.println("DJIAEvent is successfully running!");
	}
}
