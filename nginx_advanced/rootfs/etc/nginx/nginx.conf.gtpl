{{/*
    Options saved in the addon UI are available in .options
    Some variables are available in .variables, these are added in nginx/run
*/}}

daemon off;
pid /var/run/nginx.pid;

include /share/{{ .options.config_file }};
