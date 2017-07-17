/**
 * Created by Filver L Believe on 17/7/2560.
 */
package app.kvc.activity;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.DefaultItemAnimator;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.MenuItem;

        import java.util.ArrayList;
        import java.util.List;

        import app.kvc.adapters.DetailAdapter;
        import app.kvc.kvc_ict.R;
        import app.kvc.model.DetailModel;

public class DetailActivity extends AppCompatActivity {
    private RecyclerView recyclerViewDetail;
    private List<DetailModel> listDetail;
    private DetailAdapter DetailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประเภทครุภัณฑ์");

        recyclerViewDetail = (RecyclerView) findViewById(R.id.recyclerView);
        // DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerViewOverview.getContext(), DividerItemDecoration.VERTICAL);
        //recyclerViewOverview.addItemDecoration(dividerItemDecoration);

        listDetail = new ArrayList<>();
        initData();
        DetailAdapter = new DetailAdapter(listDetail);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewDetail.setLayoutManager(mLayoutManager);
        recyclerViewDetail.setItemAnimator(new DefaultItemAnimator());
        recyclerViewDetail.setHasFixedSize(true);
        recyclerViewDetail.setAdapter(DetailAdapter);

        DetailAdapter.notifyDataSetChanged();
    }

    private void initData() {
        DetailModel m = new DetailModel("","","","","","","","","",1,1);
        listDetail.add(m);
        m = new DetailModel("","","","","","","","","",1,1);
        listDetail.add(m);
        m = new DetailModel("","","","","","","","","",1,1);
        listDetail.add(m);
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
