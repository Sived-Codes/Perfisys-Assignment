package prashant.synksys.perfisys

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import prashant.synksys.perfisys.databinding.ActivityMainBinding
import prashant.synksys.perfisys.margh.ui.MarghActivity
import prashant.synksys.perfisys.spltify.ui.SpltifyActivity

class MainActivity : AppCompatActivity() {


    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        window.apply { statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.yellow) }


        bind.splitifyBtn.setOnClickListener {
            startActivity(Intent(this, SpltifyActivity::class.java))
        }

        bind.marghBtn.setOnClickListener {
            startActivity(Intent(this, MarghActivity::class.java))
        }
        bind.leafStockBtn.setOnClickListener {
            redirectPlayStore("com.prashant.stockmarketadviser")
        }

        bind.hubschedBtn.setOnClickListener {
            redirectPlayStore("com.nakshatratechnohub.hubsched")
        }

    }

    private fun redirectPlayStore(packageName: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName"))
            startActivity(intent)
        }
    }
}