# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  # Base VM OS configuration.
  config.ssh.insert_key = false
  config.vm.synced_folder '.', '/vagrant', disabled: true

  # General VirtualBox VM configuration.
  config.vm.provider :virtualbox do |v|
    v.linked_clone = true
    v.customize ["modifyvm", :id, "--natdnshostresolver1", "on"]
    # v.customize ["modifyvm", :id, "--ioapic", "on"]
    v.customize ["modifyvm", :id, "--natdnsproxy1", "on"]
  end

  # Define the VM for Base Server
  config.vm.define "base" do |base|
    base.vm.hostname = "base-server"
    base.vm.box = "bento/ubuntu-22.04"
    base.vm.network :private_network, ip: "192.168.56.3"
    # base.vm.network "public_network", type: "dhcp"
    base.vm.provider "virtualbox" do |vb|
      vb.memory = 2048
      vb.cpus = 2
    end
    base.vm.provision "shell", inline: "sudo useradd -m -s /bin/bash -p $(openssl passwd -1 13032000) tunglv"
    base.vm.provision "shell", inline: "sudo usermod -aG sudo tunglv"
  end

  # Define the VM for Runner
  config.vm.define "runner" do |runner|
    runner.vm.hostname = "runner-server"
    runner.vm.box = "bento/ubuntu-20.04"
    runner.vm.network :private_network, ip: "192.168.56.4"
    # runner.vm.network "public_network", type: "dhcp"
    runner.vm.provider "virtualbox" do |vb|
      vb.memory = 8192
      vb.cpus = 2
    end
    runner.vm.provision "shell", inline: "sudo useradd -m -s /bin/bash -p $(openssl passwd -1 13032000) tunglv"
    runner.vm.provision "shell", inline: "sudo usermod -aG sudo tunglv"
  end

  # Define the VM example of local
  config.vm.define "local" do |local|
    local.vm.hostname = "local-server"
    local.vm.box = "bento/ubuntu-20.04"
    local.vm.network :private_network, ip: "192.168.56.5"
    # local.vm.network "public_network", type: "dhcp"
    local.vm.provider "virtualbox" do |vb|
      vb.memory = 512
      vb.cpus = 1
    end
    local.vm.provision "shell", inline: "sudo useradd -m -s /bin/bash -p $(openssl passwd -1 13032000) tunglv"
    local.vm.provision "shell", inline: "sudo usermod -aG sudo tunglv"
  end

  
  # # Apache.
  # config.vm.define "www1" do |www1|
  #   www1.vm.hostname = "www1.test"
  #   www1.vm.network :private_network, ip: "192.168.56.3"

  #   www1.vm.provision "shell",
  #     inline: "sudo yum update -y"

  #   www1.vm.provider :virtualbox do |v|
  #     v.customize ["modifyvm", :id, "--memory", 512]
  #   end
  # end

  # # Apache.
  # config.vm.define "www2" do |www2|
  #   www2.vm.hostname = "www2.test"
  #   www2.vm.network :private_network, ip: "192.168.56.4"

  #   www2.vm.provision "shell",
  #     inline: "sudo yum update -y"

  #   www2.vm.provider :virtualbox do |v|
  #     v.customize ["modifyvm", :id, "--memory", 512]
  #   end
  # end

  # # MySQL.
  # config.vm.define "db1" do |db1|
  #   db1.vm.hostname = "db1.test"
  #   db1.vm.network :private_network, ip: "192.168.56.5"
  # end

  # # MySQL.
  # config.vm.define "db2" do |db2|
  #   db2.vm.hostname = "db2.test"
  #   db2.vm.network :private_network, ip: "192.168.56.6"
  # end

  # # Memcached.
  # config.vm.define "memcached" do |memcached|
  #   memcached.vm.hostname = "memcached.test"
  #   memcached.vm.network :private_network, ip: "192.168.56.7"

  #   # Run Ansible provisioner once for all VMs at the end.
  #   memcached.vm.provision "ansible" do |ansible|
  #     ansible.playbook = "configure.yml"
  #     ansible.inventory_path = "inventories/vagrant/inventory"
  #     ansible.limit = "all"
  #     ansible.extra_vars = {
  #       ansible_user: 'vagrant',
  #       ansible_ssh_private_key_file: "~/.vagrant.d/insecure_private_key"
  #     }
  #   end
  # end
end
