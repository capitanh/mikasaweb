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

<<<<<<< HEAD
include mongodb
#include openldap
=======
openldap::server::database { 'dc=mikasaweb,dc=golili,dc=net':
  ensure => present,
}
>>>>>>> db59d3bddb55c75b4c0f106a08e6d274766ed7f3

contain openldap::server
