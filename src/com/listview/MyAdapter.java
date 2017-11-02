package com.listview;

import java.util.List;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

private  List<ItemBean> mlvData;
private LayoutInflater mLayoutInflater;

	public MyAdapter(Context context,List<ItemBean> mlvData ) {

	this.mlvData = mlvData;
	this.mLayoutInflater = LayoutInflater.from(context);//context要使用当前的
	//Adapter的界面对象mInflater.布局装载对象
}


	public int getCount() {
	
		return mlvData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mlvData.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View converView, ViewGroup parent) {
		
		ViewHolder viewHolder =null; 
		if(converView ==null){
			viewHolder  = new ViewHolder(); 
			 converView = mLayoutInflater.inflate(R.layout.item, null);
			 viewHolder.tv_dong = (TextView) converView.findViewById(R.id.dong);
			 viewHolder.tv_su_num = (TextView) converView.findViewById(R.id.su_num);
			 viewHolder.dp = (TextView) converView.findViewById(R.id.datePicker1);
			 viewHolder.btn_check =(Button) converView.findViewById(R.id.check);
			 converView.setTag(viewHolder);
		}else {
			viewHolder = (ViewHolder) converView.getTag();	
		}
		ItemBean bean = mlvData.get(position);
		viewHolder.tv_dong.setText(bean.tvDong);
		 viewHolder.tv_su_num .setText(bean.tv_su_num);
		viewHolder.btn_check .setText(bean.btn_check);
		 viewHolder.dp.setText(bean.datePicker);
		
		return converView;
	}
	class ViewHolder{
		public TextView tv_dong,tv_su_num,  dp;
		public Button btn_check;
	
	}
	
}

