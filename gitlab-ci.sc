//> using toolkit default
import java.nio.file.Files
import java.nio.file.Paths
val x = Files.readAllLines(Paths.get(sys.env("TRIGGER_PAYLOAD")))
println("hello world!")
println(x)
// os.write(os.pwd / "gitlab-ci.sc.yml", """
// hello-world:
//   image: docker.io/alpine:latest
//   needs:
//     - pipeline: $PARENT_PIPELINE_ID
//       job: init-jobs
//   script:
//     - echo "hello world"
//     - cat github-event.json
// """)
os.write(os.pwd / "github-ci.sc.yml","stage: []")

// gitlabCi:
  
//   job("",image = ""):
//     image("")
//     script("")
//     script("")
//   job(""):
//     script("")