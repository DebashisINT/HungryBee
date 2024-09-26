package com.breezehungrybee.features.addshop.presentation

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import com.breezehungrybee.R
import com.breezehungrybee.app.domain.AssignToDDEntity
import com.breezehungrybee.app.domain.AssignToShopEntity
import com.breezehungrybee.widgets.AppCustomTextView
import java.util.HashSet
import kotlin.collections.ArrayList

/**
 * Created by Saikat on 18-Sep-18.
 */
class AssignedToShopAdapter(private val context: Context, list: ArrayList<AssignToShopEntity>?, private val onItemClickListener: OnItemClickListener)
    : RecyclerView.Adapter<AssignedToShopAdapter.ViewHolder>(), Filterable {

    private val inflater: LayoutInflater
    private var mList: ArrayList<AssignToShopEntity>? = null
    private var tempList: ArrayList<AssignToShopEntity>? = null
    private var filterList: ArrayList<AssignToShopEntity>? = null
    
    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        //ddList = mAssignedList //AppDatabase.getDBInstance()?.ddListDao()?.getAll() as ArrayList<AssignToDDEntity>?
        mList= ArrayList()
        mList?.addAll(list!!)
        
        tempList = ArrayList()
        filterList = ArrayList()

        tempList?.addAll(list!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.exp_popup_window_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.list_item_tv.text = mList?.get(position)?.name
        holder.tv_phn_no.text = "(" + mList?.get(position)?.phn_no + ")"
        holder.tv_phn_no.visibility = View.VISIBLE
    }

    override fun getItemCount(): Int {
        return mList?.size!!
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var list_item_tv: AppCustomTextView
        var tv_phn_no: AppCustomTextView

        init {
            list_item_tv = itemView.findViewById(R.id.list_item_tv)
            tv_phn_no = itemView.findViewById(R.id.tv_phn_no)

            itemView.setOnClickListener {
                onItemClickListener.onItemClick(mList?.get(adapterPosition))
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(shop: AssignToShopEntity?)
    }

    override fun getFilter(): Filter {
        return SearchFilter()
    }

    inner class SearchFilter : Filter() {
        override fun performFiltering(p0: CharSequence?): FilterResults {
            val results = FilterResults()

            filterList?.clear()

            /*for (i in tempDDList?.indices!!){
                if (tempDDList?.get(i)?.toLowerCase()?.contains(p0?.toString()?.toLowerCase()!!)!!) {
                    filterDDList?.add(tempDDList?.get(i)!!)
                }
            }

            tempDDList?.indices!!
                    .asSequence()
                    .filter { tempDDList?.get(it)?.toLowerCase()?.contains(p0?.toString()?.toLowerCase()!!)!! }
                    .forEach { filterDDList?.add(tempDDList?.get(it)!!) }*/

            tempList?.indices!!
                    .filter { tempList?.get(it)?.name?.toLowerCase()?.contains(p0?.toString()?.toLowerCase()!!)!! }
                    .forEach { filterList?.add(tempList?.get(it)!!) }

            results.values = filterList
            results.count = filterList?.size!!

            return results
        }

        override fun publishResults(p0: CharSequence?, results: FilterResults?) {

            try {
                filterList = results?.values as ArrayList<AssignToShopEntity>?
                mList?.clear()
                val hashSet = HashSet<String>()
                if (filterList != null) {

                    /*for (i in filterDDList?.indices!!) {
                        if (hashSet.add(filterDDList?.get(i)!!))
                            brandList?.add(filterDDList?.get(i)!!)
                    }

                    filterDDList?.indices!!
                            .asSequence()
                            .filter { hashSet.add(filterDDList?.get(it)!!) }
                            .forEach { brandList?.add(filterDDList?.get(it)!!) }*/

                    filterList?.indices!!
                            .filter { hashSet.add(filterList?.get(it)?.assigned_to_shop_id!!) }
                            .forEach { mList?.add(filterList?.get(it)!!) }

                    notifyDataSetChanged()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}