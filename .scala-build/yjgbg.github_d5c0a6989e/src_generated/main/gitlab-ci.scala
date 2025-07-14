

final class gitlab$minusci$_ {
def args = gitlab$minusci_sc.args$
def scriptPath = """gitlab-ci.sc"""
/*<script>*/
//> using toolkit default


println("hello world!")
// val x = os.read(os.root / )
// os.write(pwd / ".gitlab-ci.yml", """
// hello-world:
//   image: docker.io/alpine:latest
//   script:
//     - echo "This job runs only if the CI_PIPELINE_TRIGGERED variable is set to true"
//     - cat "$TRIGGER_PAYLOAD"
// """)
/*</script>*/ /*<generated>*//*</generated>*/
}

object gitlab$minusci_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new gitlab$minusci$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export gitlab$minusci_sc.script as `gitlab-ci`

