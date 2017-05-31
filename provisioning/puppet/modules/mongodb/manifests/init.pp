class mongodb {
	# Install MongoDB
	package {'mongodb':
	  ensure => installed,
    require => Exec['apt-update']
	}

	#Copy config file
	file { '/etc/mongodb.conf' :
	  replace => true,
	  owner => 'root',
	  group => 'root',
	  mode => 644,
	  source => 'puppet:///modules/mongodb/mongodb.conf',
	  require => Package ['mongodb']
	}

	# Ensure mongo service is running
	service { 'mongodb':
	  ensure => running,
	  restart => true,
	  require => File ['/etc/mongodb.conf']
	}

	# Load regions
	file { '/tmp/regions.js':
		source => 'puppet:///modules/mongodb/regions.js',
		require => Service['mongodb']
	}
	exec {'execRegions':
    command => '/usr/bin/mongoimport --db sbtest --collection region --file /tmp/regions.js',
    require => File['/tmp/regions.js']
	}

  # Load provinces
	file { '/tmp/provinces.js':
		source => 'puppet:///modules/mongodb/provinces.js',
		require => Service['mongodb']
	}	
	exec {'execProvinces':
    command => '/usr/bin/mongoimport --db sbtest --collection province --file /tmp/provinces.js',
    require => File['/tmp/provinces.js']
	}	
	
	# Load cities
	file { '/tmp/cities.js':
		source => 'puppet:///modules/mongodb/cities.js',
		require => Service['mongodb']
	}
	exec {'execCities':
    command => '/usr/bin/mongoimport --db sbtest --collection city --file /tmp/cities.js',
    require => File['/tmp/cities.js']
	}		
}