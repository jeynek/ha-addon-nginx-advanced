{{/*
    Options saved in the addon UI are available in .options
    Some variables are available in .variables, these are added in nginx/run
*/}}

daemon off;
pid /var/run/nginx.pid;

{{/*
    The config file is included from both /etc/nginx/ and /share/.
    The latter can only be changed by the user directly.
    Whether the former can be changed during runtime by the user remains open.
*/}}
include /etc/nginx/{{ .options.config_file }};
include /share/{{ .options.config_file }};