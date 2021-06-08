package com.metricool.plugins.iosapptracking;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import java.io.File;
import java.util.ArrayList;

@NativePlugin()
public class IOSAppTrackingPluginPlugin extends Plugin {

    private IOSAppTrackingPlugin implementation = new IOSAppTrackingPlugin();

    @PluginMethod
    public void getTrackingStatus(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", "0");
        ret.put("status", "authorized");

        call.resolve(ret);
    }

    @PluginMethod
    public void requestPermission(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", "0");
        ret.put("status", "authorized");

        call.resolve(ret);
    }

}
