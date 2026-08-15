def call(String dockerHubUser, String imageName , String tag){
  def image = "${dockerHubUser}/${imageName}:${tag}"

    echo "Pushing Docker image: ${image}"

    sh """
        docker push ${image}
    """
}
