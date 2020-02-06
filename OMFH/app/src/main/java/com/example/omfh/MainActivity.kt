package com.example.omfh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureNextbutton();
}
    private fun configureNextbutton() {
        Button Nextbutton = (Button)clearFindViewByIdCache (R.id.Nextbutton);
        Nextbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            fun onclick(View view)


        }
        )

    }

    }
