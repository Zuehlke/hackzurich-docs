# Image Recognition APIs

Doing machine learning on a raspberry pi is not a very good idea since it has only limited resources. Using cloud image recognition services is much more suitable for a IoT use case.


## Camera Module

The given camera is a common camera module for the Raspberry Pi. For taking simple snapshots we can use `raspistill`.

## Setup

Make sure the camera is enabled: Run `sudo raspi-config` and enable the pi camera. Also install `python-picamera` to have access to the camera in your python scripts: `sudo apt-get install python-picamera`.

## Taking a picture on RPi

On the terminal:

- `raspistill -o image.jpg`
- Further arguments can be passed. See [here](https://www.raspberrypi.org/documentation/usage/camera/raspicam/raspistill.md) for more informations.

In python:

We need another library to send the taken image to CloudSight. Run `pip install cloudsight` to install the python library.

- Look at the `image_recognition.py` script for a complete example.


## APIs

This is a list of simple to use APIs where you can send an image and get a list of recognized objects.

### CloudSight

CloudSight is an image recognition and reverse image search service.

- 500 free image requests
- Credit card is needed for a trial subscription
- Offer libs in: Ruby, Swift, Go, Python
