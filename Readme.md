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


5.- PATRON STRATEGY

    Gestión de pedidos en una tienda online de productos relacionados con el ajedrez. A través de sendas interfaces implementamos
    clases para la gestión del envío y la forma de pago. 
    
    * Las  clases "EnvioEstandar", "EnvioRapido" y "EnvioVeloz" implementan la
    interface "EnvioStrategy". Las clases "Reembolso", "Transferencia" y "Tarjeta"  implementan la interface "PagoStrategy".
    
    * La clase "Pedido" utiliza ambas interfaces para definir tanto el tipo de envío como la forma de pago. Además, define la lista
    artículos del pedido y el cáculo del coste asociado a la lista. Posteriormente muestra toda la información del pedido haciendo
    uso del método mostrarPedido().

    * Por último, en la clase "Main" creamos un pedido concreto y mostramos su información por consola.


6.- PATRON PROXY

    Nuestra aplicación necesita abrir un archivo pesado llamado "proteinas.csv". Con el objetivo de no saturar la memoria, sólo se
    inicializará el objeto "ArchivoDatos" cuando sea necesario. Para ello utilizamos un proxy, el cual se encargará de suplantar al
    objeto pesado.

    * Tanto las clases "ArchivoDatos" como "ProxyArchivoDatos" implementan la interface "Archivo.

    * En la clase "Main" simulamos la apertura de un fichero de datos pesado (proteinas.csv). Para ello instanciamos un objeto de la
      clase "ProxyArchivoDatos", el cual abrirá el archivo. Como vemos, el archivo no se abre al arrancar la aplicación, sino cuando
      ha sido necesario.


7.- PATRON singleton

    En una empresa, suponemos que sólo puede existir un gerente. Para ello, nuestra aplicación no puede permitir tener instanciados 
    mas de un objeto de la clase Gerente. Para conseguirlo, utilizamos el patrón singleton.

    * La clase "Gerente" implementa el patrón. Para ello define el método estático getInstance(), el cual crea un nuevo objeto gerente
      siempre y cuando no haya sido creado con anterioridad.
    
    * En la clase "Main" concretamos la creación del gerente de la empresa y visualizamos sus datos, comprobando que no es posible crear
      un nuevo gerente.

    