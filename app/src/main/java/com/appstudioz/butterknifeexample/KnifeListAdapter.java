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
 * Class represents an adapter which is an extension of BaseAdapter class use to show butter knife
 * integration.
 */
public class KnifeListAdapter extends BaseAdapter {

    private LayoutInflater mInflater;

    /**
     * Public constructor for adapter.
     *
     * @param context context of calling activity.
     */
    public KnifeListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
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

    /**
     * Class representing the holder for views in an item of list views.
     */
    class ViewHolder {
        // Annotation showing how a list of similar views can be created using butter knife.
        @Bind({R.id.tv_list, R.id.tv_list2})
        TextView mListTextView[];

        /**
         * Public parametrized constructor which should be provided for butter knife to bind the
         * views.
         *
         * @param view Instance of convert view as provided in getView() method.
         */
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
