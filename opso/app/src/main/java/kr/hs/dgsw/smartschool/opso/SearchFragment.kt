package kr.hs.dgsw.smartschool.opso

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kr.hs.dgsw.smartschool.opso.databinding.ActivityMainBinding
import kr.hs.dgsw.smartschool.opso.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    var mainActivity: MainActivity? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSearchBinding.inflate(inflater, container, false)

        val data:MutableList<MemoSearchRecord> = loadData()
        var adapter = SearchRecordRecyclerAdapter()
        adapter.listData = data
        binding.searchRecordRecycler.adapter = adapter

        binding.searchRecordRecycler.layoutManager = LinearLayoutManager(context)
        return binding.root
    }

    private fun loadData(): MutableList<MemoSearchRecord> {
        val data:MutableList<MemoSearchRecord> = mutableListOf()
        for(i in 1..30) {
            val contents = "Android 커리큘럼 $i"
            var memosearchrecord = MemoSearchRecord(contents)
            data.add(memosearchrecord)
        }
        return data
    }
}