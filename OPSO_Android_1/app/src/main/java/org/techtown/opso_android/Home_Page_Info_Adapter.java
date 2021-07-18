package org.techtown.opso_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class Home_Page_Info_Adapter extends RecyclerView.Adapter<Home_Page_Info_Adapter.ViewHolder> {
    private ArrayList<Home_Page_Info> items;
    private LayoutInflater mInflate;
    private Context mContext;


    public Home_Page_Info_Adapter(Context context, ArrayList<Home_Page_Info> items) {
        this.mContext = context;
        this.mInflate = LayoutInflater.from(context);
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
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

        String url = items.get(position).picture;
        Glide.with(viewHolder.itemView.getContext())
                .load(url)
                .into(viewHolder.picture);

        viewHolder.name.setText(items.get(position).name);
        viewHolder.classNum.setText(items.get(position).classNum);
        viewHolder.cmt_classNum.setText(items.get(position).cmt_classNum);
        viewHolder.name.setText(items.get(position).name);
        viewHolder.contents.setText(items.get(position).contents);
        viewHolder.date.setText(items.get(position).date);
        viewHolder.hash.setText(items.get(position).hash);
        viewHolder.cmt_name.setText(items.get(position).cmt_name);
        viewHolder.cmt_contents.setText(items.get(position).cmt_contents);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView classNum;
        ImageView picture;
        TextView name;
        TextView contents;
        TextView hash;

        TextView cmt_name;
        TextView cmt_contents;
        TextView cmt_classNum;


        public ViewHolder(View itemView) {
            super(itemView);

            classNum = (TextView)itemView.findViewById(R.id.classNum);
            date = (TextView)itemView.findViewById(R.id.date);
            picture = (ImageView)itemView.findViewById(R.id.picture);
            name = (TextView)itemView.findViewById(R.id.name);
            contents = (TextView)itemView.findViewById(R.id.contents);
            hash = (TextView)itemView.findViewById(R.id.hash);

            cmt_name = (TextView)itemView.findViewById(R.id.cmt_name);
            cmt_contents = (TextView)itemView.findViewById(R.id.cmt_contents);
            cmt_classNum = (TextView)itemView.findViewById(R.id.cmt_classNum);


        }


    }
}
