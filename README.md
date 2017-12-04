# cordova-plugin-mfpdeviceid
This plugin deviceID is equal to WL.Device.getID (MobileFirst 6.2 ~ 7.1)
You can use it to get same deviceId in MobileFirst 8 APP

# iOS prerequisites :
You need to turn on keychain Sharing in Xcode Capabilities


# Android setup :
You need to add wlDeviceIdStrength=strong in your mfpclient.properties

# How to use ?
  window.mfpdeviceId.getDeviceID(function(deviceId) {console.log(deviceId)}, function(result) {console.log(result)});
