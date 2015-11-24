package com.appstudioz.butterknifeexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by taranmeet on 27/10/15.
 */
public class KnifeListAdapter extends BaseAdapter {

    private Context mContext;

    private LayoutInflater mInflater;

    public KnifeListAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_knife_list, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        holder = (ViewHolder) convertView.getTag();
        holder.mListTextView[0].setText("Hii " + position);
        holder.mListTextView[1].setText("Bye " + position);
        return convertView;
    }

    class ViewHolder {
        @Bind({R.id.tv_list, R.id.tv_list2})
        TextView mListTextView[];

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
