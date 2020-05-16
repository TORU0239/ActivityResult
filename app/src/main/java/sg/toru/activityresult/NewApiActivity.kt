package sg.toru.activityresult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.toru.activityresult.databinding.ActivitySampleResultBinding

class NewApiActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySampleResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}