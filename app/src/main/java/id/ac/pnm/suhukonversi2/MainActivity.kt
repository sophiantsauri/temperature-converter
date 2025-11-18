package id.ac.pnm.suhukonversi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editTextTemp: EditText
    private lateinit var textViewResult: TextView
    private lateinit var btnReaumurToCelsius: Button
    private lateinit var btnCelsiusToFahrenheit: Button
    private lateinit var btnFahrenheitToCelsius: Button
    private lateinit var btnCelsiusToReaumur: Button
    private lateinit var btnFahrenheitToReaumur: Button
    private lateinit var btnReaumurToFahrenheit: Button
    private lateinit var btnClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi komponen UI
        editTextTemp = findViewById(R.id.editTextTemp)
        textViewResult = findViewById(R.id.textViewResult)
        btnReaumurToCelsius = findViewById(R.id.btnReaumurToCelsius)
        btnCelsiusToFahrenheit = findViewById(R.id.btnCelsiusToFahrenheit)
        btnFahrenheitToCelsius = findViewById(R.id.btnFahrenheitToCelsius)
        btnCelsiusToReaumur = findViewById(R.id.btnCelsiusToReaumur)
        btnFahrenheitToReaumur = findViewById(R.id.btnFahrenheitToReaumur)
        btnReaumurToFahrenheit = findViewById(R.id.btnReaumurToFahrenheit)
        btnClear = findViewById(R.id.btnClear)

        // Atur listener untuk setiap tombol
        btnReaumurToCelsius.setOnClickListener { convertReaumurToCelsius() }
        btnCelsiusToFahrenheit.setOnClickListener { convertCelsiusToFahrenheit() }
        btnFahrenheitToCelsius.setOnClickListener { convertFahrenheitToCelsius() }
        btnCelsiusToReaumur.setOnClickListener { convertCelsiusToReaumur() }
        btnFahrenheitToReaumur.setOnClickListener { convertFahrenheitToReaumur() }
        btnReaumurToFahrenheit.setOnClickListener { convertReaumurToFahrenheit() }
        btnClear.setOnClickListener { clearFields() }
    }

    private fun convertReaumurToCelsius() {
        val inputStr = editTextTemp.text.toString()
        if (inputStr.isEmpty()) {
            Toast.makeText(this, "Masukkan suhu terlebih dahulu", Toast.LENGTH_SHORT).show()
            return
        }
        val reaumur = inputStr.toDouble()
        val celsius = reaumur * 5 / 4
        textViewResult.text = String.format("Hasil: %.2f °C", celsius)
    }

    private fun convertCelsiusToFahrenheit() {
        val inputStr = editTextTemp.text.toString()
        if (inputStr.isEmpty()) {
            Toast.makeText(this, "Masukkan suhu terlebih dahulu", Toast.LENGTH_SHORT).show()
            return
        }
        val celsius = inputStr.toDouble()
        val fahrenheit = (celsius * 9 / 5) + 32
        textViewResult.text = String.format("Hasil: %.2f °F", fahrenheit)
    }

    private fun convertFahrenheitToCelsius() {
        val inputStr = editTextTemp.text.toString()
        if (inputStr.isEmpty()) {
            Toast.makeText(this, "Masukkan suhu terlebih dahulu", Toast.LENGTH_SHORT).show()
            return
        }
        val fahrenheit = inputStr.toDouble()
        val celsius = (fahrenheit - 32) * 5 / 9
        textViewResult.text = String.format("Hasil: %.2f °C", celsius)
    }

    private fun convertCelsiusToReaumur() {
        val inputStr = editTextTemp.text.toString()
        if (inputStr.isEmpty()) {
            Toast.makeText(this, "Masukkan suhu terlebih dahulu", Toast.LENGTH_SHORT).show()
            return
        }
        val celsius = inputStr.toDouble()
        val reaumur = celsius * 4 / 5
        textViewResult.text = String.format("Hasil: %.2f °R", reaumur)
    }

    private fun convertFahrenheitToReaumur() {
        val inputStr = editTextTemp.text.toString()
        if (inputStr.isEmpty()) {
            Toast.makeText(this, "Masukkan suhu terlebih dahulu", Toast.LENGTH_SHORT).show()
            return
        }
        val fahrenheit = inputStr.toDouble()
        val reaumur = (fahrenheit - 32) * 4 / 9
        textViewResult.text = String.format("Hasil: %.2f °R", reaumur)
    }

    private fun convertReaumurToFahrenheit() {
        val inputStr = editTextTemp.text.toString()
        if (inputStr.isEmpty()) {
            Toast.makeText(this, "Masukkan suhu terlebih dahulu", Toast.LENGTH_SHORT).show()
            return
        }
        val reaumur = inputStr.toDouble()
        val fahrenheit = (reaumur * 9 / 4) + 32
        textViewResult.text = String.format("Hasil: %.2f °F", fahrenheit)
    }

    private fun clearFields() {
        editTextTemp.text.clear()
        textViewResult.text = "Hasil:"
        editTextTemp.requestFocus()
    }
}
