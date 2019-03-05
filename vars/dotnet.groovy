def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    node {
        deleteDir()
        stage('checkout') {
            checkout scm
            sh "ls"
        }
        stage("Build") {
            config.projects.each {
                println it
            }
        }
    }

}