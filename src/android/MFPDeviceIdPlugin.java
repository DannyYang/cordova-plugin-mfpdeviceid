package com.cordova.mobilefirst.plugins.mfpdeviceId;

import android.util.Log;

import com.worklight.common.security.WLDeviceAuthManager;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class MFPDeviceIdPlugin extends CordovaPlugin {
	protected static final String LOG_TAG = "MFPDeviceIdPlugin";

	public static enum ACTION {
		getDeviceUUID;

		private ACTION() {
		}

		public static ACTION fromString(String Str) {
			try {
				return valueOf(Str);
			} catch (Exception ex) {
				Log.e(LOG_TAG, ex.getMessage(), ex);
			}
			return null;
		}
	}

	public boolean execute(String action, JSONArray args, CallbackContext ctx) throws JSONException {
		ACTION actionE = ACTION.fromString(action);
		if (actionE != null) {
			switch (actionE) {
			case getDeviceUUID:
				return callback(getDeviceUUID(), ctx);
			}
			ctx.error("Invalid action: " + action);
			return true;
		}
		ctx.error("Null action");
		return true;
	}

	private boolean callback(String result, CallbackContext ctx) {
		if ("result:error".equals(result)) {
			ctx.error(PluginResult.Status.ERROR.name());
			return true;
		}
		ctx.success(result);
		return true;
	}

	private String getDeviceUUID() {
		try {
			return WLDeviceAuthManager.getInstance().getDeviceUUID(this.cordova.getActivity());
		} catch (Exception e) {
			Log.e(LOG_TAG, e.getMessage(), e);
		}
		return "result:error";
	}
}
