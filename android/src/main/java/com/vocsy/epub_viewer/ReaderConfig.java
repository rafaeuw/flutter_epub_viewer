package com.vocsy.epub_viewer;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;

import com.folioreader.Config;
import com.folioreader.util.AppUtil;

public class ReaderConfig {
    private String identifier;
    private String themeColor;
    private String scrollDirection;
    private boolean allowSharing;
    private boolean showTts;
    private boolean nightMode;

    public Config config;

    public ReaderConfig(Context context, String identifier, String themeColor,
                        String scrollDirection, boolean allowSharing, boolean showTts , boolean nightMode){

       config = AppUtil.getSavedConfig(context);
       if (config == null){
            config = new Config();
            config.setThemeColorInt(Color.parseColor(themeColor));
            config.setNightThemeColorInt(Color.parseColor(themeColor));
            config.setShowRemainingIndicator(true);
            config.setShowTts(showTts);
            config.setNightMode(nightMode);
        }

    }
}
