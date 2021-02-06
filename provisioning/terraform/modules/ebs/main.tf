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
