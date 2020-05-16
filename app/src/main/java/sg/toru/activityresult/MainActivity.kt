package sg.toru.activityresult

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

        }

        binding.btnLegacyActivityResult.setOnClickListener {

        }
    }
}