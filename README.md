# Taller Persistencia
### analisis de diseño
1.  ¿En cuál de las entidades (Proyecto o Tarea) quedó la columna de la llave foránea (project_id) en la base de datos? Explica por qué esto es necesario.
En la entidad de tarea, esto porque la relacion entre proyecto y tarea, la tarea es la que tiene el many(varias tareas a un solo proyecto). Para relacionarse la llave debe tener la llave foranea del proyecto.

2.  Describe qué configuración específica utilizaste para que al borrar un Proyecto desaparezcan sus Tareas. ¿Cuál es la diferencia conceptual entre borrar la tarea de la lista del proyecto vs borrar el proyecto entero?

Se usa el parametro de Orphan Removal. La diferencia entre borrar una tarea y un proyecto es que cuando borras una tarea se borra solamente esa tarea, cuando se borra el proyecto se borra ese mismo proyecto y todas las tareas asociadas a este mismo

3.  Explica cómo funciona "por debajo" el método de búsqueda por estado. Si tuvieras que escribir el SQL de esa consulta manualmente, ¿cómo sería aproximadamente (SELECT ...)?

La consulta manualmente se haria de la siguiente forma
"SELECT * FROM <Table> WHERE <Condicion>"
Lo que hace el metodo es sacar de la tabla los registros cumplen una dicha condicion.


## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back
