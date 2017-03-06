package id.ac.unsyiah.informatika.eventhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageButton);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView teks = (TextView) findViewById(R.id.textView);
                teks.setText("HI I am Event Handler");
                Toast.makeText(MainActivity.this, "Yes I am", Toast.LENGTH_SHORT).show();
                img.setImageDrawable(getResources().getDrawable(R.drawable.gambar));
            }
        });
    }

    public void propertiOnClick(View view) {
        TextView teks = (TextView) findViewById(R.id.textView);
        teks.setText("HI I am Properti OnClick");
        Toast.makeText(MainActivity.this, "Yes I am", Toast.LENGTH_SHORT).show();
        img.setImageDrawable(getResources().getDrawable(R.drawable.logo_hmif));
    }
}
