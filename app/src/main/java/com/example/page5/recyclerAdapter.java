package com.example.page5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Comment;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<item> iList;

    public recyclerAdapter(ArrayList<item> iList){
        this.iList = iList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView UserTxt;
        private TextView CommentTxt;

        public MyViewHolder(final View itemView){
            super(itemView);
            UserTxt = itemView.findViewById(R.id.textView1);
            CommentTxt = itemView.findViewById(R.id.textView2);
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String user = iList.get(position).getUser();
        String comment = iList.get(position).getComment();

        holder.UserTxt.setText(user);
        holder.CommentTxt.setText(comment);
    }

    @Override
    public int getItemCount() {
        return iList.size();
    }
}
