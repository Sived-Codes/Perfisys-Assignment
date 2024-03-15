package prashant.synksys.perfisys.spltify.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import prashant.synksys.perfisys.R
import prashant.synksys.perfisys.databinding.ActivitySplitifyBinding

class SpltifyActivity : AppCompatActivity() {


    private lateinit var bind: ActivitySplitifyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivitySplitifyBinding.inflate(layoutInflater)
        setContentView(bind.root)

        replaceFragment(HomeFragment())



        bind.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_home -> {
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.menu_history -> {
                    replaceFragment(HistoryFragment())
                    true
                }



                else -> false
            }
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}