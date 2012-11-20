package com.iwantfood.ryanvanderveen;

import android.content.Context;
import android.content.res.Resources;

public class HungerCriteria extends Criteria {
	
	private static final long serialVersionUID = -8705088710462509390L;

	public HungerCriteria(Resources _resources) {
		//call parent/super class's constructor to instantiate res/context objects
		super (_resources);
		//instantiate the variables
		criteria = res.getStringArray(R.array.HungerCriteria);
		this.title = "Hunger";
		this.header = "I'm currently: ";
	
	}
}
