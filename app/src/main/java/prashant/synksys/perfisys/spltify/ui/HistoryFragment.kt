package prashant.synksys.perfisys.spltify.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import prashant.synksys.perfisys.spltify.adapter.ViewPagerAdapter
import prashant.synksys.perfisys.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {


    private lateinit var bind : FragmentHistoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentHistoryBinding.inflate(layoutInflater, container, false)



        val fragments = listOf(PersonalExpanseFragment(), GroupExpanseFragment())

        bind.viewPager.adapter = ViewPagerAdapter(requireActivity(), fragments)


        TabLayoutMediator(bind.tabLayout, bind.viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Personal Expanse"
                1 -> "Group Expanse"
                else -> null

            }
        }.attach()

        bind.tabLayout.getTabAt(0)?.select()

        return bind.root
    }

}