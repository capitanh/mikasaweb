# -*- mode: ruby -*-
# vi: set ft=ruby :

require 'yaml'
settings = YAML.load_file('provisioning/config.yaml')
ENV["DEBIAN_FRONTEND"] = 'noninteractive'
ENV["LC_ALL"] = settings['locale_lc_all']
ENV["LANG"] = settings['locale_lang']
ports = settings['ports']

Vagrant.configure(2) do |config|
  config.vm.box = settings['box_name']
<<<<<<< HEAD
  ports.each do |forwarded_port|
    config.vm.network "forwarded_port", guest: forwarded_port['guestPort'], host: forwarded_port['hostPort']
  end
=======
  config.vm.network "forwarded_port", guest: 3306, host: 13306
  config.vm.network "forwarded_port", guest: 27017, host: 27017
>>>>>>> 1041088381459d4ad33915e5634b1e1b973a9610
  config.vm.provider "virtualbox" do |vb|
    vb.name = settings['vb_name']
    vb.memory = settings['vb_memory']
    vb.cpus = settings['vb_cpus']
    vb.customize ["modifyvm", :id, "--cableconnected1", "on"]
    vb.gui = false
  end
  config.vm.hostname = settings['host_name']
  #Needed to avoid 'Inappropriate ioctl for device' error message
  config.ssh.shell = "bash -c 'BASH_ENV=/etc/profile exec bash'"

  provision = settings['provisioning']
  if (provision == 'ansible')
    config.vm.provision "ansible" do |ansible|
      ansible.playbook = "provisioning/ansible/playbook.yml"
    end
  end

  if (provision == 'puppet')
    config.vm.provision "shell", path: "provisioning/puppet/bootstrap.sh"
    config.vm.provision "puppet" do |puppet|
      puppet.options = "--verbose"
      #puppet.options = "--debug"
      puppet.environment_path = "provisioning/puppet/environments"
      puppet.environment = "production"
    end
  end
end
