def call(string dockerHubUser, String projectname , String tag){
  sh """ docker push dockerHubUser/projectname:tag"""
}
