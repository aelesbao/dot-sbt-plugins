import sbt._
import Keys._

import com.typesafe.sbteclipse.plugin.EclipsePlugin
import com.typesafe.sbteclipse.plugin.EclipsePlugin.EclipseKeys
import com.typesafe.sbteclipse.plugin.EclipsePlugin.EclipseCreateSrc

object EclipseConfig extends Plugin {
  // For default, export Eclipse project with resources path
  lazy val eclipseSettings = EclipsePlugin.settings ++ Seq(
    EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource,
    EclipseKeys.relativizeLibs := false,
    EclipseKeys.withSource := true
  )

  override def settings = Seq(eclipseSettings: _*)
}
