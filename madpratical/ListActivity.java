package sg.edu.np.mad.madpratical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    AlertDialog.Builder builder;
    ArrayList<User> ulist = new ArrayList<>();
    private RecyclerView rv;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rv = findViewById(R.id.recycler);


        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        adapter = new RecyclerViewAdapter(ulist,ListActivity.this){

        };
        rv.setAdapter(adapter);



            builder.show();
        }
    }

