//> using toolkit default
//> using repository https://maven.pkg.github.com/yjgbg/kepler
//> using dep com.yjgbg::lib-kepler:1.0.9
import kepler.GitlabCi.{*,given}
GitlabCi:
    if (payload.path("$.action") == "closed"|| payload.path("pull")) job("printRef"):
        image := "docker.io/alpine:latest"
        script += s"echo '${payload.path[String]("$.head.ref")}'"
