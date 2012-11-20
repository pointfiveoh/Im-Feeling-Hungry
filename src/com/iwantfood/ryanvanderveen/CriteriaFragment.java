package com.iwantfood.ryanvanderveen;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CriteriaFragment extends ListFragment {
	public static final String ARG_SECTION_NUMBER = "section_number";
	private int mNum;	//used for position/num tracking (from args etc)
	private Resources resources;
	private EnergyCriteria ec;
	private HungerCriteria hc;
	private CostCriteria cc;
	    
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mNum = getArguments() != null ? getArguments().getInt("num") : 1;
		resources = this.getResources();
		
		if (mNum == 0)
			ec = new EnergyCriteria(resources);
		else if (mNum == 1)
			hc = new HungerCriteria(resources);
		else if (mNum == 2)
			cc = new CostCriteria(resources);
		else
			Log.wtf("WTFWTFWTFWTFWTFWTFWTFWTFWTF" , "FAILURE ON ARGS NUM <> 0,1,or2");
    
    }

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		//custom view loaded from criteria xml layout file.
		View view = inflater.inflate(R.layout.criterion_pages, container, false);        
        return view;
	}
	
	/**
	 * This method generates the UI from the Criteria class(es)
	 */
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Bundle args = getArguments();
		
		if (args.getInt("num") == 0)
			setListAdapter(new ArrayAdapter<String>(getActivity(), 
					android.R.layout.simple_list_item_1, ec.criteria));
		else if (args.getInt("num") == 1)
			setListAdapter(new ArrayAdapter<String>(getActivity(), 
					android.R.layout.simple_list_item_1, hc.criteria));
		else if (args.getInt("num") == 2)
			setListAdapter(new ArrayAdapter<String>(getActivity(), 
					android.R.layout.simple_list_item_1, cc.criteria));
	}
	
	/**
	 * This method is an eventhandler for selecting an item in the list.
	 * Not sure if this will be "remembered" by the app if the user scrolls
	 * back a fragment or two. Needs implementation
	 */
	public void onListItemClick(ListView l, View v, int position, long id) {
		String data = (String) getListView().getItemAtPosition(position);
		Log.i("**************************", data);
		
		switch(position) {
		case 0:
			//record selection
			//switch to fragment 1
		case 1:
			//record selection
			//switch to fragment 2
		case 2:
			//record selection
			//switch to fragment 3
		case 3:
			//record selection
			//submit to Maps Engine/Activity?
		default:
			//throw error
		}
		
		
	}
	
	
	
	
}