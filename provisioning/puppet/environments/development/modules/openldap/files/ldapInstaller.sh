#!/bin/bash
export DEBIAN_FRONTEND=noninteractive
echo -e " \
slapd slapd/internal/generated_adminpw password secret
slapd slapd/password2 password secret
slapd slapd/internal/adminpw password secret
slapd slapd/password1 password secret
" | debconf-set-selections

