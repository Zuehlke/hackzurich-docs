# myStrom
## myStrom WiFi Button

### Variables
* {ipButton}: IP address of button in WIFI 'HackZurichIoT Legacy'
* {macButton}: See sticker on cover. Its the second part of PQWBB1 MAC-**5CCF7F0CBBF9**
* {endpoint}: IP of the service to be notified

### Test connectivity
in your browser e.g: http://{ipButton}/api/v1/device/{macButton} like http://172.31.0.41/api/v1/device/5CCF7F0CBBF9

### define endpoints for button click events
* in unix: curl -v -d 'single=get://{endpoint}&double=get://{endpoint}' http://{ipButton}/api/v1/device/{macButton}
* in windows: curl.exe -v -d "single=get://{endpoint}&double=get://{endpoint}" http://{ipButton}/api/v1/device/{macButton}

----
We already did the setup. If you want to do it again, you need to use the myStrom App and follow the setup process. 
After you set the Button up you are able to configure the endpoints for the single, long and double click events.
For more information visit the official [documentation](https://mystrom.ch/wp-content/uploads/REST_API_WBP.txt)

## myStrom WiFi Switch
