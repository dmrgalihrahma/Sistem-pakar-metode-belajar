package com.example.damar.finalproject.fragment;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.damar.finalproject.R;
import com.example.damar.finalproject.adapter.MyStepperAdapter;
import com.example.damar.finalproject.database.DatabaseHelper;
import com.example.damar.finalproject.model.Klasifikasi;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.VerificationError;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class StepFragmentExample extends Fragment implements Step {


    public StepFragmentExample() {
        // Required empty public constructor
    }

    RadioGroup mRadioGroup;
    RadioButton mRadioButton1;
    RadioButton mRadioButton2;
    RadioButton mRadioButton3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle bundle = this.getArguments();
        Log.d("##", "onCreateView: " + bundle.getInt(MyStepperAdapter.CURRENT_STEP_POSITION_KEY)) ;

        View view = inflater.inflate(R.layout.fragment_step_fragment_example, container, false);

        mRadioGroup = view.findViewById(R.id.radioGroupWrapper);
        mRadioGroup.getCheckedRadioButtonId();

        DatabaseHelper mDBHelper = new DatabaseHelper(getContext());
        Log.d("#######", String.valueOf(bundle.getInt(MyStepperAdapter.CURRENT_STEP_POSITION_KEY)));
        final List<Klasifikasi> lk = mDBHelper.getListKlasifikasiByGroup(String.valueOf(Integer.valueOf(bundle.getInt(MyStepperAdapter.CURRENT_STEP_POSITION_KEY)) + 1));
        final RadioButton[] rb = new RadioButton[lk.size()];
        Log.d("##sz", "onCreateView: " + lk.size()) ;


        int[][] states = new int[][] {
                new int[] { android.R.attr.state_enabled}, // enabled
                new int[] {-android.R.attr.state_enabled}, // disabled
                new int[] {-android.R.attr.state_checked}, // unchecked
                new int[] { android.R.attr.state_pressed}  // pressed
        };

        int[] colors = new int[] {
                Color.BLACK,
                Color.BLACK,
                Color.BLACK,
                Color.BLACK
        };

        mRadioButton1 = view.findViewById(R.id.checkbox1);
        mRadioButton2 = view.findViewById(R.id.checkbox2);
        mRadioButton3 = view.findViewById(R.id.checkbox3);

        if(lk.size() > 0) {
            Klasifikasi kl0 = lk.get(0);
            Klasifikasi kl1 = lk.get(1);
            Klasifikasi kl2 = lk.get(2);
            mRadioButton1.setText(kl0.getKlasifikasi());
            mRadioButton2.setText(kl1.getKlasifikasi());
            mRadioButton3.setText(kl2.getKlasifikasi());
        }

        return view;
    }

    @Nullable
    @Override
    public VerificationError verifyStep() {
        return null;
    }

    @Override
    public void onSelected() {

    }

    @Override
    public void onError(@NonNull VerificationError error) {

    }
}
