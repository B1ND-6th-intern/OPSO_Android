package org.techtown.opso_android;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home_Page_Info_Adapter extends RecyclerView.Adapter<Home_Page_Info_Adapter.ViewHolder> {
    private ArrayList<Home_Page_Info> items;

    public Home_Page_Info_Adapter(ArrayList<Home_Page_Info> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.home_page_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Home_Page_Info item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView classNum;
        ImageView picture;
        Button name;
        TextView contents;
        TextView hash;

        Button cmt_name;
        TextView cmt_contents;
        TextView cmt_classNum;


        public ViewHolder(View itemView) {
            super(itemView);

            classNum = itemView.findViewById(R.id.classNum);
            date = itemView.findViewById(R.id.date);
            picture = itemView.findViewById(R.id.picture);
            name = itemView.findViewById(R.id.name);
            contents = itemView.findViewById(R.id.contents);
            hash = itemView.findViewById(R.id.hash);

            cmt_name = itemView.findViewById(R.id.cmt_name);
            cmt_contents = itemView.findViewById(R.id.cmt_contents);
            cmt_classNum = itemView.findViewById(R.id.cmt_classNum);


        }

        public void setItem(Home_Page_Info item) {
            classNum.setText(item.getClassNum());
            date.setText(item.getDate());
            name.setText(item.getName());
            contents.setText(item.getContents());
            hash.setText(item.getHash());

            cmt_name.setText(item.getCmt_name());
            cmt_contents.setText(item.getCmt_contents());
            cmt_classNum.setText(item.getCmt_classNum());

            picture.setBackground(new ShapeDrawable(new OvalShape()));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                picture.setClipToOutline(true);
            }
        }
    }

    public void addItem(Home_Page_Info item) {
        items.add(item);
    }

    public void setItems(ArrayList<Home_Page_Info> items) {
        this.items = items;
    }

    public Home_Page_Info getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, Home_Page_Info item) {
        items.set(position, item);
    }
}
