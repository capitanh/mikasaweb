#!/bin/bash

#export DEBIAN_FRONTEND=noninteractive
#export LANGUAGE=en_US.UTF-8
#export LC_ALL=en_US.UTF-8
#export LANG=en_US.UTF-8
#sudo locale-gen

release=`lsb_release -cs`

#wget https://apt.puppetlabs.com/puppetlabs-release-pc1-xenial.deb
wget https://apt.puppetlabs.com/puppetlabs-release-pc1-${release}.deb
sudo dpkg -i puppetlabs-release-pc1-${release}.deb
sudo apt-get update
sudo apt-get -y --allow-unauthenticated install puppet-agent
export PATH=/opt/puppetlabs/bin/:$PATH

puppet module install puppetlabs-apache
puppet module install puppetlabs-mongodb