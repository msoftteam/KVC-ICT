package app.kvc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.kvc.adapters.CleanRecyclerAdapter;
import app.kvc.kvc_ict.R;
import app.kvc.model.OverviewModel;

public class CleanActivity extends AppCompatActivity {

    private RecyclerView recyclerViewClean;
    private List<OverviewModel> listClean;
    private CleanRecyclerAdapter cleanRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ครุภัณฑ์ที่ควรทำความสะอาด");

        recyclerViewClean = (RecyclerView) findViewById(R.id.recyclerView);

        listClean = new ArrayList<>();
        initData();
        cleanRecyclerAdapter = new CleanRecyclerAdapter(listClean);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewClean.setLayoutManager(mLayoutManager);
        recyclerViewClean.setItemAnimator(new DefaultItemAnimator());
        recyclerViewClean.setHasFixedSize(true);
        recyclerViewClean.setAdapter(cleanRecyclerAdapter);

        cleanRecyclerAdapter.notifyDataSetChanged();
    }

    private void initData() {
        OverviewModel m = new OverviewModel("10001", "เครื่องคอมพิวเตอร์", 1);
        listClean.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listClean.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listClean.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listClean.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listClean.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listClean.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listClean.add(m);
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
