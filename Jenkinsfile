node{
	def gradle
	stage('Prepare'){
		gradle = tool 'Gradle 4.2'
	}
	stage('Clean'){
		step{
			gradle 'clean'
		}
	}
}