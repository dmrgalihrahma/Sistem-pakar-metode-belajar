package com.example.damar.finalproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.damar.finalproject.R;
import com.example.damar.finalproject.database.DatabaseHelper;
import com.example.damar.finalproject.model.Klasifikasi;
import com.example.damar.finalproject.model.Metode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListKlasifikasiAdapter extends RecyclerView.Adapter<ListKlasifikasiAdapter.KlasifikasiViewHolder> {
    private Context mContext;
    private List<Klasifikasi> mKlasifikasiList;
    private DatabaseHelper mDBHelper;
    public static ArrayList<String> selectedAnswers;


    public ListKlasifikasiAdapter(Context mContext, List<Klasifikasi> mKlasifikasiList) {
        this.mContext = mContext;
        this.mKlasifikasiList = mKlasifikasiList;
        this.selectedAnswers = new ArrayList<>();
        this.mDBHelper = new DatabaseHelper(mContext);
    }

    public int getCount() {
        return mKlasifikasiList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mKlasifikasiList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @NonNull
    @Override
    public ListKlasifikasiAdapter.KlasifikasiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_listklasifikasi, viewGroup, false);

        KlasifikasiViewHolder klasifikasiViewHolder = new KlasifikasiViewHolder(view);
        klasifikasiViewHolder.setIsRecyclable(false);

        return klasifikasiViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KlasifikasiViewHolder klasifikasiViewHolder, int i) {
        final List<Klasifikasi> lk = mDBHelper.getListKlasifikasiByGroup(String.valueOf(mKlasifikasiList.get(i).getGroup_index()));
        final RadioButton[] rb = new RadioButton[lk.size()];

        for (int j = 0; j < lk.size(); j++) {
            Klasifikasi kl = lk.get(j);
            rb[j] = new RadioButton(mContext);
            rb[j].setId(j);
            rb[j].setText(kl.getKlasifikasi());
            klasifikasiViewHolder.radioGroup.addView(rb[j]);
        }
    }

    class KlasifikasiViewHolder extends RecyclerView.ViewHolder {
        private RadioGroup radioGroup;

        public KlasifikasiViewHolder(@NonNull View itemView) {
            super(itemView);
            radioGroup = itemView.findViewById(R.id.radioGroupWrapper);
        }
    }
}
