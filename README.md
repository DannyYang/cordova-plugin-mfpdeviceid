# cordova-plugin-mfpdeviceid


# cordova plugin requirement :
cordova-plugin-mfp

# iOS prerequisites :
You need to turn on keychain Sharing in Xcode Capabilities

# Android setup :
(option)You need to add wlDeviceIdStrength=strong in your mfpclient.properties

# How to use ?
  window.mfpdeviceId.getDeviceID(function(deviceId) {console.log(deviceId)}, function(result) {console.log(result)});
