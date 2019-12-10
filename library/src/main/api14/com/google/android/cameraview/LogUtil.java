package com.google.android.cameraview;

import android.util.Log;

/**
 *
 */
/*public*/ final class LogUtil {

    private static final int LOG_MAXLENGTH = 2000;

    public static void w(String TAG, String msg) {
        int strLength = msg.length();
        int start = 0;
        int end = LOG_MAXLENGTH;
        for (int i = 0; i < 100; i++) {
            if (strLength > end) {
                Log.w(TAG + i, msg.substring(start, end));
                start = end;
                end = end + LOG_MAXLENGTH;
            } else {
                Log.w(TAG, msg.substring(start, strLength));
                break;
            }
        }
    }
}