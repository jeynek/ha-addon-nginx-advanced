# Home Assistant Add-on: NGINX Advanced

Sets up an NGINX Server, mostly to be used as a reverse proxy.

Usage:

1. Start addon. Navigate to \<HA IP\>:443 to test if it works. Check Logs if it does not.
2. Connect to your Home Assistant and edit `/shared/<config_file>`.
3. Restart Addon.
4. Rinse and repeat!

![Supports aarch64 Architecture][aarch64-shield] ![Supports amd64 Architecture][amd64-shield] ![Supports armhf Architecture][armhf-shield] ![Supports armv7 Architecture][armv7-shield] ![Supports i386 Architecture][i386-shield]

## About

Sets up an advanced NGINX web server. It is typically used to forward SSL internet traffic while allowing unencrypted local traffic to/from a Home Assistant instance.

Make sure you know what you are doing before you start using this addon!

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[i386-shield]: https://img.shields.io/badge/i386-yes-green.svg
