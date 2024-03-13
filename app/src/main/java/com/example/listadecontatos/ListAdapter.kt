package com.example.listadecontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listadecontatos.databinding.RcvBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListRcvViewHolder>() {

    private val creatMockData = listOf<Dados>(
        Dados("Eli", "11930224414"),
        Dados("Eli", "11930224414"),
        Dados("Eli", "11930224414"),
        Dados("Eli", "11930224414"),
        Dados("Eli", "11930224414"),
        Dados("Eli", "11930224414"),
        Dados("Eli", "11930224414"),
        Dados("Eli", "11930224414")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListRcvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rcv, parent, false)
        return ListRcvViewHolder(view)
    }

    override fun getItemCount(): Int = creatMockData.size

    override fun onBindViewHolder(holder: ListRcvViewHolder, position: Int) {
        holder.bind(creatMockData[position])
    }

    class ListRcvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome: TextView = itemView.findViewById(R.id.nome)
        val numero: TextView = itemView.findViewById(R.id.telefone)

        fun bind(dados: Dados) {
            nome.text = dados.name
            numero.text = dados.numero
        }
    }
}


