package app.kvc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.kvc.adapters.OverviewRecyclerAdapter;
import app.kvc.kvc_ict.R;
import app.kvc.model.OverviewModel;

public class OverviewActivity extends AppCompatActivity {

    private RecyclerView recyclerViewOverview;
    private List<OverviewModel> listOverviews;
    private OverviewRecyclerAdapter overviewRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ภาพรวมครุภัณฑ์ทั้งหมด");

        recyclerViewOverview = (RecyclerView) findViewById(R.id.recyclerView);
       // DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerViewOverview.getContext(), DividerItemDecoration.VERTICAL);
        //recyclerViewOverview.addItemDecoration(dividerItemDecoration);

        listOverviews = new ArrayList<>();
        initData();
        overviewRecyclerAdapter = new OverviewRecyclerAdapter(listOverviews);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewOverview.setLayoutManager(mLayoutManager);
        recyclerViewOverview.setItemAnimator(new DefaultItemAnimator());
        recyclerViewOverview.setHasFixedSize(true);
        recyclerViewOverview.setAdapter(overviewRecyclerAdapter);

        overviewRecyclerAdapter.notifyDataSetChanged();

    }

    private void initData() {
        OverviewModel m = new OverviewModel("10001", "เครื่องคอมพิวเตอร์", 1);
        listOverviews.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listOverviews.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listOverviews.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listOverviews.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listOverviews.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listOverviews.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listOverviews.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listOverviews.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listOverviews.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listOverviews.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listOverviews.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listOverviews.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listOverviews.add(m);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // click back button
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            this.overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
