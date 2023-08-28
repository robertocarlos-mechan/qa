# language: es

Característica: SOLI BCP

  @login_soli
  Esquema del escenario: Realizar el logueo de usuario ya existente
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Entonces valido que inicie sesion
    Ejemplos:
      | celular    | password |
      | 71542767   | 4321     |