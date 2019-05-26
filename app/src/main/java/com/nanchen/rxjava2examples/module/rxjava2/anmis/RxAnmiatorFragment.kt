package com.nanchen.rxjava2examples.module.rxjava2.anmis

import android.content.Intent
import com.nanchen.rxjava2examples.model.OperatorModel
import com.nanchen.rxjava2examples.module.rxjava2.CategoryBaseFragment
import com.nanchen.rxjava2examples.module.rxjava2.anmis.item.RxAnmiatorActivity

/**
 * Description:
 * Author: PC306
 * Date: 2019/5/26
 */
class RxAnmiatorFragment:CategoryBaseFragment() {

    override fun fillData() {
        data.add(OperatorModel("anmi", "anmi_des"))
    }

    override fun itemClick(position: Int) {
        when(position) {
            0 -> {
                startActivity(Intent(activity, RxAnmiatorActivity::class.java))
            }
        }
    }
}