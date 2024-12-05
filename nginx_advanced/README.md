# Home Assistant Add-on: NGINX Advanced

Just like [NGINX Proxy](https://github.com/home-assistant/addons/blob/master/nginx_proxy/README.md), but with more power!

![](../pictures/more-power.png)

The gist is this: [NGINX Proxy](https://github.com/home-assistant/addons/blob/master/nginx_proxy/README.md) comes with a lot of defaults and might not fit your usecase. It is really handy for creating simple setups, but limitations are met rather quickly.

NGINX Advanced's configuration however is based on a single `include /share/nginx_advanced.conf;` directive, which allows you to customize the whole nginx server configuration to your liking.

For usage guide, check [DOCS.md](./DOCS.md).

![Supports aarch64 Architecture][aarch64-shield] ![Supports amd64 Architecture][amd64-shield] ![Supports armhf Architecture][armhf-shield] ![Supports armv7 Architecture][armv7-shield] ![Supports i386 Architecture][i386-shield]

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[i386-shield]: https://img.shields.io/badge/i386-yes-green.svg
