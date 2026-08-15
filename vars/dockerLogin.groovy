def call( String dockerHubUser, String dockerPassword ){

  sh """ echo '${dockerPassword}' | docker login -u '${dockerHubUser}' --password-stdin """
  
}
