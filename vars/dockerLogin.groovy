def call( String dockerHubUser, String dockerHubPassword ){

  sh ' echo '${dockerPassword}' | docker login -u '${dockerHubUser}' -p '${dockerHubPassword} '
  
  ]
