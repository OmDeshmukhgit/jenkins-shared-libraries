def call() {

    sh '''
        envsubst < k8s/deployment.yaml | kubectl apply -f -
        kubectl apply -f k8s/service.yaml
    '''
}
