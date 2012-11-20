package com.iwantfood.ryanvanderveen;

import android.content.Context;
import android.content.res.Resources;

public class EnergyCriteria extends Criteria {
	
	private static final long serialVersionUID = -7142831650769879506L;

	public EnergyCriteria(Resources _resources) {
		//call parent/super class's constructor to instantiate res/context objects
		super(_resources);
		//instantiate the variables
		criteria = res.getStringArray(R.array.EnergyCriteria);
		this.title = "Energy";
		this.header = "I'm feeling: ";
	}
	
	
}
