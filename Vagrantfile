# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.network "forwarded_port", guest: 3306, host: 13306
  config.vm.provider "virtualbox" do |vb|
    vb.name = "mikasaweb"
    vb.memory = "4096"
    vb.cpus = 2
  end
  config.vm.provision "ansible" do |ansible|
    ansible.playbook = "provisioning/ansible/playbook.yml"
  end    
end
