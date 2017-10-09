def gradle(command) {
	sh "${tool name: 'Gradle 4.2', type: 'hudson.plugins.gradle.GradleInstallation'}/usr/lib/gradle-4.2/bin/gradle ${command}"
}

pipeline{
	agent any

	stages{
	  stage ('Clean'){
		  steps{
		  	gradle 'clean'
			}
		}
	}
}
