package app.kvc.adapters;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import app.kvc.kvc_ict.R;
import app.kvc.model.OverviewModel;

/**
 * Created by bigm on 27/6/2560.
 */

public class CleanRecyclerAdapter extends RecyclerView.Adapter<CleanRecyclerAdapter.CleanViewHolder>{

    private List<OverviewModel> listOverviews;

    public CleanRecyclerAdapter(List<OverviewModel> listOverviews) {
        this.listOverviews = listOverviews;
    }

    @Override
    public CleanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_overview, parent, false);

        return new CleanViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CleanViewHolder holder, int position) {
        holder.textViewName.setText(listOverviews.get(position).getName());
        holder.textViewId.setText(listOverviews.get(position).getId());
        holder.ImgStatus.setImageResource(android.R.drawable.presence_invisible);
    }

    @Override
    public int getItemCount() {
        // Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listOverviews.size());
        return listOverviews.size();
    }


    /**
     * ViewHolder class
     */
    public class CleanViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textViewId;
        public AppCompatTextView textViewName;
        public AppCompatImageView ImgStatus;


        public CleanViewHolder(View view) {
            super(view);
            textViewName = (AppCompatTextView) view.findViewById(R.id.textViewName);
            textViewId = (AppCompatTextView) view.findViewById(R.id.textViewId);
            ImgStatus = (AppCompatImageView) view.findViewById(R.id.imgStatus);
        }
    }
}
