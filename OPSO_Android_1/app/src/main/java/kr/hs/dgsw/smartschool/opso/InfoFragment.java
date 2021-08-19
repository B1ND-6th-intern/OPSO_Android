package kr.hs.dgsw.smartschool.opso;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import org.techtown.opso_android.R;

public class InfoFragment extends Fragment {

    Button gotoSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info, container, false);

        gotoSignUp = v.findViewById(R.id.gotoSignUp);

        gotoSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gsuIntent = new Intent(getActivity(), SignInActivity.class);
                startActivity(gsuIntent);
            }
        });

        return v;
    }
}
