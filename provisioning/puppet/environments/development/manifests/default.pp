# execute 'apt-get update'
#exec { 'apt-update':
#  command => '/usr/bin/apt-get update'
#}
#
#package { "openldap":
#    ensure => present,
#    require => Exec["apt-get update"]
#}


class { 'openldap::server': 
}

openldap::server::database { 'dc=mikasaweb,dc=golili,dc=net':
  ensure => present,
}

