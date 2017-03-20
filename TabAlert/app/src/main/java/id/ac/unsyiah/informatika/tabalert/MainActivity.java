package id.ac.unsyiah.informatika.tabalert;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlert = (Button) findViewById(R.id.btnAlert);

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("JUDUL")
                        .setMessage("Apakah anda sudah makan?")
                        .setPositiveButton(R.string.tombol_sudah_makan, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Bagus, tapi jangan banyak2, nanti gendut.", Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(MainActivity.this, TabActivity.class));
                            }
                        })
                        .setNegativeButton("Belum", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Kasian deh...", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .create();
                dialog.show();

            }
        });
    }
}
