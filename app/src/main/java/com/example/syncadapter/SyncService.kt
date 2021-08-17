package com.example.syncadapter

import android.app.Service
import android.content.Intent
import android.os.IBinder

class SyncService : Service() {

    override fun onCreate() {
        synchronized(sSyncAdapterLock) {
            if (sSyncAdapter == null) {
                sSyncAdapter = SyncContactAdapter(applicationContext, true)
            }
        }
    }


    override fun onBind(intent: Intent): IBinder? {
        return sSyncAdapter?.syncAdapterBinder
    }

    companion object {
        private var sSyncAdapter: SyncContactAdapter? = null
        private val sSyncAdapterLock = Any()
    }
}
