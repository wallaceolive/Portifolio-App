package com.dio.projeto.portfolio

import android.app.Application
import com.dio.projeto.portfolio.data.di.DataModule
import com.dio.projeto.portfolio.domain.di.DomainModule
import com.dio.projeto.portfolio.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}