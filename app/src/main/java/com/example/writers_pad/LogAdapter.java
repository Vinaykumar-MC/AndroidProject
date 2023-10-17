package com.example.writers_pad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LogAdapter extends RecyclerView.Adapter<LogAdapter.ViewHolder3>{

List<UserModel> lists;
    Context context;

 private int lastPos=-1;
    public LogAdapter( List<UserModel> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder3(LayoutInflater.from(parent.getContext()).inflate(R.layout.log_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder3 holder, int position) {
 holder.time.setText(String.valueOf(lists.get(position).getId()));
 holder.mark.setText(String.valueOf(lists.get(position).getAlbumId()));

 String  title=lists.get(position).getTitle();
 String title_first []=title.split(" ");
 holder.weight.setText(title_first[0].toString());

 String url =lists.get(position).getUrl();
 String url_first[]=url.split("/");
 holder.status.setText(url_first[0].toString());

        holder.rBtn.setChecked(position==lastPos);
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class ViewHolder3 extends RecyclerView.ViewHolder{
private TextView time,mark,weight,status;
private RadioButton rBtn;
private CardView cardView;
        public ViewHolder3(@NonNull View itemView) {
            super(itemView);
            time=itemView.findViewById(R.id.txt1);
            mark=itemView.findViewById(R.id.txt2);
            weight=itemView.findViewById(R.id.txt3);
            status=itemView.findViewById(R.id.txt4);
            rBtn=itemView.findViewById(R.id.logRadio);
            cardView=itemView.findViewById(R.id.logCard);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int copyOfLast =lastPos;
                    lastPos=getAdapterPosition();
                    notifyItemChanged(copyOfLast);
                    notifyItemChanged(lastPos);
                }
            });

        }
    }
}
