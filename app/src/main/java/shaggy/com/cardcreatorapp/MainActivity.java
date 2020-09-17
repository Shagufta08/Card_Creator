package shaggy.com.cardcreatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    EditText from;
    EditText to;
    EditText heading;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        from =(EditText) findViewById(R.id.send_from) ;
        to =(EditText) findViewById(R.id.send_to) ;
        heading =(EditText) findViewById(R.id.send_heading) ;
        message =(EditText) findViewById(R.id.send_message) ;

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2(){

        Intent intent = new Intent(this,MainActivity2.class);

        String str1 = from.getText().toString();
        intent.putExtra("key1", str1);

        String str2 = to.getText().toString();
        intent.putExtra("key2", str2);

        String str3 = heading.getText().toString();
        intent.putExtra("key3", str3);

        String str4 = message.getText().toString();
        intent.putExtra("key4", str4);

        startActivity(intent);
    }

}
