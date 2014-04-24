                       Sana mobile Dispatch Server(mDS) Push Notification : vit-11
                       ===========================================================
Overview. This document is intended as a HOW-TO for working with the Sana mDS 
API.
                    
1. So you want to add middleware to mDS.
The following outlines the steps required to implement custom middleware to work 
with the mDS API.
 
    1.  Add appropriately named package to sana.middleware
    2.  Copy emitters.py, forms.py, handlers.py, and urls.py from this package 
        into the new package.
    3.  Select which dispatchables will be accepted
    4.  Remove urls for unhandled dispatchables from urls.py
    5.  Remove handlers for unhandled dispatchables
    6.  Implement handlers
    7.  Implement any emitters
    8.  Implement any forms 
    9.  When you are ready to test it. Add the following to sana.api.urls

            url(r'^<your-package>/',
                include('sana.middleware.<your-package>.urls')),
            
        This will let you send requests directly to the middleware by using
    
            http:<your-host>/mds/<your-package>
        
    10.  When you are comfortable that the middleware is working how you would like,
        remove the lines from #8 from sana.api.urls
    11. Add your new middleware to settings.DISPATCHERS


The main implemented code by us is in sana/contrib/middleware. 
