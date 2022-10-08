package com.example.test.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNDEFINED

)
{
    companion object {
        const val UNDEFINED = -1
    }
}
