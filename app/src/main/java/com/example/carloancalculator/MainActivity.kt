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
        val interest = ((loan*interest_rate/100)/(loan_period*12))
        val mrepayment=( interest) + (loan/(loan_period*12))

        textViewLoan.text = "Loan :" + "${loan}"

        textViewInterest.text = " Interest:" + "${interest}"
        textViewMonthlyRepayment.text = "Monthly Repayment:"+ "${mrepayment}"

    }

    fun resetInput(view: View)
    {
        editTextCarPrice.setText(null)
        editTextDownPayment.setText(null)
        editTextInterestRate.setText(null)
        editTextLoanPeriod.setText(null)
        textViewLoan.setText("Loan :")
        textViewMonthlyRepayment.setText("Month Repayment :")
        textViewInterest.setText("Inteest: ")

    }


}
