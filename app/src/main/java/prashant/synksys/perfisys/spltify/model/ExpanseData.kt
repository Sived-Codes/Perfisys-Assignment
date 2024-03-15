package prashant.synksys.perfisys.spltify.model

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.random.Random

class ExpanseData {

    companion object {
        fun getList(): List<ExpanseModel> {
            val dataList = mutableListOf<ExpanseModel>()
            val expanseTypes = listOf("personal", "group")
            val expenseNames = listOf(
                "For New Mobile",
                "Birthday Party",
                "Shopping Spree",
                "Travel Expenses",
                "Restaurant Dinner",
                "Movie Night",
                "Grocery Shopping",
                "Gym Membership",
                "Home Decor",
                "Car Maintenance"
            )

            val random = Random(System.currentTimeMillis())

            repeat(random.nextInt(30, 41)) {
                val expanseType = expanseTypes.random()
                val expanseName = expenseNames.random()
                val amount = random.nextInt(1000, 100000).toDouble()
                val time = formatDate(System.currentTimeMillis())
                val id = it.toString()
                dataList.add(ExpanseModel(expanseType, expanseName, amount.toString(), time, id))
            }

            return dataList
        }
        private fun formatDate(timeInMillis: Long): String {
            val sdf = SimpleDateFormat("dd MMM yyyy, hh:mm a", Locale.getDefault())
            return sdf.format(Date(timeInMillis))
        }
    }
}