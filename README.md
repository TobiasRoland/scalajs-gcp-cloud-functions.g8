# Scala.js GCP Cloud Functions starter template

This [Giter8][g8] template is for getting up and running with Google Cloud Functions (GCP Cloud Functions)
using a minimal setup with scalaJS.

Open a console and run the following command to apply this template:

```sbt
sbt new TobiasRoland/scalajs-gcp-cloud-functions.g8
```

This template will prompt for the **name** of the project, **description**, **package** and **cloudFunctionName**. If you are happy with the defaults or unsure what to do - press `ENTER` to confirm default options.

Once inside the newly created project folder, compile the function to javascript and deploy the resulting code to Google Cloud Functions.

```sbt
sbt fullOptJS
```

See README.md of the newly created project for detailed steps.


## Template license

Written in 2020 by Tobias Roland.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[sbt]: http://www.scala-sbt.org/
[sbt_download]: http://www.scala-sbt.org/download.html
