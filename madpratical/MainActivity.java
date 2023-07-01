package sg.edu.np.mad.madpratical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    final String TITLE = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "Create!");

        User myUser = new User();
        myUser.getuser();
        myUser.getdescription();

        myUser.followed = false;
        myUser.following();

        TextView hello = findViewById(R.id.textView2);
        hello.setText("Hello World!");

        TextView paragraph = findViewById(R.id.textView);
        paragraph.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");

        ToggleButton toggleone = findViewById(R.id.toggleone);
        toggleone.setText(myUser.following() ? "Unfollow" : "Follow");

        toggleone.setOnClickListener(v -> {
            if (myUser.following()) {
                toggleone.setText("Follow");
                myUser.setfollowing(false);
            } else {
                toggleone.setText("Unfollow");
                myUser.setfollowing(true);
            }
        });

        ToggleButton toggletwo = findViewById(R.id.toggletwo);
        toggletwo.setText("Message");

        toggletwo.setOnClickListener(v -> toggletwo.getTextOn());
    }
}