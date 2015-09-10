package demo
package components
package materialui

import chandu0101.scalajs.react.components.materialui.{MuiCircularProgress, MuiLinearProgress, MuiProgressMode}
import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._

object MuiProgressDemo {

  val code =
    """
      | MuiCircularProgress(mode = MuiProgressMode.DETERMINATE ,value = 50),
      | MuiCircularProgress(mode = MuiProgressMode.INDETERMINATE),
      | MuiCircularProgress(mode = MuiProgressMode.INDETERMINATE,size = 2),
      | MuiLinearProgress(mode = MuiProgressMode.INDETERMINATE ,size = 1.5)
      |
    """.stripMargin
  val component = ReactComponentB[Unit]("MuiProgressDemo")
    .render(P => {
    <.div(
      CodeExample(code, "Progress Bars")(
        MuiCircularProgress(mode = MuiProgressMode.DETERMINATE ,value = 50)(),
        MuiCircularProgress(mode = MuiProgressMode.INDETERMINATE)(),
        MuiCircularProgress(mode = MuiProgressMode.INDETERMINATE,size = 2)(),
        MuiLinearProgress(mode = MuiProgressMode.INDETERMINATE ,size = 1.5)()
      )
    )
  }).buildU

  def apply() = component()

}
