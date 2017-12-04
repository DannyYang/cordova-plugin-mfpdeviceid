//
//  MFPDeviceIdPlugin.m
//
//
//

#import "MFPDeviceIdPlugin.h"
#import <IBMMobileFirstPlatformFoundation/IBMMobileFirstPlatformFoundation.h>

@implementation MFPDeviceIdPlugin

-(void)getDeviceUUID:(CDVInvokedUrlCommand*)command
{
    [self.commandDelegate runInBackground:^{
        NSString* uuid = [[WLDeviceAuthManager sharedInstance] getWLUniqueDeviceId];
        NSLog(@"WLUUID result: %@",uuid);
        CDVPluginResult *result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:uuid];
        [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
    }];
}

@end

