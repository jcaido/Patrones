1.- PATRON "TEMPLATE"

    * Clase Herramienta: Clase abstracta que va a servir como modelo/plantilla para fabricar herramientas. 
      El método crearHerramienta() utiliza los métodos crearSoporte(), insertarMarca(), crearUtilFuncional()
      y ensamblarHerramientas(). Sólo el método abstracto crearUtilFuncional() es diferente según el tipo de herramienta creada.

    * Clases Pico, Pala, Mazo: Extienden la clase Herramienta para crear una herramienta concreta de cada tipo.

    * Clase Main: Creamos herramientas de cada tipo utilizando la plantilla (clase abstracta Herramienta) y los métodos
      específicos de cada tipo.
        