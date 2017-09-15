# myStrom
## myStrom WiFi Button
To setup the myStrom WiFi Button you need to use the myStrom App and follow their setup process. 
After you set the Button up you are able to configure the endpoints for the single, long and double click events. An example is following:

Test the connectivity: In browser e.g: http://172.31.0.41/api/v1/device/5CCF7F0CBBF9

unix: curl -v -d 'single=get://{endpoint}&double=get://{endpoint}' http://{ipButton}/api/v1/device/{macButton}

windows: curl.exe -v -d "single=get://{endpoint}&double=get://{endpoint}" http://{ipButton}/api/v1/device/{macButton}

ipButton: IP address of button in WIFI 'HackZurichIoT Legacy'

macButton: See sticker on cover

endpoint: IP on service to be notified

for more information visit the official [documentation](https://mystrom.ch/wp-content/uploads/REST_API_WBP.txt)

## myStrom WiFi Switch
