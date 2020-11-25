terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 2.70"
    }
  }
}

provider "aws" {
  profile = "default"
  region  = "eu-central-1"
}

#####################################################################
## Security groups
resource "aws_security_group" "allow_ssh" {
  name        = "allow_ssh"
  description = "Allow ssh connections"

  ingress {
    description = "Standard SSH port"
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_security_group" "allow_8080" {
  name        = "allow_8080"
  description = "Allow http 8080 connections"

  ingress {
    description = "http 8080 port"
    from_port   = 8080
    to_port     = 8080
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_security_group" "allow_mongodb" {
  name        = "allow_mongodb"
  description = "Allow mongodb connections"

  ingress {
    description = "Standard MongoDB port"
    from_port   = 27017
    to_port     = 27017
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_security_group" "allow_openldap" {
  name        = "allow_openldap"
  description = "Allow openldap connections"

  ingress {
    description = "Standard openldap port"
    from_port   = 389
    to_port     = 389
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

######################################################################
## Load Balancer
#
######################################################################
## EC2 Instances
resource "aws_instance" "mikasaweb" {
  ami             = var.ubuntu20ami
  instance_type   = "t2.micro"
  key_name        = "frankfurt-capitanh-aws"
  security_groups = ["default", "allow_ssh", "allow_8080"]
  #count           = 2
  tags = {
    #Name  = "Spring boot Server ${count.index}"
    Name  = "Spring boot Server"
    Group = "appservers"
  }
}

resource "aws_instance" "mongodb" {
  ami             = var.ubuntu20ami
  instance_type   = "t2.micro"
  key_name        = "frankfurt-capitanh-aws"
  security_groups = ["default", "allow_ssh", "allow_mongodb"]
  tags = {
    Name  = "MongoDB Server"
    Group = "mongodb_servers"
  }
}

resource "aws_instance" "openldap" {
  ami             = "ami-0502e817a62226e03"
  instance_type   = "t2.micro"
  key_name        = "frankfurt-capitanh-aws"
  security_groups = ["default", "allow_ssh", "allow_openldap"]
  tags = {
    Name  = "OpenLDAP Server"
    Group = "openldap_servers"
  }
}

######################################################################
# Elastic Beanstalk Applications
#resource "aws_s3_bucket" "mikasaweb_default_bucket" {
#  bucket   = "capitanh-mikasaweb-bucket"
#  region   = "eu-central-1"
#}
#
#resource "aws_s3_bucket_object" "default_source" {
#  bucket = aws_s3_bucket.mikasaweb_default_bucket.id
#  key    = "mikasaweb_jar"
#  source = "/home/luis/dev/projects/personal/mikasaweb/build/libs/mikasaweb-5.1.0.jar"
#}
#
#resource "aws_elastic_beanstalk_application" "mikasaweb_app" {
#  name        = "mikasaweb"
#  description = "Mikasaweb Test Application"
#}
#
#resource "aws_elastic_beanstalk_application_version" "app_version" {
#  name        = "5.1.0"
#  application = "mikasaweb"
#  description = "application version created by terraform"
#  bucket      = aws_s3_bucket.mikasaweb_default_bucket.id
#  key         = aws_s3_bucket_object.default_source.id
#}
#
#resource "aws_elastic_beanstalk_environment" "mikasaweb" {
#  name                = "development"
#  application         = aws_elastic_beanstalk_application.mikasaweb_app.name
#  solution_stack_name = "64bit Amazon Linux 2018.03 v2.11.1 running Java 8"
#}
