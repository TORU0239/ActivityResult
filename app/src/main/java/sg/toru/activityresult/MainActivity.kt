package sg.toru.activityresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.toru.activityresult.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
    }

    private fun initLayout() {
        binding.btnNewActivityResult.setOnClickListener {
            startActivity(Intent(this@MainActivity, NewApiActivity::class.java))
        }

        binding.btnLegacyActivityResult.setOnClickListener {

        }
    }
}