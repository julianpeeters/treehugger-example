import treehugger.forest._
import definitions._
import treehuggerDSL._

import scala.reflect.runtime._
import scala.tools.reflect.ToolBox


object sym {
  //val Expr = RootClass.newClass("Expr")
  val Var  = RootClass.newClass("Var")
}

object Main extends App {
 

val cm = universe.runtimeMirror(getClass.getClassLoader)

val tb = cm.mkToolBox()

val tree: Tree = (CASECLASSDEF(RootClass.newClass("MyRecord"))withParams(VAL("x", StringClass)): Tree)
println(tree)
println(treeToString(tree))

//tb.eval(tree) //give error:

/*
[error] /home/julianpeeters/treehugger-example/Main.scala:27: type mismatch;
[error]  found   : treehugger.forest.Tree
[error]  required: Main.tb.u.Tree
[error] tb.eval(tree)
*/



}
