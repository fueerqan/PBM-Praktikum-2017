package id.ac.unsyiah.informatika.tabalert;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class TabActivity extends AppCompatActivity {

    ActionBar actionBar;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for(i = 0; i < 3; i++){
            actionBar.addTab(
                    actionBar.newTab()
                            .setText("Tab " + (i+1))
                            .setTabListener(new ActionBar.TabListener() {
                                @Override
                                public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                                    Toast.makeText(TabActivity.this, "Tab " + i + " di klik.", Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

                                }

                                @Override
                                public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

                                }
                            })
            );
        }
    }
}
