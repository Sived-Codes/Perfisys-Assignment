package prashant.synksys.perfisys.spltify.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import prashant.synksys.perfisys.spltify.adapter.ExpanseAdapter
import prashant.synksys.perfisys.databinding.FragmentPersonalExpanseBinding
import prashant.synksys.perfisys.spltify.model.ExpanseData

class PersonalExpanseFragment : Fragment() {

    private lateinit var adapter: ExpanseAdapter
    private lateinit var bind : FragmentPersonalExpanseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentPersonalExpanseBinding.inflate(layoutInflater, container, false)

        getExpanse()


        return bind.root
    }

    private fun getExpanse() {
        val personalExpenses = ExpanseData.getList().filter { it.expanseType == "personal" }
        adapter = ExpanseAdapter(personalExpenses)
        bind.personalExpanseRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        bind.personalExpanseRecyclerview.adapter = adapter
    }


}