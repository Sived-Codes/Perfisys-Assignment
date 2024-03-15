package prashant.synksys.perfisys.margh.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import prashant.synksys.perfisys.R
import prashant.synksys.perfisys.databinding.ActivityMarghBinding
import prashant.synksys.perfisys.margh.adapter.QuoteAdapter
import prashant.synksys.perfisys.margh.model.QuoteData

class MarghActivity : AppCompatActivity() {
    private lateinit var adapter: QuoteAdapter

    private lateinit var bind: ActivityMarghBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMarghBinding.inflate(layoutInflater)
        setContentView(bind.root)

        window.apply { statusBarColor = ContextCompat.getColor(this@MarghActivity, R.color.black) }


        bind.profileBtn.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        getQuotes()
    }

    private fun getQuotes() {
        adapter = QuoteAdapter(QuoteData.getList())
        bind.quoteRecyclerview.layoutManager = LinearLayoutManager(this)
        bind.quoteRecyclerview.adapter = adapter
    }
}