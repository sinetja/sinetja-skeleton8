Skeleton for creating your new Java 8 project based on
`Sinetja <https://github.com/sinetja/sinetja>`_.

See also:

* `Sinetja-Skeleton <https://github.com/sinetja/sinetja-skeleton>`_:
  If you want to use older Java (without Java 8 lambda syntax).
* `Sinetja-Scaleton <https://github.com/sinetja/sinetja-scaleton>`_:
  If you want to use Scala.

Run in development mode
~~~~~~~~~~~~~~~~~~~~~~~

::

  sbt/sbt run

Create project
~~~~~~~~~~~~~~

To create Eclipse project:

::

  sbt/sbt eclipse

To create IntelliJ project:

::

  sbt/sbt gen-idea

You then can run the project inside Eclipse or IntelliJ.

Distribute
~~~~~~~~~~

To package for distribution:

::

  sbt/sbt xitrum-package

Directory ``target/xitrum`` will be created.

To run:

::

  cd target/xitrum
  script/start

It will run ``main`` method in class ``skeleton.App``.
Please modify the start script if you want to run other.
