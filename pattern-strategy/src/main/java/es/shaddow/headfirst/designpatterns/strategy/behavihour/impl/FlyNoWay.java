package es.shaddow.headfirst.designpatterns.strategy.behavihour.impl;

import es.shaddow.headfirst.designpatterns.strategy.behavihour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	public void fly() {
		System.out.println("I can´t fly");
	}

}
