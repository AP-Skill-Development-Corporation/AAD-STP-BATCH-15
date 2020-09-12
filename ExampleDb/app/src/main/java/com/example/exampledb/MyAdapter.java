package com.example.exampledb;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exampledb.Rdb.RTable;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.HoldView> {
    Context ct;
    List<RTable> list;

    public MyAdapter(Context ct, List<RTable> list) {
        this.ct = ct;
        this.list = list;
    }

    @NonNull
    @Override
    public HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HoldView(LayoutInflater.from(ct).inflate(R.layout.row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HoldView holder, final int position) {
        holder.tv.setText(list.get(position).getName());
        holder.tv1.setText(list.get(position).getRoll());
        holder.tv2.setText(list.get(position).getNumber());
        holder.del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.viewModel.delete(list.get(position));
                Toast.makeText(ct, "Data deleted", Toast.LENGTH_SHORT).show();
            }
        });
        holder.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ct);
                View v = LayoutInflater.from(ct).inflate(R.layout.update,null,false);
                final EditText sn = v.findViewById(R.id.sname);
                final EditText sr = v.findViewById(R.id.sroll);
                final EditText snum = v.findViewById(R.id.snumber);
                builder.setView(v);
                builder.setCancelable(false);

                sn.setText(list.get(position).getName());
                sr.setText(list.get(position).getRoll());
                sr.setEnabled(false);
                snum.setText(list.get(position).getNumber());

                builder.setPositiveButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        RTable rTable = new RTable();
                        rTable.setName(sn.getText().toString());
                        rTable.setRoll(sr.getText().toString());
                        rTable.setNumber(snum.getText().toString());
                        MainActivity.viewModel.update(rTable);
                        Toast.makeText(ct, "Data Updated", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HoldView extends RecyclerView.ViewHolder {
        TextView tv,tv1,tv2;
        ImageButton edit,del;
        public HoldView(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.name);
            tv1 = itemView.findViewById(R.id.roll);
            tv2 = itemView.findViewById(R.id.number);
            edit = itemView.findViewById(R.id.edit);
            del = itemView.findViewById(R.id.del);
        }
    }
}
