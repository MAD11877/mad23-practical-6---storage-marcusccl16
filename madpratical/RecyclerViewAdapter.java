package sg.edu.np.mad.madpratical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    ArrayList<User> ulist;
    Context context;

    public RecyclerViewAdapter(ArrayList<User> ulist, Context context) {
        this.ulist = ulist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.name.setText("Name" + ulist.get(position).getuser());
        holder.desc.setText("Description" + ulist.get(position).getdescription());

        boolean isSpecialView = ulist.get(position).getuser().endsWith("7");


        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("name", ulist.get(position).getuser());
                intent.putExtra("description", ulist.get(position).getdescription());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return ulist.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image1;
        ImageView image2;
        TextView name;
        TextView desc;
        ConstraintLayout layout;
        ImageView specialImageView1;
        ImageView specialImageView2;

        public MyViewHolder(@NonNull View view) {
            super(view);
            image1 = view.findViewById(R.id.imageView5);
            image2 = view.findViewById(R.id.imageView6);
            name = view.findViewById(R.id.name);
            desc = view.findViewById(R.id.desc);
            layout = view.findViewById(R.id.user_layout);
            specialImageView1 = view.findViewById(R.id.special1);
            specialImageView2 = view.findViewById(R.id.special2);

        }
    }
}

