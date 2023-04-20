#language: es

Característica: Registrar domicilio
  como cliente de dominos
  necesito registrar los datos de domicilio
  para realizar un pedido


  Escenario: Ingresar datos incorrectos de domicilio
    Dado que el usuario se encuentra en la tienda
    Cuando el usuario diligencie una direccion que no exista
    Y el usuario seleccione una tienda fisica
    Entonces el usuario es redirigido al menu principal
