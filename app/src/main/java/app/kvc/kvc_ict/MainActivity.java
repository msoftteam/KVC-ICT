package app.kvc.kvc_ict;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import app.kvc.fragments.AccountFragment;
import app.kvc.fragments.MainFragment;

import static app.kvc.kvc_ict.R.id.drawerLayout;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView nv;

    //private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mToolbar = (Toolbar) findViewById(R.id.nav_action);
        //setSupportActionBar(mToolbar);

        mDrawerLayout = (DrawerLayout) findViewById(drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();

        nv = (NavigationView) findViewById(R.id.navigation_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                if (id == R.id.nav_home) {
                    fm.beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();
                } else if (id == R.id.nav_account) {
//                    Toast.makeText(getApplicationContext(), "account click", Toast.LENGTH_SHORT).show();
                    fm.beginTransaction().replace(R.id.content_frame, new AccountFragment()).commit();
                } /*else if (id == R.id.nav_setting) {
                    Toast.makeText(getApplicationContext(), "setting click", Toast.LENGTH_SHORT).show();
                }*/ else if (id == R.id.nav_logout) {
                    Toast.makeText(getApplicationContext(), "Logout click", Toast.LENGTH_SHORT).show();
                }
                mDrawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_menu, menu);
//        return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        } else if (item.getItemId() == R.id.action_home) {
            getFragmentManager().beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();
        } else if (item.getItemId() == R.id.action_report_problem) {
            Toast.makeText(getApplicationContext(), "Report Problem", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
