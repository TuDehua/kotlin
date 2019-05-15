package com.tdh.kotlinlearn

/**
 * Author: tudehua
 * E-mail:tdh@erongdu.com
 * Date: 2019/5/14 14:54
 * <p/>
 * Descripiton:({@link})
 */
const val SCHEME = "http"

class Practice {
    var a = 0
    var b = 0L
    var str: String? = ""
    // lateinit 关键词不能修饰基本数据类型，String除外，必须是var修饰
    lateinit var lateStr: String
    // by lazy 延迟初始化 只能用val修饰
    val d: Int by lazy { 2 }
    val lazyStr: String by lazy { "I am lazy" }

    init {
        a = 1
        //下划线分割数字使数字更易读
        b = 9_123_456L
        str = null
    }

    fun compareAandB(): Int {
        return a.compareTo(b)
    }
}