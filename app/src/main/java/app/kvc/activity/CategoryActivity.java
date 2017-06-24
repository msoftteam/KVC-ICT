package app.kvc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import app.kvc.kvc_ict.R;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประเภทครุภัณฑ์");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // click back button
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
