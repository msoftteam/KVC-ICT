package app.kvc.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import app.kvc.activity.CategoryChildActivity;
import app.kvc.kvc_ict.R;
import app.kvc.model.CategoryModel;
import app.kvc.model.RoomModel;

/**
 * Created by field on 16/7/2560.
 */

public class CategoryListRecycleAdapter extends RecyclerView.Adapter<CategoryListRecycleAdapter.CategoryListViewHolder> {
    private List<CategoryModel> CategoryModels;

    public CategoryListRecycleAdapter(List<CategoryModel> CategoryModels) {this.CategoryModels = CategoryModels;}

    @Override
    public CategoryListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_category, parent, false);

        return new CategoryListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CategoryListViewHolder holder, int position) {
        holder.txtCategory.setText(CategoryModels.get(position).getTvCategory());
        holder.txtNumAll.setText(CategoryModels.get(position).getNumAll().toString());
        holder.txtNumBroken.setText(CategoryModels.get(position).getNumBroken().toString());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CategoryChildActivity.class);
                v.getContext().startActivity(intent);
                //Toast.makeText(v.getContext(), "Click View", Toast.LENGTH_SHORT).show();
            }
        });
        if (CategoryModels.get(position).getNumImage() == 1) {
            holder.imageAer.setImageResource(R.drawable.computer);
        } else if (CategoryModels.get(position).getNumImage() == 2) {
            holder.imageAer.setImageResource(R.drawable.tablet);
        } else {
            holder.imageAer.setImageResource(R.drawable.computer);
        }
    }

    @Override
    public int getItemCount() {
        // Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listOverviews.size());
        return CategoryModels.size();
    }


    /**
     * ViewHolder class
     */
    public class CategoryListViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView txtCategory;
        public AppCompatTextView txtNumAll;
        public AppCompatTextView txtNumBroken;
        public AppCompatImageView imageAer;

        public CategoryListViewHolder(View view) {
            super(view);
            txtCategory = (AppCompatTextView) view.findViewById(R.id.textViewCategory);
            txtNumAll = (AppCompatTextView) view.findViewById(R.id.textViewNumAll);
            txtNumBroken = (AppCompatTextView) view.findViewById(R.id.textViewNumBroken);
            imageAer = (AppCompatImageView) view.findViewById(R.id.imgArea);
        }
    }
}