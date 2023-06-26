package com.example.pageflipper

import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>, private val itemClickListener: ((View) -> Unit)? = null, private val listener: View.OnClickListener) : RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{
    public lateinit var researcharea: String
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ra = listOf("Vistas", "Accountancy P-1", "Accountancy P-2", "Chemistry P-1", "Chemistry P-2","Maths P-1","Maths P-2","Physics P-1","Physics P-2","Economics","Hornbill", "Accountancy P-1", "Accountancy P-2", "Chemistry P-1", "Chemistry P-2","Maths","Physics P-1","Physics P-2","Economics")
        val ItemsViewModel = mList[position]
        holder.textView.text = ItemsViewModel.text1
        holder.imageView.setImageResource(ItemsViewModel.imageView)
        var k = String()
        holder.textView.setOnClickListener {
            val item = mList[position]
            for (i in ra) {
                if (item.text1.toString() == i) {
                    val intent = Intent(holder.itemView.context, display::class.java)
                    intent.putExtra("key", item.text1)
                    holder.itemView.context.startActivity(intent)
                    k = item.text1
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
        val imageView: ImageView = itemView.findViewById(R.id.image)
    }

}