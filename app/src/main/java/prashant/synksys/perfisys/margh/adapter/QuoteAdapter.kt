package prashant.synksys.perfisys.margh.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import prashant.synksys.perfisys.spltify.model.ExpanseModel
import prashant.synksys.perfisys.R
import prashant.synksys.perfisys.margh.model.QuoteModel

class QuoteAdapter(private val dataList: List<QuoteModel>) : RecyclerView.Adapter<QuoteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cl_quote_layout, parent, false)
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
        private val image: ImageView = itemView.findViewById(R.id.quoteImage)

        fun bind(data: QuoteModel) {

            Picasso.get().load(data.imageUrl).into(image)
        }
    }
}
