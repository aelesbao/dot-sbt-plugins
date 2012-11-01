resolvers ++= Seq(
  "Jawsy.fi releases" at "http://oss.jawsy.fi/maven2/releases",
  "jgit-repo" at "http://download.eclipse.org/jgit/maven"
)

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")

addSbtPlugin("com.typesafe.sbtscalariform" % "sbtscalariform" % "0.4.0")

addSbtPlugin("fi.jawsy.sbtplugins" %% "sbt-jrebel-plugin" % "0.9.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.5.0")
