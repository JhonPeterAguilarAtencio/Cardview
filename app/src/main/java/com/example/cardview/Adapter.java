package com.example.cardview;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyAdapter> {
    Context c;
    List<Model> list;
    int size;

    public Adapter(Context c, List<Model> list, int size) {
        this.c = c;
        this.list = list;
        this.size = size;
    }

    @NonNull
    @Override
    public Adapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new MyAdapter(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyAdapter holder, int position) {

        final Model model = list.get(position);
        holder.profileImage.setImageResource(model.getImage());
        holder.nombre.setText(model.getNombre());
        holder.apellidos.setText(model.getNombre());
        holder.ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getRootView().getContext());
                View dialogView=LayoutInflater.from(view.getRootView().getContext()).inflate(R.layout.custom_dialog, null);
                de.hdodenhof.circleimageview.CircleImageView dialogImage;
                TextView dialognombre;
                TextView dialogapellidos;
                TextView dialogdesc;
                dialogImage=dialogView.findViewById(R.id.iddialogimage);
                dialognombre=dialogView.findViewById(R.id.iddialogusuario);
                dialogapellidos=dialogView.findViewById(R.id.iddialogapellidos);
                dialogdesc=dialogView.findViewById(R.id.txtdialogdesc);
                dialogImage.setImageResource(model.getImage());
                dialognombre.setText(model.getNombre());
                dialogapellidos.setText(model.getApellidos());
                dialogdesc.setText(model.getDescripcion());
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class MyAdapter extends RecyclerView.ViewHolder {
        de.hdodenhof.circleimageview.CircleImageView profileImage;
        TextView nombre;
        TextView apellidos;
        Button ver;

        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            profileImage=itemView.findViewById(R.id.idimageView);
            nombre=itemView.findViewById(R.id.idusername);
            apellidos=itemView.findViewById(R.id.iduserfollowers);
            ver=itemView.findViewById(R.id.btnVer);
        }
    }
}
