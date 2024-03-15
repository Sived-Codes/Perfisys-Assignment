package prashant.synksys.perfisys.spltify.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import prashant.synksys.perfisys.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {


    private lateinit var bind : FragmentAccountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentAccountBinding.inflate(layoutInflater, container, false)

        return bind.root
    }
}