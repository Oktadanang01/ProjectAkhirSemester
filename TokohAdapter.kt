package com.example.projectakhirsemesterdanangokta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TokohAdapter: RecyclerView.Adapter<TokohAdapter.ViewHolder>() {
    private var foto = intArrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10)
    private var nama= arrayOf("Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie",
                                "Drs. Mario Teguh, M.B.A", "Tung Desem Waringin (TDW)",
                                "Najwa Shihab, S.H., LL.M", "Merry Riana, B.Eng", "Raffi Farid Ahmad", "H. Mohammad Jusuf Hamka", "TOWO Family", "Andrie Wongso", "Ippho Santosa")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //instance pallete cardview
        var foto: ImageView
        var nama: TextView

        init {
            foto= itemView.findViewById(R.id.foto)
            nama = itemView.findViewById(R.id.nama)
        }
    }

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_tokoh, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.foto.setImageResource(foto[position])
        holder.nama.text = nama[position]
        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, nama[position], Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return nama.size
    }

}