package kr.hs.dgsw.smartschool.opso

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.hs.dgsw.smartschool.opso.databinding.ItemSearchRecordRecyclerBinding

class SearchRecordRecyclerAdapter: RecyclerView.Adapter<SearchRecordHolder>() {
    var listData = mutableListOf<MemoSearchRecord>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchRecordHolder {
        val binding = ItemSearchRecordRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return SearchRecordHolder(binding)
    }

    override fun onBindViewHolder(searchrecordholder: SearchRecordHolder, position: Int) {
        val memoSearchRecord = listData.get(position)
        searchrecordholder.setSearchMemo(memoSearchRecord)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}

class SearchRecordHolder(val binding: ItemSearchRecordRecyclerBinding): RecyclerView.ViewHolder(binding.root) {
    fun setSearchMemo(memoSearchRecord: MemoSearchRecord) {
        binding.tvSearchContents.text = "${memoSearchRecord.tv_search_contents}"
    }
}