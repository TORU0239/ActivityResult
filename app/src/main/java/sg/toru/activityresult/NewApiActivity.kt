package sg.toru.activityresult

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.invoke
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import sg.toru.activityresult.databinding.ActivitySampleResultBinding

class NewApiActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySampleResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendResult.setOnClickListener {
            requestActivity(Intent(this@NewApiActivity, ResultActivity::class.java))
        }
    }

    /* First is taken by CreateIntent() as a parameter, Second is taken as the return of ParseResult */
    private val customContract = object:ActivityResultContract<String, ActivityResult>(){
        override fun createIntent(
            context: Context,
            input: String?
        ): Intent {
            return Intent(this@NewApiActivity, ResultActivity::class.java).putExtra("test", input)
        }

        override fun parseResult(
            resultCode: Int,
            intent: Intent?
        ): ActivityResult {
            return ActivityResult(resultCode, intent)
        }
    }

    private val request = registerForActivityResult(customContract){
        Toast.makeText(this@NewApiActivity, "resultCode: ${it.resultCode}", Toast.LENGTH_SHORT).show()
    }

    private val requestActivity = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        Toast.makeText(this@NewApiActivity, "resultCode: ${it.resultCode}", Toast.LENGTH_SHORT).show()
    }
}