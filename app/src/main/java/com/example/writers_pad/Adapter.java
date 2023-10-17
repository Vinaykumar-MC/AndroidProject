package com.example.writers_pad;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    protected Context context;
    List<Users> lists;

//    private int newposition = -1;
    public Adapter(Context context,List<Users> lists) {
        this.context = context;
        this.lists=lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.buyerMark1.setText(lists.get(position).getBuyerMark());
       holder.lotQuantity.setText(lists.get(position).getLotQuantity());
        holder.lotMark.setText(lists.get(position).getLotMark());
        holder.packing.setText(lists.get(position).getPacking());
        holder.numberOfPacks.setText(lists.get(position).getNumberOfPacks());

//
//        if (position == newposition) {
//            holder.cardView.setCardBackgroundColor(context.getResources().getColor(R.color.yellow));
//
//        } else {
//            holder.cardView.setCardBackgroundColor(context.getResources().getColor(R.color.white));
//        }
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class   ViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;
//        private CardView cardview1;
        private TextView buyerMark1,lotQuantity,lotMark,packing,numberOfPacks;
        private int bar=0;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            buyerMark1=itemView.findViewById(R.id.dText1);
            lotMark=itemView.findViewById(R.id.dText3);
            lotQuantity=itemView.findViewById(R.id.dText4);
            packing=itemView.findViewById(R.id.dText5);
            numberOfPacks=itemView.findViewById(R.id.dText6);
            cardView=itemView.findViewById(R.id.card11);
//            cardview1=itemView.findViewById(R.id.card11);

            ProgressBar progressBar=itemView.findViewById(R.id.pbLot);
            cardView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
//                    int oldposition = newposition;
//                        newposition=getAdapterPosition();
////                        if(oldposition !=-1){
////                            notifyItemChanged(oldposition);
////                        }
                    if (bar < 75) {
                        bar += 25;
                        progressBar.setProgress(bar);
                        cardView.setCardBackgroundColor(itemView.getResources().getColor(R.color.yellow));
                    } else {
                        bar += 25;
                        progressBar.setProgress(bar);
                        cardView.setAlpha(0.5f);
                        cardView.setCardBackgroundColor(itemView.getResources().getColor(R.color.white));
                        cardView.setClickable(false);
                    }
//                    if (position != RecyclerView.NO_POSITION) {
////                        // Update the selected item position
//                        selectedItemPosition = position;
//                        notifyDataSetChanged();
//                    }
//                    notifyItemChanged(newposition);
                }
            });

        }
    }
}


