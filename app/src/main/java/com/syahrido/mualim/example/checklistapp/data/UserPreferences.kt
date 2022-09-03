package com.syahrido.mualim.example.checklistapp.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class UserPreferences(private val context: Context) {

    suspend fun saveToken(token: String) {
        context.dataStore.edit {
            it[TOKEN] = token
        }
    }

    val loginResponse: Flow<String?>
        get() = context.dataStore.data.map{
            it[TOKEN]
        }


    companion object {
        val TOKEN = stringPreferencesKey("TOKEN")
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "user_datastore")
    }
}