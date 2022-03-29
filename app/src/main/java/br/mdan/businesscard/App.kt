package br.mdan.businesscard

import android.app.Application
import br.mdan.businesscard.data.AppDatabase
import br.mdan.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}