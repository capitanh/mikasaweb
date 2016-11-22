# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.configure(2) do |config|
  #config.vm.box = "ubuntu/trusty64"
  config.vm.box = "ubuntu/xenial64"
  config.vm.hostname = "mikasaweb.golili.net"
  config.vm.network "forwarded_port", guest: 3306, host: 13306
  config.vm.provider "virtualbox" do |vb|
    vb.name = "mikasaweb"
    vb.memory = "4096"
    vb.cpus = 2
  end
  #config.ssh.private_key_path = "~/.ssh/id_rsa"
  #config.ssh.forward_agent = true
  config.vm.provision "shell",
    inline: "sudo apt -y install python"
  config.vm.provision "ansible" do |ansible|
    ansible.playbook = "provisioning/ansible/playbook.yml"
  end
end
