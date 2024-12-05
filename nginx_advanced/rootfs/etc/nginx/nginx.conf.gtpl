{{/*
    Options saved in the addon UI are available in .options
    Some variables are available in .variables, these are added in nginx/run
*/}}

daemon off;
pid /var/run/nginx.pid;

{{/*
    While use_default is active, the default configuration is included, which might clash with the user configuration.
    Therefore, it has to be disabled first.
*/}}
{{- if .options.use_default }}
include /etc/nginx/nginx_advanced_default.conf;
{{- end }}

{{/*
    The user config file is included from /share/.
*/}}
include /share/{{ .options.config_file }};