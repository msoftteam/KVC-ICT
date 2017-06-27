package app.kvc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.kvc.adapters.AmissRecyclerAdapter;
import app.kvc.kvc_ict.R;
import app.kvc.model.OverviewModel;

public class AmissActivity extends AppCompatActivity {

    private RecyclerView recyclerViewAmiss;
    private List<OverviewModel> listAmiss;
    private AmissRecyclerAdapter amissRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amiss);
        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ครุภัณฑ์ที่มีการใช้งานผิดปกติ");

        recyclerViewAmiss = (RecyclerView) findViewById(R.id.recyclerView);

        listAmiss = new ArrayList<>();
        initData();
        amissRecyclerAdapter = new AmissRecyclerAdapter(listAmiss);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewAmiss.setLayoutManager(mLayoutManager);
        recyclerViewAmiss.setItemAnimator(new DefaultItemAnimator());
        recyclerViewAmiss.setHasFixedSize(true);
        recyclerViewAmiss.setAdapter(amissRecyclerAdapter);

        amissRecyclerAdapter.notifyDataSetChanged();
    }

    private void initData() {
        OverviewModel m = new OverviewModel("10001", "เครื่องคอมพิวเตอร์", 1);
        listAmiss.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listAmiss.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listAmiss.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listAmiss.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listAmiss.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listAmiss.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listAmiss.add(m);
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
