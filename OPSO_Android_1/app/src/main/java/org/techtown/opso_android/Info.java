package org.techtown.opso_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Info extends Fragment {

    Button gotoSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info, container, false);

        gotoSignUp = v.findViewById(R.id.gotoSignUp);

        gotoSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gsuIntent = new Intent(getActivity(), Sign_in.class);
                startActivity(gsuIntent);
            }
        });

        return v;
    }
}
