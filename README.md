El proyecto consta de 4 microservicios, para iniciarlo deberas clonar el proyecto y depsues hacer estos pasos:

En cada microservicio, necesitarás configurar la conexión a la base de datos en el archivo application.properties o application.yml.
Aquí hay un ejemplo de cómo podría ser la configuración en un archivo application.properties para MySQL, esto se ejcuta en el puerto 8080, sin embargo se puede cambiar,
en este caso se utiliza mySQL y la bd esta en phpmyadmin: 

# Configuración de la base de datos MySQL
spring.datasource.url=jdbc:mysql://localhost:8080/restaurante_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

Verificar el estado de los microservicios: Una vez que cada microservicio esté en funcionamiento, puedes verificar su estado accediendo a la URL proporcionada en la 
consola de salida o a la dirección http://localhost:puerto (donde puerto es el puerto en el que se está ejecutando cada microservicio).
