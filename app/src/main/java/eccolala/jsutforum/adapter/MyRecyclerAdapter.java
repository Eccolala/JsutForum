package eccolala.jsutforum.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import eccolala.jsutforum.R;


public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<String> mDatas;
    private LayoutInflater inflater;

    public MyRecyclerAdapter(Context context,List<String> list){
        this.mDatas = list;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycler_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(mDatas.get(position));
    }
    @Override
    public int getItemCount() {
        return mDatas != null ? mDatas.size() : 0;
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{
     TextView textView;


    public MyViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.txt_item_id);
    }

}
