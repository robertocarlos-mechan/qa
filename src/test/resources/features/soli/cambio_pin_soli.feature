# language: es

Característica: SOLI BCP

  @cambio_pin_soli
  Esquema del escenario: Realizar el logueo de usuario ya existente
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y doy clic al boton Mas
    Y valido que estoy en la opcion ajustes
    Y doy clic a la opcion cambiar pin
    Y ingreso pin actual "<password>"
    Y ingreso nuevo pin "<pin_new>"
    Y confirmo nuevo pin "<pin_new>"
    Y doy clic a cambio de pin
    Entonces se valida el cambio de pin exitoso

    Ejemplos:
      | celular    | password | pin_new |
      | 71542767   | 4321     | 1234    |