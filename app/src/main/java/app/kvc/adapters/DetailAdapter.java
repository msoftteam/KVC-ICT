/**
 * Created by Filver L Believe on 17/7/2560.
 */

package app.kvc.adapters;

        import android.support.v7.widget.AppCompatImageView;
        import android.support.v7.widget.AppCompatTextView;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import java.util.List;

        import app.kvc.kvc_ict.R;
        import app.kvc.model.DetailModel;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {

    private List<DetailModel> listDetail;

    public DetailAdapter(List<DetailModel> listDetail) {
        this.listDetail = listDetail;
    }

    @Override
    public DetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_detail, parent, false);

        return new DetailViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DetailViewHolder holder, int position) {
        holder.textId.setText(listDetail.get(position).getTextId());
        holder.textcode.setText(listDetail.get(position).getTextcode());
        holder.textname.setText(listDetail.get(position).getTextname());
        holder.texttype.setText(listDetail.get(position).getTexttype());
        holder.textcolor.setText(listDetail.get(position).getTextcolor());
        holder.textstatus.setText(listDetail.get(position).getTextstatus());
        holder.textbroken.setText(listDetail.get(position).getTextbroken());
        holder.textdate.setText(listDetail.get(position).getTextdate());
        holder.textuser.setText(listDetail.get(position).getTextuser());
        holder.imageView.setImageResource(android.R.drawable.ic_menu_today);
        holder.imagestatus.setImageResource(android.R.drawable.presence_away);
    }

    @Override
    public int getItemCount() {
        // Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listOverviews.size());
        return listDetail.size();
    }


    /**
     * ViewHolder class
     */
    public class DetailViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textId;
        public AppCompatTextView textcode;
        public AppCompatTextView textname;
        public AppCompatTextView texttype;
        public AppCompatTextView textcolor;
        public AppCompatTextView textstatus;
        public AppCompatTextView textbroken;
        public AppCompatTextView textdate;
        public AppCompatTextView textuser;
        public AppCompatImageView imageView;
        public AppCompatImageView imagestatus;

        public DetailViewHolder(View view) {
            super(view);
            textcode = (AppCompatTextView) view.findViewById(R.id.textcode);
            textname = (AppCompatTextView) view.findViewById(R.id.textname);
            texttype = (AppCompatTextView) view.findViewById(R.id.texttype);
            textcolor = (AppCompatTextView) view.findViewById(R.id.textcolor);
            textstatus = (AppCompatTextView) view.findViewById(R.id.textstatus);
            textId = (AppCompatTextView) view.findViewById(R.id.textId);
            imagestatus = (AppCompatImageView) view.findViewById(R.id.imagestatus);
            textbroken = (AppCompatTextView) view.findViewById(R.id.textbroken);
            textdate = (AppCompatTextView) view.findViewById(R.id.textdate);
            textuser = (AppCompatTextView) view.findViewById(R.id.textuser);
            imageView = (AppCompatImageView) view.findViewById(R.id.imageView);

        }
    }

}