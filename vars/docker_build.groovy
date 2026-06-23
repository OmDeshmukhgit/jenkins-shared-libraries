def call(String ImgName, String TagName, String DOCKER_USER){
 "docker build -t ${DOCKER_USER}/${ImgName}:${TagName} ."
}
