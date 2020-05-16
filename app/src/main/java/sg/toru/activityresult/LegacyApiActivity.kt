package sg.toru.activityresult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sg.toru.activityresult.databinding.ActivitySampleResultBinding

class LegacyApiActivity : AppCompatActivity() {
    
    private lateinit var binding:ActivitySampleResultBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}