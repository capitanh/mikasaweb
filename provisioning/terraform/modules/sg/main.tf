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