package com.listview;

import java.util.ArrayList;
import java.util.List;


import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;

import android.widget.ListView;


public class MainActivity extends ActionBarActivity {
	ListView listview;
List<ItemBean> mData_lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 listview = (ListView) findViewById(R.id.ListView);
		mData_lv = new ArrayList<ItemBean>();
		for (int i = 0; i < 10; i++) {
			mData_lv.add(
					new ItemBean(
					 "ÐÂ¾Å¶°-"+i,
					 "222-"+i,
					"2016.9.3-"+i,  
					 "²é¿´"));
			
		}
		MyAdapter myAdapter = new MyAdapter(null, mData_lv) ;
		listview.setAdapter(myAdapter);
		
	}


}
