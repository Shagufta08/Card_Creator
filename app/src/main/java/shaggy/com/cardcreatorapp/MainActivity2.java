package shaggy.com.cardcreatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView receiver_from;
    TextView receiver_to;
    TextView receiver_heading;
    TextView receiver_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        receiver_from = (TextView)findViewById(R.id.received_from);
        receiver_to = (TextView)findViewById(R.id.received_to);
        receiver_heading = (TextView)findViewById(R.id.received_heading);
        receiver_message= (TextView)findViewById(R.id.received_message);

        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str1 = intent.getStringExtra("key1");
        String str2 = intent.getStringExtra("key2");
        String str3 = intent.getStringExtra("key3");
        String str4 = intent.getStringExtra("key4");

        // display the string into textView
        receiver_from.setText(str1);
        receiver_to.setText(str2);
        receiver_heading.setText(str3);
        receiver_message.setText(str4);
    }
}
