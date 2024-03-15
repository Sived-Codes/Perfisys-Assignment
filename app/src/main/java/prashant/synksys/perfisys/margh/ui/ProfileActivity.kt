package prashant.synksys.perfisys.margh.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import prashant.synksys.perfisys.R
import prashant.synksys.perfisys.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var bind : ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(bind.root)

        window.apply { statusBarColor = ContextCompat.getColor(this@ProfileActivity, R.color.black) }

        bind.backBtn.setOnClickListener { finish() }

    }
}