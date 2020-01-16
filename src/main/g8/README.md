# $name$

$description$

## How to build

Execute:

```sbt
sbt fullOptJs
```

This will build an optimized `.js` file in the path `./target/scala-2.12>/<project-name>-opt.js.`

To make your life slightly easier, create a symlinked `index.js` in the root of the project:

```sbt
ln -s index.js ./target/scala-2.12>/<project-name>-opt.js
```

See [Google Cloud Platform - Deployig Functinos][gcp] for deploying your function.

---

_This project was initially generated from the [Scala.js GCP Cloud Function][template] giter8 template_

[gcp]: https://cloud.google.com/functions/docs/deploying
[template]: https://github.com/TobiasRoland/scalajs-g8
