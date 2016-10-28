package com.eland.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.content.pm.PackageManager;

public class LaunchApp extends CordovaPlugin {
	
	private String LAUNCH_APP = "launch_app";

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		
		if(action.equals(LAUNCH_APP)) {			
			JSONObject arg_object = args.getJSONObject(0);
			String launchPackageName = arg_object.getString("packageName");
			
			PackageManager pm = cordova.getActivity().getPackageManager();
			Intent intent = pm.getLaunchIntentForPackage(launchPackageName);
			cordova.getActivity().startActivity(intent);
		}		
		return super.execute(action, args, callbackContext);
	}
}
