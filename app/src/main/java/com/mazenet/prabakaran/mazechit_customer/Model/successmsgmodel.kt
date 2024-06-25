package com.mazenet.prabakaran.mazechit_customer.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class successmsgmodel {
    @SerializedName("status")
    @Expose
    private var status: String? = null
    @SerializedName("msg")
    @Expose
    private var msg: String? = null

    /**
     * No args constructor for use in serialization
     *
     */

    /**
     *
     * @param status
     * @param msg
     */
    fun Successmsgmodel(status: String, msg: String) {

        this.status = status
        this.msg = msg
    }

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getMsg(): String? {
        return msg
    }

    fun setMsg(msg: String) {
        this.msg = msg
    }
}