        # datasource configuration
        spring.datasource.url=jdbc:mysql://localhost:3306/anasdatabase?createDatabaseIfNotExist=true
        spring.datasource.username=root
        spring.datasource.password=diro hna un mot de passe
        spring.datasource.driver-class-name=com.mysql.jdbc.Driver
        spring.jpa.hibernate.ddl-auto=create
        spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
        spring.jpa.show-sql=true


        # Hibernate Properties
        # The SQL dialect makes Hibernate generate better SQL for the chosen database
        # server port
        server.port=80
        server.servlet.context-path=/UserMsi master
        #For detailed logging during development
        logging.level.org.springframework=ERROR
        logging.level.com=ERROR
