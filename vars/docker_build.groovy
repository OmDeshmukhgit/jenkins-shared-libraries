def call(String ImgName, String TagName, String DOCKER_USER){
 sh "docker build --no-cache -t ${DOCKER_USER}/${ImgName}:${TagName} ."
}
