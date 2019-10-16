package com.example.fisheries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById(R.id.spinner_productTypeId) as Spinner
        result = findViewById(R.id.tv_resultId) as TextView

        var options = arrayOf("A", "B", "C")
        option.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                result.text = "Please select an option"
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                result.text = options.get(p2)
            }
        }

        btn_postId.setOnClickListener {
            var trueValue: Boolean = true;
            var title: String = et_titleId.text.toString();
            var slug: String = et_slugId.text.toString();
            var productType: Int = 1;

            RetrofitClient.instance.productDetailsPost(trueValue, title, slug, productType)
                .enqueue(object : Callback<DefaultResponse> {
                    override fun onFailure(call: Call<DefaultResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(
                        call: Call<DefaultResponse>,
                        response: Response<DefaultResponse>
                    ) {
                        Toast.makeText(applicationContext, response.message(), Toast.LENGTH_LONG)
                            .show()
                    }

                })
        }
    }
}
