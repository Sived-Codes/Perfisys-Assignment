package prashant.synksys.perfisys.spltify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import prashant.synksys.perfisys.spltify.model.ExpanseModel
import prashant.synksys.perfisys.R

class ExpanseAdapter(private val dataList: List<ExpanseModel>) : RecyclerView.Adapter<ExpanseAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cl_personal_expense_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val expanseNameTextView: TextView = itemView.findViewById(R.id.expanseNameTextView)
        private val amountTextView: TextView = itemView.findViewById(R.id.amountTextView)
        private val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
        private val typeImage: ImageView = itemView.findViewById(R.id.typeImage)

        fun bind(data: ExpanseModel) {

            if (data.expanseType == "group") {
                amountTextView.setTextColor(ContextCompat.getColor(itemView.context, R.color.orange))
                typeImage.setImageResource(R.drawable.icn_group)
                typeImage.setBackgroundResource(R.drawable.mid_round_orange_bg)
                typeImage.setPadding(25,25,25,25)
            } else {
                amountTextView.setTextColor(ContextCompat.getColor(itemView.context, R.color.primary))

                typeImage.setImageResource(R.drawable.icn_time)
                typeImage.setBackgroundResource(R.drawable.mid_round_blue_bg)
                typeImage.setPadding(25,25,25,25)
            }

            expanseNameTextView.text = data.expanseName
            amountTextView.text = "- ₹"+data.amount
            timeTextView.text = data.time
        }
    }
}
