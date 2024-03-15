package prashant.synksys.perfisys.spltify.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import prashant.synksys.perfisys.spltify.adapter.ExpanseAdapter
import prashant.synksys.perfisys.databinding.FragmentGroupExpanseBinding
import prashant.synksys.perfisys.spltify.model.ExpanseData

class GroupExpanseFragment : Fragment() {

    private lateinit var adapter: ExpanseAdapter

    private lateinit var bind: FragmentGroupExpanseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        bind = FragmentGroupExpanseBinding.inflate(layoutInflater, container, false)

        getExpanse()

        return bind.root
    }

    private fun getExpanse() {
        val personalExpenses = ExpanseData.getList().filter { it.expanseType == "group" }
        adapter = ExpanseAdapter(personalExpenses)
        bind.groupExpanseRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        bind.groupExpanseRecyclerview.adapter = adapter
    }


}