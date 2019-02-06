package com.ludei.multidex;

import android.app.Application;
import android.support.multidex.MultiDex;

import org.apache.cordova.CordovaPlugin;

/**
 * Created by imanolmartin on 22/12/15.
 */
@SuppressWarnings("unused")
public class MultidexPlugin extends CordovaPlugin {

    @SuppressWarnings("unused")
    public static void onApplicationAttachBaseContext(Application app) {
		MultiDex.install(app);
    }

}