package japgolly.nyaya.test

import scalaz.{-\/, \/, \/-}

final case class GenSize(value: Int) {
  def map(f: Int => Int) = GenSize(f(value))
}
final case class SampleSize(value: Int)  {
  def map(f: Int => Int) = SampleSize(f(value))
}

case class Settings(
  executor   : Executor          = SingleThreadedExecutor,
  sizeDist   : Settings.SizeDist = Seq(1 → \/-(GenSize(4)), 1 → -\/(0.2), 8 → -\/(0.8)),
  sampleSize : SampleSize        = SampleSize(100),
  genSize    : GenSize           = GenSize(40),
  seed       : Option[Long]      = None,
  debug      : Boolean           = false,
  debugMaxLen: Int               = 200) {

  lazy val sampleSizeLen = sampleSize.value.toString.length
  lazy val sampleProgressFmt = s"[%${sampleSizeLen}d/${sampleSize.value}] "

  // Convenience
  def setSingleThreaded     : Settings = copy(executor    = SingleThreadedExecutor)
  def setSampleSize(i: Int) : Settings = copy(sampleSize  = SampleSize(i))
  def setGenSize(i: Int)    : Settings = copy(genSize     = GenSize(i))
  def setSeed(s: Long)      : Settings = copy(seed        = Some(s))
  def setDebug              : Settings = copy(debug       = true)
  def setDebugMaxLen(i: Int): Settings = copy(debugMaxLen = i)
}

object Settings {
  type SizeDist = Seq[(Int, Double \/ GenSize)]
}