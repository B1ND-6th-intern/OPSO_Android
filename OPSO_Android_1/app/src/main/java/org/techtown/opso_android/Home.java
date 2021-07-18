package org.techtown.opso_android;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//메인 페이지 인플레이션
public class Home extends Fragment {

    private ArrayList<Home_Page_Info> items = new ArrayList<>();

    public Home() {
        // Required empty public constructor
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home, container, false);

        initDataset();


        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.home_recycler);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        Home_Page_Info_Adapter home_page_info_adapter = new Home_Page_Info_Adapter(context, items);
        recyclerView.setAdapter(home_page_info_adapter);

        return view;

    }


    private void initDataset() {
        //for Test
        items.clear();
        items.add(new Home_Page_Info("2021 - 07 - 19", "1320", "https://ibb.co/CP33nBR", "최민재", "#C", "1319", "이경태", "아니 이거 너무 길어져서 어카지 코드가 이 사발 너무 길어서 머리가 아파", "그러게 좀 짧게 짜짘ㅋ"));
        items.add(new Home_Page_Info("2021 - 07 - 15", "1419", "https://ibb.co/gVVmtTX", "이광남", "#NO", "1319", "이경태", "나는 탈모 대머리 nsk와 ysk를 좋아하는 이 광 남 이라고 한다. 나에게 코드를 내놓아라", "너 누구냐??"));
        items.add(new Home_Page_Info("2021 - 07 - 07", "1303", "https://ibb.co/qJ9yDPw", "강성훈", "#React", "1321", "송준호", "지금 리엑트를 공부하고 있는데 이거 코드가 계속 오류가 나고 더러워서 못하겠어요... 흑흐그흐그흑 살려주세요", "어휴 성훈아.."));
        items.add(new Home_Page_Info("2021 - 06 - 23", "1300", "https://ibb.co/dBh6KMJ", "손 원", "#Game", "1313", "배진영", "아니 게임을 하고 싶은데.. 친구들이 자꾸 방해를 해요 게임을 방해 못하게 하는 프로그램을 만들고 싶어요..", "어..휴.. 원아.. 게임 적당히.."));
        items.add(new Home_Page_Info("2021 - 05 - 13", "1305", "https://ibb.co/bsHnkrW", "금현호", "#js", "1234", "익명인", "지금 js를 공부하는 중인데.. 솔직하게 무슨 말인지 잘 모르겠어요.. 솔직히 너무나 어려워요.. 흑 못하겠엉..", "현호 궁디 말랑"));
        items.add(new Home_Page_Info("1999 - 13 - 87", "1319", " https://ibb.co/vzJT3Xw", "이경태", "#MOOHEE", "5252", "오콧타", "아니 데 코딩 나 너무 싫어져요 이거 코드 문제가 뭐죠????? 개 어의가 없네요 하하하하하하ㅏㅎ 안해해ㅐ해해.", "에이에이 오콧타?"));
    }




}
