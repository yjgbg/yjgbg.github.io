//> using toolkit default
//> using repository https://maven.pkg.github.com/yjgbg/kepler
//> using dep com.yjgbg::kepler:1.0.6
import com.github.yjgbg.kepler.dsl.GitlabCi.{*,given}
GitlabCi:
    job("hello-world"):
        image := "docker.io/alpine:latest"
        script += "echo 'hello world'"