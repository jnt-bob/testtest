package com.jnu.testtest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MessageFragment2 extends Fragment {
    private TextView tv;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View messageLayout = inflater.inflate(R.layout.message2_layout, container, false);
        tv=(TextView) messageLayout.findViewById(R.id.message);
        tv.setText("2");
        return messageLayout;
    }
}
