import sbt._
import Keys._

object CustomPrompt extends Plugin {
  object devnull extends ProcessLogger {
    def info (s: => String) {}
    def error (s: => String) {}
    def buffer[T] (f: => T): T = f
  }

  def currentBranch = (
    ("git symbolic-ref HEAD" lines_! devnull headOption) getOrElse "-" stripPrefix "refs/heads/"
  )

  override def globalSettings = Seq(
    shellPrompt := { state =>
      val currentProject = Project.extract(state).currentProject.id
      "%s (%s)> ".format(currentProject, currentBranch)
    }
  )
}
