# IT Infrastructure Questions

- Is Intra-BSS-Traffic enabled in the provided WLAN?
  - Intra-BSS-Traffic means that the devices in the WLAN can communicate with each other
  - Zuehlke IoT SmartHome case requires Intra-BSS-Traffic
  - If Intra-BSS-Traffic is not possible we cannot use the following devices
    - MyStrom Switch
    - MyStrom Button
    - iPad cannot interact with Raspberry Pi
- Is it possible to get the IP address of a device when the MAC address is known?
  - We know the MAC address of our devices and need the IP
- How many devices (IPs) are allowed for each developer group?
  - Zuhelke SmartHome groups need up to 5-10 devices
  - Devices: Raspberry, MyStrom Switch, MyStrom Button, iPad
  - Plus one notebook per developer