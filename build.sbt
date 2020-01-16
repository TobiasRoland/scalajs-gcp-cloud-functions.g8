enablePlugins(ScriptedPlugin)

name := "scalajs-gcp-cloud-functions"
version := "1.0"

addCommandAlias("test", "g8Test")

scriptedLaunchOpts ++= List(
  "-Xms1024m", 
  "-Xmx1024m", 
  "-XX:ReservedCodeCacheSize=128m", 
  "-Xss2m", 
  "-Dfile.encoding=UTF-8"
)

resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)