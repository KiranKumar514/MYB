node {
	stage ('SCM checkout'){
		git "https://github.com/KiranKumar514/MYB.git"
		}
	stage ('Build'){
    	dir("MBTEST") {
	   sh "mvn clean install"
       }
       	dir("MBTEST/target") {
	   sh "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		}
}