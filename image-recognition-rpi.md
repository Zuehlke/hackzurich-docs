# Image Recognition APIs

Doing machine learning on a raspberry pi is not a very good idea since it has only limited resources. Using cloud image recognition services is much more suitable for a IoT use case.


## Webcams

The given webcam is a Logitec 310. For taking simple snapshots we can use fswebcam (should be pre-installed, otherwise: `sudo apt-get install fswebcam`).

## Taking a picture on RPi

On the terminal:

- `fswebcam --no-banner image.jpg`
- Resolution can passed as an argument: `fswebcam -r 544x288 image.jpg`

In python:

- Look at the `image_recognition.py` script.


## APIs

Simple to use APIs where you can send an image and get a list of recognised objects.

### CloudSight

- 500 free image requests
- Credit card is needed for a trial subscription
- Offer libs in: Ruby, Swift, Go, Python

### Clarifai

- 5'000 free image requests

### IBM Watson

### Amazon Rekognition

### Microsoft CV

### Google Cloud Vision

- Billing depending on how much you use the service. No free plans found.
