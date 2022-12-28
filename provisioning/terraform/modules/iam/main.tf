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

resource "aws_iam_role" "ec_role" {
  name = "ec_role"
  assume_role_policy = data.aws_iam_policy.AmazonEKSClusterPolicy.policy
}

data "aws_iam_policy" "AmazonEKSClusterPolicy"{
  arn= "arn:aws:iam::aws:policy/AmazonEKSServicePolicy"
}