package com.example.damar.finalproject.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.damar.finalproject.R;
import com.example.damar.finalproject.model.Metode;

import java.util.List;

public class ListMetodeAdapter extends BaseAdapter {
    private Context mContext;
    private List<Metode> mMetodeList;

    public ListMetodeAdapter(Context mContext, List<Metode> mMetodeList) {
        this.mContext = mContext;
        this.mMetodeList = mMetodeList;
    }

    @Override
    public int getCount() {
        return mMetodeList.size();
    }

    @Override
    public Object getItem(int i) {
        return mMetodeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mMetodeList.get(i).get_id();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.item_listview,null);
        TextView txtNamaMetode = (TextView)v.findViewById(R.id.txtNamaMetode);
        TextView txtKeteranganMetode = (TextView)v.findViewById(R.id.txtKeteranganMetode);
        txtNamaMetode.setText(mMetodeList.get(i).getNama());
        txtKeteranganMetode.setText(mMetodeList.get(i).getKeterangan());
        return v;
    }
}
