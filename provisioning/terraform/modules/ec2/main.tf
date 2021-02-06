######################################################################
## EC2 Instances
resource "aws_instance" "mikasaweb" {
  count           = 2
  ami             = var.ubuntu20ami
  instance_type   = "t2.micro"
  key_name        = "frankfurt-capitanh-aws"
  security_groups = ["default", "allow_ssh", "allow_8080"]
  
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

