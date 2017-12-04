//
//  MFPDeviceIdPlugin.h
//
//
//
    
#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>

@interface MFPDeviceIdPlugin : CDVPlugin

- (void)getDeviceUUID:(CDVInvokedUrlCommand*)command;

@end

