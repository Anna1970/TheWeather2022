package ru.naa.theweather2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.naa.theweather2022.Model.CityListAdapter
import ru.naa.theweather2022.Model.Repository
import ru.naa.theweather2022.databinding.ActivityMainBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

const val WEATHER_API_KEY = "UHRIH1AlUU5RQGSNAtXxx7Mcb7czKkqp"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = Repository()
        val cityAdapter = CityListAdapter()
        cityAdapter.updateList(repository.getAll())

        binding.rvCity.adapter = cityAdapter

        binding.btnGet.setOnClickListener {
            getCity()
        }

        /*binding.tvCity.setOnClickListener {
            showDetail()
        }*/
    }

    /*private fun showDetail() {
        val intent = Intent(this, DetailActivity::class.java)
        //intent.putExtra(DETAIL_CITY, binding.tvCity.text.toString())
        val date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss"))
        intent.putExtra(DETAIL_DATE, date)
        startActivity(intent)
    }*/

    private fun getCity(){
       /* val url = "http://dataservice.accuweather.com/locations/v1/topcities/50?apikey=$WEATHER_API_KEY&language=ru-ru"

       val url = "https://api.gismeteo.net/v2/weather/current/4368/?lang=ru"
        lateinit var result: String

        val queue = Volley.newRequestQueue(this)
        val strinRequest = StringRequest(Request.Method.GET,
            url,
            { response ->
              Log.d("WEATHER","Response: $response")
                result = response.toString().trim()
            },
            {
                Log.d("WEATHER", "Error: ${it.toString()}")
                result = it.toString().trim()
            }
        )
        queue.add(strinRequest)*/
        binding.tvAbout.text = "Москва"
    }
}