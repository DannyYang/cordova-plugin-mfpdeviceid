var exec = require('cordova/exec');
function MFPDeviceId() {

}
MFPDeviceId.prototype.getDeviceID = function (successCallback, failureCallback) {
    exec(successCallback, failureCallback, "MFPDeviceIdPlugin", "getDeviceUUID", []);
};
module.exports = new MFPDeviceId();
// window.mfpdeviceId.getDeviceID(function(result) {console.log(result)}, function(result) {console.log(result)});
