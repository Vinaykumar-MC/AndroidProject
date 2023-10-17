package com.example.writers_pad;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder2> {

    protected Context context;
//private int lastposition=-1;
    List<WeighingMachins> lists2;

    public Adapter2( Context context, List<WeighingMachins> lists2) {
        this.context = context;
        this.lists2 = lists2;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder2(LayoutInflater.from(parent.getContext()).inflate(R.layout.weighing_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder, int position) {
        holder.matchinName.setText(lists2.get(position).getMatchinName());
        holder.status.setText(lists2.get(position).getStatus());
//        holder.btn.setChecked(position==lastposition);
    }

    @Override
    public int getItemCount() {
        return lists2.size();
    }

    class ViewHolder2 extends RecyclerView.ViewHolder{
           private TextView matchinName,status;
//           RadioButton btn;
           CardView cardView;
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            matchinName=itemView.findViewById(R.id.machinName);
            status=itemView.findViewById(R.id.avail);
//            btn=itemView.findViewById(R.id.radioButton);
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    int copyOfLast =lastposition;
//                    lastposition=getAdapterPosition();
//                    notifyItemChanged(copyOfLast);
//                    notifyItemChanged(lastposition);
//                }
//            });
            cardView=itemView.findViewById(R.id.weightDesign);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                String name=matchinName.getText().toString();
                    Intent intent=new Intent(context, SecondActivity.class);
                    intent.putExtra("key",name);
                    Toast.makeText(context,"connected to"+name,Toast.LENGTH_SHORT).show();
                    context.startActivity(intent);

                }
            });
        }
    }
}
