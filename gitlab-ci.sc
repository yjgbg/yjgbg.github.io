//> using toolkit default


println("hello world!")
os.write(pwd / "gitlab-ci.sc.yml", """
hello-world:
  image: docker.io/alpine:latest
  script:
    - echo "hello world"
    - cat "$TRIGGER_PAYLOAD"
""")