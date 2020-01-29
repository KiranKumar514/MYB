node('master') {
    stage('SCM Checkout') {
        https://github.com/KiranKumar514/MYB.git
    }
    
    stage('Run tests') {
      withMaven(maven: 'MAVEN_HOME') {
          dir('MBTEST') {
            sh 'mvn clean test -Dwebdriver.type=chrome -Dwebdriver.chrome.driver=C:Users/kiran.kumar/Selenium/Drivers/chromedriver.exe'
          }
      }
    }
}
