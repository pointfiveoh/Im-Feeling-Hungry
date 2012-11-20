package com.iwantfood.ryanvanderveen;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class CriteriaFragmentActivity extends FragmentActivity {
	private List<CriteriaFragment> 	fragments;			//individual criterion fragment
    private SectionsPagerAdapter 	mSectionsPagerAdapter;		//adapter for the pager
    private ViewPager				mViewPager;					//the actual content for the viewpager
    private CriteriaFragment 		EnergyFragment;
    private CriteriaFragment 		HungerFragment;
    private CriteriaFragment 		CostFragment;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.criteriafragmentpageradapter);
        //instantiate the list of fragments
        fragments = new ArrayList<CriteriaFragment>();
        //build the fragments and corrosponding args
        buildFragmentList();
        //add the built fragments to the list
        fragments.add(EnergyFragment);
        fragments.add(HungerFragment);
        fragments.add(CostFragment);
        
     	// Create the adapter that will return a fragment for each of user
        //the three primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.criteria_pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);        
    }

    private void buildFragmentList() {   	
        Bundle eArgs = new Bundle();
        eArgs.putInt("num", 0);
        EnergyFragment = new CriteriaFragment();
        EnergyFragment.setArguments(eArgs);        
        
        Bundle hArgs = new Bundle();
        hArgs.putInt("num", 1);
        HungerFragment = new CriteriaFragment();
        HungerFragment.setArguments(hArgs);
        
        Bundle cArgs = new Bundle();
        cArgs.putInt("num", 2);
        CostFragment = new CriteriaFragment();
        CostFragment.setArguments(cArgs);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.criteriafragmentpageradapter, menu);
        return true;
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to one of the primary
     * sections of the app.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragments.get(i);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0: return getString(R.string.energy).toUpperCase();
                case 1: return getString(R.string.hunger).toUpperCase();
                case 2: return getString(R.string.cost).toUpperCase();
            }
            return null;
        }
    }
}
