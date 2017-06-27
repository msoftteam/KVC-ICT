package app.kvc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.kvc.adapters.NotAvailableRecyclerAdapter;
import app.kvc.kvc_ict.R;
import app.kvc.model.OverviewModel;

public class NotAvailableActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotAvailable;
    private List<OverviewModel> listNotAvailable;
    private NotAvailableRecyclerAdapter notAvailableRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_available);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ครุภัณฑ์ที่ไม่สามารถใช้งานได้");

        recyclerViewNotAvailable = (RecyclerView) findViewById(R.id.recyclerView);

        listNotAvailable = new ArrayList<>();
        initData();
        notAvailableRecyclerAdapter = new NotAvailableRecyclerAdapter(listNotAvailable);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewNotAvailable.setLayoutManager(mLayoutManager);
        recyclerViewNotAvailable.setItemAnimator(new DefaultItemAnimator());
        recyclerViewNotAvailable.setHasFixedSize(true);
        recyclerViewNotAvailable.setAdapter(notAvailableRecyclerAdapter);

        notAvailableRecyclerAdapter.notifyDataSetChanged();
    }

    private void initData() {
        OverviewModel m = new OverviewModel("10001", "เครื่องคอมพิวเตอร์", 1);
        listNotAvailable.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listNotAvailable.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listNotAvailable.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listNotAvailable.add(m);
        m = new OverviewModel("10002", "จอคอมพิวเตอร์", 1);
        listNotAvailable.add(m);
        m = new OverviewModel("10003", "Modem", 1);
        listNotAvailable.add(m);
        m = new OverviewModel("10004", "Access Point", 1);
        listNotAvailable.add(m);
    }

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
