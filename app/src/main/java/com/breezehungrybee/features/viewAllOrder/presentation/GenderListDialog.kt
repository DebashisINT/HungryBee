package com.breezehungrybee.features.viewAllOrder.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.breezehungrybee.R
import com.breezehungrybee.app.domain.AddShopDBModelEntity
import com.breezehungrybee.app.domain.NewOrderGenderEntity
import com.breezehungrybee.features.activities.presentation.PartyAdapter
import com.breezehungrybee.features.activities.presentation.PartyListDialog
import com.breezehungrybee.features.viewAllOrder.interf.GenderListOnClick
import com.breezehungrybee.widgets.AppCustomTextView

class GenderListDialog: DialogFragment() {

    private lateinit var header: AppCustomTextView
    private lateinit var close: ImageView
    private lateinit var rv_gender: RecyclerView
    private  var adapter:GenderListAdapter? = null
    private lateinit var mContext: Context

    companion object{
        private lateinit var onSelectItem: (NewOrderGenderEntity) -> Unit
        private var mGenderList: ArrayList<NewOrderGenderEntity>? = null

        fun newInstance(gList: ArrayList<NewOrderGenderEntity>, function: (NewOrderGenderEntity) -> Unit): GenderListDialog {
            val dialogFragment = GenderListDialog()
            GenderListDialog.mGenderList = gList
            GenderListDialog.onSelectItem = function
            return dialogFragment
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        dialog?.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog?.setCanceledOnTouchOutside(true)
        dialog?.getWindow()!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val v = inflater.inflate(R.layout.dialog_gender_list, container, false)

        isCancelable = false

        initView(v)
        return v
    }

    private fun initView(v: View){
        header=v.findViewById(R.id.tv_dialog_gender_list_header)
        close=v.findViewById(R.id.iv_dialog_gender_list_close_icon)
        rv_gender=v.findViewById(R.id.rv_dialog_gender_list)
        rv_gender.layoutManager = LinearLayoutManager(mContext)

        //gender vs product type new order
        //var str = mContext.getString(R.string.GenderTextNewOrd)
        var str = mContext.getString(R.string.ProductTextNewOrd)
        header.text="Select "+ str

       /* adapter = GenderListAdapter(mContext, GenderListDialog.mGenderList) { gender: NewOrderGenderEntity ->
            dismiss()
            GenderListDialog.onSelectItem(gender)
        }*/

        adapter=GenderListAdapter(mContext,GenderListDialog.mGenderList!!,object: GenderListOnClick{
            override fun genderListOnClick(gender: NewOrderGenderEntity) {
                dismiss()
                onSelectItem(gender)
            }
        })
        rv_gender.adapter=adapter

        close.apply {
            visibility = View.VISIBLE
            setOnClickListener {
                dismiss()
            }
        }
    }


}