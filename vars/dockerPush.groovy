def call(String dockerHubUser, String projectname , String tag){
  sh """ docker push dockerHubUser/projectname:tag"""
}
