# language: es

Característica: SOLI BCP

  @envio_otro_soli
  Esquema del escenario: Realizar el envio a otros soli
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a envio a otro soli
    Y doy permiso para ingresar a contactos
    Y valido que estoy en la opcion envio a otro soli
    Y ingreso numero de soli "<celular_soli>"
    Y doy clic al numero a transferir
    Y ingreso el monto "<monto>"
    Y ingreso un comentario
#    Y doy clic al boton para transferencia
#    Entonces valido que se haya realizado la transferencia
    Ejemplos:
      | celular    | password |celular_soli | monto |
      | 71542767   | 1234     |71532355     | 0.10  |

