package com.example.test.domain

class DeleteItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteSopItem(shopItem: ShopItem) {
        shopListRepository.deleteSopItem(shopItem)
    }
}