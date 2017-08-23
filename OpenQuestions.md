# IT Infrastructure Questions

- Is Intra-BSS-Traffic enabled in the provided WLAN?
  - Intra-BSS-Traffic means that the devices in the WLAN can communicate with each other
  - Zuehlke IoT SmartHome case requires Intra-BSS-Traffic
  - If Intra-BSS-Traffic is not possible we cannot use the following devices
    - MyStrom Switch
    - MyStrom Button
    - iPad cannot interact with Raspberry Pi
- Are reverse ARP requests possible in the WLAN?
  - Zuehlke IoT SmartHome needs to know the IPs of their devices
  - Therefore we would need to seek for the MAC addresses of this devices
  - If this is not possible, Zuehlke has to realize another solution to find out the IPs of the devices
  - Independent from this, Intra-BSS-Traffic is a must be available!
- How many devices are allowed for each developer group?
  - Zuhelke SmartHome groups need up to 5-10 devices
  - Devices: Raspberry, MyStrom Switch, MyStrom Button, iPad
  - Plus one notebook per developer