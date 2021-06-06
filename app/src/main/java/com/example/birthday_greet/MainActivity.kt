package com.example.birthday_greet
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        create_Birthday_Button.setOnClickListener {
//
//        }
//optional method
        }

    fun createBirthdayCard1(view: View) {
        val name=nameInput.editableText.toString()
//        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
//
//by using intent we can pass data from one page to another page
    val intent1 = Intent(this,BirthdayGreetingActivity::class.java)
        intent1.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent1)

    }


}