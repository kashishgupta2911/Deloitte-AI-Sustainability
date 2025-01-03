import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CarbonFootprintActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carbon_footprint)

        val transportationInput = findViewById<EditText>(R.id.transportationInput)
        val submitTransportationBtn = findViewById<Button>(R.id.submitTransportationBtn)
        val footprintRecommendationText = findViewById<TextView>(R.id.footprintRecommendationText)

        submitTransportationBtn.setOnClickListener {
            val kilometersTraveled = transportationInput.text.toString().toDoubleOrNull()
            if (kilometersTraveled != null) {
                // Simple logic for carbon footprint reduction
                val recommendation = if (kilometersTraveled > 50) {
                    "Consider using public transport or carpooling to reduce emissions."
                } else {
                    "Good job! You’re minimizing your carbon footprint."
                }
                footprintRecommendationText.text = recommendation
            } else {
                footprintRecommendationText.text = "Please enter a valid number."
            }
        }
    }
}
