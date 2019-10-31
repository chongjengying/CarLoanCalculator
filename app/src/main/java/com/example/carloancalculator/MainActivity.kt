package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonCalculate.setOnClickListener{
            calculateLoan()
        }


    }
    private fun calculateLoan()
    {
        //Getting input data from the user
        val car_price=editTextCarPrice.text.toString().toInt()
        val down_payment=editTextDownPayment.text.toString().toInt()
        val loan_period=editTextLoanPeriod.text.toString().toInt()
        val interest_rate=editTextInterestRate.text.toString().toFloat()


       val loan=car_price-down_payment
        val interest=loan*4.5*5
        val mrepayment=(loan +interest)/5/12

        textViewCarLoan.text =getString(R.string.loan)+":${loan}"

        textViewInterest.text=getString (R.string.interest)+":$(interest)"


    }

    fun resetInput(view: View)

    {


    }


}
