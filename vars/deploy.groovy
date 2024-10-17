def call(String ApplicationName , String Ports, String ProjectName ){
sh "docker run --name ${ApplicationName} -p ${Ports} -d ${ProjectName} " 
}
