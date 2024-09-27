package com.indri.pnp_indri.model

import com.indri.pnp_indri.R

data class PnpModel(
    val image : Int,
    val image1 : Int
)

object Mocklist {
    fun getModel() : List<PnpModel> {
        val itemModel1 = PnpModel(
            R.drawable.g10,
            R.drawable.g6
        )

        val itemModel2 = PnpModel(
            R.drawable.g1,
            R.drawable.g11
        )

        val itemModel3 = PnpModel(
            R.drawable.g2,
            R.drawable.g3
        )

        val itemModel4 = PnpModel(
            R.drawable.g4,
            R.drawable.g8
        )

        val itemModel5 = PnpModel(
            R.drawable.g5,
            R.drawable.g6
        )

        val itemModel6 = PnpModel(
            R.drawable.g7,
            R.drawable.g9
        )


        val itemList: ArrayList<PnpModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}
