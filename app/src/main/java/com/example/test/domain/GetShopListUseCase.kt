package com.example.test.domain

import androidx.lifecycle.LiveData

open class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>>
    {
      return  shopListRepository.getShopList()
    }
}