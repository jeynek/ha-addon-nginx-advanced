# Home Assistant Add-on: NGINX Advanced

> Repository for the NGINX Advanced [Home Assistant](https://www.home-assistant.io) Addon

Just like [NGINX Proxy](https://github.com/home-assistant/addons/blob/master/nginx_proxy/README.md), but with more power!

![](pictures/more-power.png)

[NGINX Proxy](https://github.com/home-assistant/addons/blob/master/nginx_proxy/README.md) comes with a lot of defaults and might not fit your usecase. It is really handy for creating simple setups, but limitations are met rather quickly.

NGINX Advanced's configuration is based on a single `include /share/nginx_advanced.conf;` directive, which allows you to customize the whole nginx server configuration to your liking.

Documentation about Add-ons: <https://developers.home-assistant.io/docs/add-ons>

[![Open your Home Assistant instance and show the add add-on repository dialog with a specific repository URL pre-filled.](https://my.home-assistant.io/badges/supervisor_add_addon_repository.svg)](https://my.home-assistant.io/redirect/supervisor_add_addon_repository/?repository_url=https%3A%2F%2Fgithub.com%2Fjanmagnusdev%2Fha-addon-nginx-advanced)

## Add-ons

This repository contains the following add-ons

### [NGINX Advanced](./nginx_advanced)

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]
![Supports armhf Architecture][armhf-shield]
![Supports armv7 Architecture][armv7-shield]
![Supports i386 Architecture][i386-shield]

_Repository created with [HA Addon Repository Template](https://github.com/home-assistant/addons-example)_

<!--

Notes to developers after forking or using the github template feature:
- While developing comment out the 'image' key from 'example/config.yaml' to make the supervisor build the add-on
  - Remember to put this back when pushing up your changes.
- When you merge to the 'main' branch of your repository a new build will be triggered.
  - Make sure you adjust the 'version' key in 'example/config.yaml' when you do that.
  - Make sure you update 'example/CHANGELOG.md' when you do that.
  - The first time this runs you might need to adjust the image configuration on github container registry to make it public
  - You may also need to adjust the github Actions configuration (Settings > Actions > General > Workflow > Read & Write)
- Adjust the 'image' key in 'example/config.yaml' so it points to your username instead of 'home-assistant'.
  - This is where the build images will be published to.
- Rename the example directory.
  - The 'slug' key in 'example/config.yaml' should match the directory name.
- Adjust all keys/url's that points to 'home-assistant' to now point to your user/fork.
- Share your repository on the forums https://community.home-assistant.io/c/projects/9
- Do awesome stuff!
 -->

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[i386-shield]: https://img.shields.io/badge/i386-yes-green.svg
