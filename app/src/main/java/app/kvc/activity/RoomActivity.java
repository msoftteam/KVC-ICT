package app.kvc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.kvc.adapters.RoomListRecycleAdapter;
import app.kvc.kvc_ict.R;
import app.kvc.model.RoomModel;

public class RoomActivity extends AppCompatActivity {
    private RecyclerView recyclerViewroom;
    private List<RoomModel> listroom;
    private RoomListRecycleAdapter RoomRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ภาพรวมครุภัณฑ์ทั้งหมด");

        recyclerViewroom = (RecyclerView) findViewById(R.id.recyclerView);
        // DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerViewOverview.getContext(), DividerItemDecoration.VERTICAL);
        //recyclerViewOverview.addItemDecoration(dividerItemDecoration);

        listroom = new ArrayList<>();
        initData();
        RoomRecyclerAdapter = new RoomListRecycleAdapter(listroom);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewroom.setLayoutManager(mLayoutManager);
        recyclerViewroom.setItemAnimator(new DefaultItemAnimator());
        recyclerViewroom.setHasFixedSize(true);
        recyclerViewroom.setAdapter(RoomRecyclerAdapter);

        RoomRecyclerAdapter.notifyDataSetChanged();

    }

    private void initData() {
        RoomModel m = new RoomModel("721", 18, 0, 1);
        listroom.add(m);
        m = new RoomModel("722", 25, 0, 2);
        listroom.add(m);
        m = new RoomModel("723", 15, 0, 3);
        listroom.add(m);
        m = new RoomModel("724", 22, 0, 2);
        listroom.add(m);
        m = new RoomModel("725", 10, 0, 1);
        listroom.add(m);

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

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ห้องเรียน");
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
    */
}
