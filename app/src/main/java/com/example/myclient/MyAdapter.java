package com.example.myclient;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myclient.R;

/**
 * Created by xzh on 8/10/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    String data[];
    private OnItemClickListener listener;
    public interface OnItemClickListener {
        public void onItemClickListener(int position);
        public void onItemLongClickListener(int position);
    }

    public MyAdapter(String[] data){
        this.data=data;
        this.listener = listener;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {
        holder.tv_viewHolder.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_viewHolder;
        private OnItemClickListener mListener;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_viewHolder= (TextView) itemView.findViewById(R.id.tv_item);

        }


    }
}