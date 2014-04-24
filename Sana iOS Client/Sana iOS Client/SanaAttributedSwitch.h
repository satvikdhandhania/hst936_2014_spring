//
//  SanaAttributedSwitch.h
//  Sana iOS Client
//
//  Created by Prince Shekhar on 4/4/14.
//  Copyright (c) 2014 MIT. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface SanaAttributedSwitch : UISwitch

@property (nonatomic, retain) NSString *elementId;
@property (nonatomic, retain) NSString *question;
@property (nonatomic, retain) NSString *answer;
@property (nonatomic, retain) NSString *concept;

@end
