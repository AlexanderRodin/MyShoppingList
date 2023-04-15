package com.example.myshoppinglist.di

import android.app.Application
import com.example.myshoppinglist.data.AppDataBase
import com.example.myshoppinglist.data.ShopListDao
import com.example.myshoppinglist.data.ShopListRepositoryImpl
import com.example.myshoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {
        @Provides
        @ApplicationScope
        fun provideShopListDao(
            application: Application,
        ): ShopListDao {
            return AppDataBase.getInstance(application).shopListDao()
        }
    }
}