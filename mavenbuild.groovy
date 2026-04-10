def call () {
	stage('build') {
	sh 'mvn clean package'

	}
}