import subprocess
import datetime
import os


api_key = "EaVrPxrdYtXs8JKXhZqAWw"
secret = "vwusWD2vFnFJ6zByKZcG0Ax"

snapshot_id = datetime.datetime.now().strftime("%Y-%m-%d--%H:%M:%S")
pics_path = os.path.expanduser('~') + '/pics/'

if not os.path.exists(pics_path):
	os.makedirs(pics_path)

file_path = pics_path + 'pic' + snapshot_id + '.jpg'

subprocess.call(['fswebcam', '-d/dev/video0', '-r640x480', file_path])

print "snapshot taken!"

# send picture to image recognition API
