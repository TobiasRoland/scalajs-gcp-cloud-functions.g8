import org.scalajs.core.tools.linker.backend.ModuleKind.CommonJSModule
scalaJSModuleKind := CommonJSModule 
scalaJSUseMainModuleInitializer := false
enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "io.scalajs.npm" %%% "express" % "0.4.2"
)
name := """$name$"""
scalaVersion := "2.12.10"


