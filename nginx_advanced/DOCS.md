# Home Assistant Add-on: NGINX Advanced

## Installation

Follow these steps to get the add-on installed on your system:

1. Navigate in your Home Assistant frontend to **Settings** -> **Add-ons** -> **Add-on store**.
2. Add this repository to your Home Assistant Add-on Store: https://github.com/janmagnusdev/ha-addon-nginx-advanced/
3. Find the "NGINX Advanced" add-on and click it.
4. Click on the "INSTALL" button.

## How to use

This add-on is based on the [NGINX Proxy](https://github.com/home-assistant/addons/blob/master/nginx_proxy/README.md) add-on, which is commonly used in conjunction with the [Duck DNS](https://github.com/home-assistant/addons/tree/master/duckdns) and/or the [Let's Encrypt](https://github.com/home-assistant/addons/tree/master/letsencrypt) add-on to set up secure remote access to your Home Assistant instance.

1. Install the add-on, start it and test if it works out of the box by navigating to \<HA IP>\:443. Obviously, you might need to setup port forwarding on your router and whatnot.
2. The certificate to your registered domain should already be created via [Duck DNS](https://github.com/home-assistant/addons/tree/master/duckdns), [Let's Encrypt](https://github.com/home-assistant/addons/tree/master/letsencrypt) or another method. Make sure that the certificate files exist in the `/ssl` directory. You must later reference it manually in `/share/nginx_advanced.conf`, if you wish to use this add-on for SSL reverse proxying.
3. You must add the following section to your [Home Assistant configuration.yaml](https://www.home-assistant.io/docs/configuration/). If the `http` section is using the `ssl_certificate`, `ssl_key` or `server_port` keys, make sure to remove them.

   ```yaml
   http:
     use_x_forwarded_for: true
     trusted_proxies:
       - 172.30.33.0/24
   ```

4. Adapt `/share/nginx_advanced.conf` to your likings. Include any necessary SSL config here.
5. Save the file.
6. **DISABLE** `use_default` in the Configuration tab. Otherwise, your own config might clash with it.
7. Restart the add-on.
8. Have some patience and wait a couple of minutes.
9. Check the add-on log output to see the result.
10. Test for your desired nginx results.

## Adapting the NGINX Configuration

A good starting point is to copy your current `nginx.conf` from [NGINX Proxy](https://github.com/home-assistant/addons/blob/master/nginx_proxy/README.md) to `/share/nginx_advanced.conf`. You can retrieve it by:

1. Connecting to your HA instance via SSH.
2. Executing `docker exec -it $(docker ps --filter "name=nginx_proxy" --format '{{.ID}}') nginx -T -c /etc/nginx.conf`

## Configuration of the Add-on

Add-on configuration:

```yaml
config_file: nginx_advanced.conf
use_default: true
```

### Option: `config_file` (required)

The server's fully qualified domain name to use for the proxy.

### Option: `use_default` (required)

The certificate file to use in the `/ssl` directory. Keep filename as-is if you used default settings to create the certificate with the [Duck DNS](https://github.com/home-assistant/addons/tree/master/duckdns) add-on.

## Troubleshooting

- `400 Bad Request` response for requests over this proxy mean you are probably missing the `trusted_proxies` configuration option, see above.

## Support

In case you've found a bug or have questions, please [open an issue on my GitHub][issue].

[hsts]: https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security
[issue]: https://github.com/janmagnusdev/ha-addon-nginx-advanced/issues
[reddit]: https://reddit.com/r/homeassistant
[repository]: https://github.com/janmagnusdev/ha-addon-nginx-advanced/
