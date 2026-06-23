def call(String ImgName, String TagName, String DOCKER_USER) {
    withCredentials([usernamePassword(credentialsId: 'dockerhubCred',
                                      usernameVariable: 'DOCKER_USER',
                                      passwordVariable: 'DOCKER_PAT')]) {
        sh "echo $DOCKER_PAT | docker login -u $DOCKER_USER --password-stdin"
        sh "docker push $DOCKER_USER/${ImgName}:${TagName}"
    }
}
