package kr.hs.dgsw.smartschool.opso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kr.hs.dgsw.smartschool.opso.databinding.ActivityAlarmBinding

class AlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding by lazy { ActivityAlarmBinding.inflate(layoutInflater) }
        setContentView(binding.root)

        val data:MutableList<Memo> = loadData()
        var adapter = AlarmRecyclerAdapter()
        adapter.listData = data
        binding.alarmRecycler.adapter = adapter
        binding.alarmRecycler.layoutManager = LinearLayoutManager(this)

        // 돌아가기 버튼
        binding.btnAlarmCancel.setOnClickListener { finish(); }

    }

    fun loadData(): MutableList<Memo> {
        val data: MutableList<Memo> = mutableListOf()
        for(i in 1..20) {
            val mainAlarm = "경태가 전구를 눌렀습니다.${i}"
            val date = System.currentTimeMillis()
            var memo = Memo(mainAlarm, date)
            data.add(memo)
        }
        return data
    }
}