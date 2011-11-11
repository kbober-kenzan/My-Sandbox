mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-core -Dversion=4.2.1 -Dpackaging=jar -Dfile=/lib/kettle-core.jar -DgeneratePom=true
mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-db -Dversion=4.2.1 -Dpackaging=jar -Dfile=/lib/kettle-db.jar  -DgeneratePom=true
mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-engine -Dversion=4.2.1 -Dpackaging=jar -Dfile=/lib/kettle-engine.jar  -DgeneratePom=true
mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-ui-swt -Dversion=4.2.1 -Dpackaging=jar -Dfile=/lib/kettle-ui-swt.jar -DgeneratePom=true
mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-dbdialog -Dversion=4.2.1 -Dpackaging=jar -Dfile=/lib/kettle-dbdialog.jar -DgeneratePom=true
mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-test -Dversion=4.2.1 -Dpackaging=jar -Dfile=/lib/kettle-test.jar -DgeneratePom=true
mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-ui-swt -Dversion=4.2.1 -Dpackaging=jar -Dfile=/lib/kettle-ui-swt.jar -DgeneratePom=true

mvn install:install-file -DgroupId=pentaho.kettle -DartifactId=kettle-vfs -Dversion=4.2.1 -Dpackaging=jar -Dfile=/libext/pentaho/kettle-vfs-20100924.jar -DgeneratePom=true
mvn install:install-file -DgroupId=pentaho -DartifactId=pentaho-libbase -Dversion=1.2.2 -Dpackaging=jar -Dfile=/libext/pentaho/libbase-1.2.2 -DgeneratePom=true

# Could not locate 4.2.1 library equivalent
mvn install:install-file -DgroupId=pentaho -DartifactId=pentaho-libformula -Dversion=1.1.7 -Dpackaging=jar -D/libext/pentaho/libformula-1.1.7.jar  -DgeneratePom=true


