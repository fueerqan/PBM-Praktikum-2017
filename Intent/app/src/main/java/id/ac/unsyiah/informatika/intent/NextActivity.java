package id.ac.unsyiah.informatika.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    String link = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            link = extras.getString("LINK");

            Toast.makeText(this, "link : " + link, Toast.LENGTH_SHORT).show();

            Button btn = (Button) findViewById(R.id.button2);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent webPage = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                    startActivity(webPage);

                }
            });
        }else{
            Toast.makeText(this, "Error, cek lagi, jangan malas", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnWebsite(View view) {
    }
}
