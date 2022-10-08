package com.example.test.presentation

import androidx.lifecycle.ViewModel
import com.example.test.data.ShopListRepositoryImpl
import com.example.test.domain.*

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteItemUseCase = DeleteItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteItemUseCase.deleteSopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        shopItem.copy(enable = !shopItem.enable)
        editShopItemUseCase.editShopItem(shopItem)
    }

}