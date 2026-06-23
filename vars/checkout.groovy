def checkout(String url, String branch){
    git branch: "${branch}",
       url: "${url}"
}
