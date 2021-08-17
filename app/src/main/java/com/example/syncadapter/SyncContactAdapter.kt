package com.example.syncadapter

import android.accounts.Account
import android.content.*
import android.os.Bundle

class SyncContactAdapter(context: Context, autoInitialize: Boolean,allowParallelSyncs: Boolean = false
                         ,val mContentResolver: ContentResolver = context.contentResolver)
    : AbstractThreadedSyncAdapter(context ,autoInitialize ,allowParallelSyncs) {
    override fun onPerformSync(
        account: Account?,
        extra: Bundle?,
        authority: String?,
        provider: ContentProviderClient?,
        syncResult: SyncResult?
    ) {



    }
}