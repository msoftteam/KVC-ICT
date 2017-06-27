package app.kvc.adapters;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import app.kvc.kvc_ict.R;
import app.kvc.model.OverviewModel;

/**
 * Created by bigm on 26/6/2560.
 */

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.OverViewHolder> {
    private List<OverviewModel> listOverviews;

    public CategoryRecyclerAdapter(List<OverviewModel> listOverviews) {
        this.listOverviews = listOverviews;
    }

    @Override
    public OverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_overview, parent, false);

        return new OverViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(OverViewHolder holder, int position) {
        holder.textViewName.setText(listOverviews.get(position).getName());
        holder.textViewId.setText(listOverviews.get(position).getId());
//        holder.textViewStatus.setText(listOverviews.get(position).getStatus().toString());
    }

    @Override
    public int getItemCount() {
        // Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listOverviews.size());
        return listOverviews.size();
    }


    /**
     * ViewHolder class
     */
    public class OverViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textViewId;
        public AppCompatTextView textViewName;
        public AppCompatTextView textViewStatus;

        public OverViewHolder(View view) {
            super(view);
            textViewName = (AppCompatTextView) view.findViewById(R.id.textViewName);
            textViewId = (AppCompatTextView) view.findViewById(R.id.textViewId);
//            textViewStatus = (AppCompatTextView) view.findViewById(R.id.textViewStatus);
        }
    }
}
