package sg.toru.activityresult

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.toru.activityresult.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding:ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnResultBack.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}