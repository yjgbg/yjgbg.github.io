//> using toolkit default

println("hello world!")
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