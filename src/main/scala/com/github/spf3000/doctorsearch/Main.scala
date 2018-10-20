package com.github.spf3000.doctorsearch

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    DoctorsearchServer.stream[IO].compile.drain.as(ExitCode.Success)
}