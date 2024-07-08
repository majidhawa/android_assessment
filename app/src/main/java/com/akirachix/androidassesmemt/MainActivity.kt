package com.akirachix.androidassesmemt
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.androidassesmemt.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvEpenses.layoutManager = LinearLayoutManager(this)
        displayContacts()
    }

    fun displayContacts() {
        val expense1 = MoneySpend("Salary",42000,"1th July 2024")
        val expense2 = MoneySpend("Rent",16000,"2th July 2024")
        val expense3 = MoneySpend("Divedends",24000,"4th July 2024")
        val expense4 = MoneySpend("Electricty",800,"5th July 2024")
        val expense5 = MoneySpend("Internet",2500,"5th July 2024")
        val expense6 = MoneySpend("Shopping",3500,"5th July 2024")
        val expense7 = MoneySpend("Bus Fare",500,"5th July 2024")
        val expense8 = MoneySpend("Water Bill",4000,"5th July 2024")
        val expense9 = MoneySpend("Savings",5000,"6th July 2024")
        val expense10 = MoneySpend("New Bed",3000,"5th July 2024")



        val contactsList =
            listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7,expense8,expense9,expense10)
        val expenceAdapter = ExpensesAdapter(contactsList)
        binding.rvEpenses.adapter = expenceAdapter
    }
}