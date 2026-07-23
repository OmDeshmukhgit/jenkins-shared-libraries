def call() {
    sh '''
    whoami
    echo "KUBECONFIG=$KUBECONFIG"
    pwd
    kubectl config current-context
    kubectl config view
    kubectl cluster-info
    kubectl get nodes
    '''
}
