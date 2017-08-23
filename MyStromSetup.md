# myStrom
## myStrom WiFi Button
To setup the myStrom WiFi Button you need to use the myStrom App and follow their setup process. 
After you set the Button up you are able to configure the endpoints for the single, long and double click events. An example is following:

unix: curl -v -d 'single=get://{endpoint}&double=get://{endpoint}' http://{ipButton}/api/v1/device/{macButton}

windows: 

for more information visit the official [documentation](https://mystrom.ch/wp-content/uploads/REST_API_WBP.txt)

## myStrom WiFi Switch