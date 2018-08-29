package cn.com.startai.startai_log;

import android.util.Log;

/**
 * Created by Robin on 2018/8/28.
 * qq: 419109715
 */

public class StartaiLog {


    private StartaiLog() {
    }

    /**
     *
     * @param tag tag
     * @param text text
     */
    public static void info(String tag, String text) {
        Log.i(tag, text);
    }
}
