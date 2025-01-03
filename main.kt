import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wasteReductionBtn = findViewById<Button>(R.id.wasteReductionBtn)
        val carbonFootprintBtn = findViewById<Button>(R.id.carbonFootprintBtn)

        wasteReductionBtn.setOnClickListener {
            startActivity(Intent(this, WasteReductionActivity::class.java))
        }

        carbonFootprintBtn.setOnClickListener {
            startActivity(Intent(this, CarbonFootprintActivity::class.java))
        }
    }
}
