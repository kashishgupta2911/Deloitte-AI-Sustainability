import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WasteReductionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waste_reduction)

        val plasticUsageInput = findViewById<EditText>(R.id.plasticUsageInput)
        val submitPlasticUsageBtn = findViewById<Button>(R.id.submitPlasticUsageBtn)
        val recommendationsText = findViewById<TextView>(R.id.recommendationsText)

        submitPlasticUsageBtn.setOnClickListener {
            val plasticUsage = plasticUsageInput.text.toString().toDoubleOrNull()
            if (plasticUsage != null) {
                //waste reduction recommendation
                val recommendation = if (plasticUsage > 5) {
                    "Consider using reusable bags and bottles."
                } else {
                    "You're already doing great with plastic reduction!"
                }
                recommendationsText.text = recommendation
            } else {
                recommendationsText.text = "Please enter a valid number."
            }
        }
    }
}
