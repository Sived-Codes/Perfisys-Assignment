package prashant.synksys.perfisys.spltify.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import prashant.synksys.perfisys.spltify.adapter.ExpanseAdapter
import prashant.synksys.perfisys.databinding.FragmentHomeBinding
import prashant.synksys.perfisys.spltify.model.ExpanseData

class HomeFragment : Fragment() {

    private lateinit var bind : FragmentHomeBinding
    private lateinit var adapter: ExpanseAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind =FragmentHomeBinding.inflate(layoutInflater, container, false)

        getRecentExpanse()
        return bind.root
    }

    private fun getRecentExpanse() {
        adapter = ExpanseAdapter(ExpanseData.getList())
        bind.expanseRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        bind.expanseRecyclerview.adapter = adapter
    }

}