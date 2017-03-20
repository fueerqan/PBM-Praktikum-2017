package id.ac.unsyiah.informatika.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLink = (EditText) findViewById(R.id.editText);
    }

    public void btnNextActivity(View view) {
        Intent nextActivity = new Intent(MainActivity.this, NextActivity.class);
        nextActivity.putExtra("LINK", txtLink.getText().toString());
        startActivity(nextActivity);
        //finish();
    }
}
