## 0.5.7 ([commit log](https://github.com/japgolly/nyaya/compare/v0.5.3...v0.5.7))

* Bugfix for `Multimap[?, Vector, ?]`

* Changed signature of `Prop.forall`.

* Added to `class Gen`:
  * `strengthL`
  * `strengthR`
  * `mapByEachKey`
  * `mapByKeySubset`

* Added to `object Gen`:
  * `oneofGL`
  * `traverse`
  * `traverseG`

* Added to `object GenS`:
  * `apply(GenSize => Gen[A])`
  * `choosesize`

* Added `Platform.choose(jvm,js)` and helper `jvm 'JVM|JS' js`
  to choose a value depending on which platform the code is running.

* Removed `Gen.oneofGC`. Import `Gen.Covariance._` and use `Gen.oneofG` instead.

## 0.5.3 ([commit log](https://github.com/japgolly/nyaya/compare/v0.5.2...v0.5.3))

* Fix μTest being exported from core module.

## 0.5.2 ([commit log](https://github.com/japgolly/nyaya/compare/v0.5.1...v0.5.2))

* Build for Scala.JS 0.6.0.
* Scala 2.11.{4 ⇒ 5}

## 0.5.1 ([commit log](https://github.com/japgolly/nyaya/compare/v0.5.0...v0.5.1))

* New generators:
  * `oneofSeq`
  * `subset`


# 0.5.0

First public release.