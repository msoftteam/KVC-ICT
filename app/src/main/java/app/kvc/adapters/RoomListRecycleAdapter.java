package app.kvc.adapters;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import app.kvc.kvc_ict.R;
import app.kvc.model.RoomModel;

/**
 * Created by bigm on 26/6/2560.
 */

public class RoomListRecycleAdapter extends RecyclerView.Adapter<RoomListRecycleAdapter.RoomListViewHolder> {
    private List<RoomModel> roomModels;

    public RoomListRecycleAdapter(List<RoomModel> roomModels) {
        this.roomModels = roomModels;
    }

    @Override
    public RoomListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_room, parent, false);

        return new RoomListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RoomListViewHolder holder, int position) {
        holder.txtRoomNum.setText(roomModels.get(position).getRoomNo());
        holder.txtNumAll.setText(roomModels.get(position).getNumAll().toString());
        holder.txtNumBroken.setText(roomModels.get(position).getNumBroken().toString());

        if (roomModels.get(position).getNumImage() == 1) {
            holder.imgArea.setImageResource(R.drawable.img1);
        } else if (roomModels.get(position).getNumImage() == 2) {
            holder.imgArea.setImageResource(R.drawable.img2);
        } else {
            holder.imgArea.setImageResource(R.drawable.img3);
        }
    }

    @Override
    public int getItemCount() {
        // Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listOverviews.size());
        return roomModels.size();
    }


    /**
     * ViewHolder class
     */
    public class RoomListViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView txtRoomNum;
        public AppCompatTextView txtNumAll;
        public AppCompatTextView txtNumBroken;
        public AppCompatImageView imgArea;

        public RoomListViewHolder(View view) {
            super(view);
            txtRoomNum = (AppCompatTextView) view.findViewById(R.id.txtRoomNum);
            txtNumAll = (AppCompatTextView) view.findViewById(R.id.txtNumAll);
            txtNumBroken = (AppCompatTextView) view.findViewById(R.id.txtNumBroken);
            imgArea = (AppCompatImageView) view.findViewById(R.id.imgArea);
        }
    }
}