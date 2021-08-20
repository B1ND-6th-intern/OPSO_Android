package kr.hs.dgsw.smartschool.opso;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class InfoFragment extends Fragment {

    Button btn_logout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_info, container, false);

        btn_logout = v.findViewById(R.id.btn_logout);

        btn_logout.setOnClickListener(v1 -> {

            Intent LogoutIntent = new Intent(getActivity(), SignInActivity.class);
            startActivity(LogoutIntent);
            getActivity().finish();
        });

        return v;
    }
}
