package app.kvc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.kvc.adapters.CategoryListRecycleAdapter;
import app.kvc.adapters.RoomListRecycleAdapter;
import app.kvc.kvc_ict.R;
import app.kvc.model.CategoryModel;
import app.kvc.model.RoomModel;

/**
 * Created by field on 16/7/2560.
 */

public class CategoryActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCategory;
    private List<CategoryModel> listcategory;
    private CategoryListRecycleAdapter CategoryListRecycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // add back button on activity action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ประเภทครุภัณฑ์");

        recyclerViewCategory = (RecyclerView) findViewById(R.id.recyclerView);
        // DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerViewOverview.getContext(), DividerItemDecoration.VERTICAL);
        //recyclerViewOverview.addItemDecoration(dividerItemDecoration);

        listcategory = new ArrayList<>();
        initData();
        CategoryListRecycleAdapter = new CategoryListRecycleAdapter(listcategory);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewCategory.setLayoutManager(mLayoutManager);
        recyclerViewCategory.setItemAnimator(new DefaultItemAnimator());
        recyclerViewCategory.setHasFixedSize(true);
        recyclerViewCategory.setAdapter(CategoryListRecycleAdapter);

        CategoryListRecycleAdapter.notifyDataSetChanged();
    }

    private void initData() {
        CategoryModel m = new CategoryModel("อุปกรณ์คอมพิวเตอร์", 21, 0,1);
        listcategory.add(m);
        m = new CategoryModel("อุปกรณ์อิเล็กทรอนิกส์", 21, 0,1);
        listcategory.add(m);
        m = new CategoryModel("อุปกรณ์ทั่วไป", 21, 0,2
        );
        listcategory.add(m);
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