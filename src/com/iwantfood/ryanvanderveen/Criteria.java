package com.iwantfood.ryanvanderveen;

import android.content.Context;
import android.content.res.Resources;

public abstract class Criteria {
	final int NUM_CRITERIA = 3;
	final int NUM_CRITERIA_ONE_PERCENT = 4;
	protected String title;
	protected String header;
	//protected Context context;
	protected Resources res;
	protected String criteria[] = new String[NUM_CRITERIA];
	
	public Criteria(Resources _resources) {
		//context = _context;
		res = _resources;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHeader() {
		return header	;
	}
	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public String toString() {
		String ret;
		ret = getClass().getName() + "[" +
				"title=" + title + ", " + "\n" +
				"header=" + header + ", " + "\n";	
		
		for (String s : criteria) {
			ret += "criteria";
			ret += s;
			ret += "---";
		}
				
		ret += "]";
		
		return ret;
	}
	
}
