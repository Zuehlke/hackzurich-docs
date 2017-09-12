import datetime
import os

import picamera
import cloudsight


api_key = "?????"
secret = "?????"

snapshot_id = datetime.datetime.now().strftime("%Y-%m-%d--%H:%M:%S")
pics_path = os.path.expanduser('~') + '/pics/'

if not os.path.exists(pics_path):
	os.makedirs(pics_path)

file_path = pics_path + 'pic' + snapshot_id + '.jpg'

camera = picamera.PiCamera()
camera.capture(file_path)

print("snapshot taken!")

# send picture to image recognition API
auth = cloudsight.OAuth(api_key, secret)
api = cloudsight.API(auth)

with open(file_path, 'rb') as f:
	response = api.image_request(f, file_path, {'image_request[locale]': 'en-US'})
	status = api.wait(response['token'], timeout=30)
	print("Recognized object is {}".format(response["name"]))
