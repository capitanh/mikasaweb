class openldap {

  #Enable silent install
  file{'ldapInstaller':
    source => 'puppet:///modules/openldap/ldapInstaller.sh',
    path => '/tmp/ldapInstaller.sh',
    mode => '777'
  }
  exec{'execInstaller':
    command => '/tmp/ldapInstaller.sh',
    require => File['ldapInstaller']
  }

  # Install openldap
  package {'slapd':
    ensure => installed,
    require => Exec['execInstaller']
  }
  package {'ldap-utils':
    ensure => installed,
    require => Package['slapd']
  }

  #Create ddbb directory
  file{'/var/lib/ldap/golili':
    ensure => directory,
    require => Package['ldap-utils']
  }
  
  #Copy frontend ldif file to remote tmp dir
  file{'/tmp/frontend.ldif':
    source => 'puppet:///modules/openldap/frontend.ldif',
    require => File['/var/lib/ldap/golili']
  }
  
  #Load frontend
  exec{'frontend':
    command => '/usr/bin/ldapadd -x -D cn=admin,dc=golili,dc=net -w secret -f /tmp/frontend.ldif',
    require => File['/tmp/frontend.ldif']
  }
}