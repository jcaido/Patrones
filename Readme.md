1.- PATRON "TEMPLATE"

    * Clase Herramienta: Clase abstracta que va a servir como modelo/plantilla para fabricar herramientas. 
      El método crearHerramienta() utiliza los métodos crearSoporte(), insertarMarca(), crearUtilFuncional()
      y ensamblarHerramientas(). Sólo el método abstracto crearUtilFuncional() es diferente según el tipo de herramienta creada.

    * Clases Pico, Pala, Mazo: Extienden la clase Herramienta para crear una herramienta concreta de cada tipo.

    * Clase Main: Creamos herramientas de cada tipo utilizando la plantilla (clase abstracta Herramienta) y los métodos
      específicos de cada tipo.

2.- PATRON "BUILDER"

    * Clase Ordenador con muchos atributos. Para no tener que crear constructores con todas las combinaciones de
      atributos, utilizamos el patrón Builder en esta clase.

    * En la clase Main, inicializamos varios ojetos Ordenador con diferentes configuraciones, en función del numero
      de atributos que necesitemos para construir el objeto.

3.- PATRON OBSERVER

    Simulamos un centro de trabajo que puede cambiar la hora de apertura / cierre del centro y el menu diario a degustar
    en su restaurante. Cada vez que se produzca un cambio en cualquiera de estas circunstancias (atributos) se producirá 
    la correspondiente notificación a los departamentos del centro (Contabilidad, Ventas y Producción).

    * La clase "CentroDeTrabajo" es la que se encarga de mantener una lista con todos los observadores (departamentos de
      Contabilidad, Ventas y Producción). Así mismo, implementa métodos para añadir observadores ("addObserver"), cambiar
      atributos ("cambiarApertura", "cambiarCierre", "cambiarMenu") y los más importante un método para notificar estos
      cambios a los departamentos (observadores).

    * Las clases "Contabilidad", "Ventas" y "Producción" implementan la interface "DepartamentoObserver" acualizando los
      atributos cambiados.

    * En la clase "Main" probamos el sistema, realizando algún cambio y observando como se producen las correspondientes
      notificaciones.

4.- PATRON DECORATOR

    Queremos adquir un televisor y tenemos varias opciones. Televisor estándar, con equipo de sonido envolvente añadido
    y una tercera opcion añadiendo un TvBox para convertirlo en una smartTv.

    * La clase abstracta "Televisor" es la que contiene las caracteristicas del equipo (atributos), así como los métodos
      abstrator mostrarTelevisor() y precio().

    * la clase "TvEstandar" extiende la clase "Televisor" e implementa sus métodos obligatorios para mostrarnos que se trata
      de una opción básica (adquirir la television estandar) y su precio.

    * La clase abstracta "TvDecorator" exiende de la clase "Televisor" y es la que contiene el código necesario para construir
      los decoradores. En nuestro caso los decoradores serían las clases "TvAudioEnvolvente" y "SmartTvAudioEnvolvente" que
      extienden de "TvDecorator" e implementan los métodos concretos para añadir el equipo de sonido envolvente y la tvBox así
      como sus correspondientes precios.

    * En la clase "Main", instanciamos un nuevo objeto de tipo Televisor que sería inicialmente una TvEstandar y posteriormente
      añdimos los decoradores para ir viendo las opciones y sus precios.