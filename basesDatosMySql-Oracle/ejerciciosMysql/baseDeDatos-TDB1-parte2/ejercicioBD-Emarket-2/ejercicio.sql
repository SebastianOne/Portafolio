-- -------------------------------------------------
-- PARTE 1
-- -------------------------------------------------

-- Clientes
-- 1) ¿Cuántos clientes existen?
SELECT  count(ClienteID) as numeroClientes
FROM clientes;
    
-- 2) ¿Cuántos clientes hay por ciudad?
SELECT Ciudad, count(ClienteID)
FROM clientes
GROUP BY Ciudad;

-- Facturas
-- 1) ¿Cual es el total de transporte?
SELECT SUM(Transporte) FROM emarket.facturas;

-- 2) ¿Cual es el total de transporte por EnvioVia (empresa de envío)?
SELECT SUM(Transporte), EnvioVia
FROM facturas
GROUP BY EnvioVia;


-- 3) Calcular la cantidad de facturas por cliente. Ordenar descendentemente por cantidad de facturas
SELECT ClienteID, COUNT(*) as num_facturas
FROM facturas
GROUP BY ClienteID
ORDER BY num_facturas DESC;


-- 4. Obtener el Top 5 de clientes de acuerdo a su cantidad de facturas.
SELECT ClienteID, COUNT(*) AS Cantidad_facturas
FROM facturas
GROUP BY ClienteID
ORDER BY Cantidad_facturas DESC LIMIT 5;

-- 5. ¿Cual es el país de envío menos frecuente de acuerdo a la cantidad de facturas?
SELECT PaisEnvio, COUNT(*) AS Cantidad
FROM facturas
GROUP BY PaisEnvio
ORDER BY Cantidad;

-- 6. Se quiere otorgar un bono al empleado con más ventas. ¿Qué ID de empleado realizó más operaciones de ventas?
SELECT EmpleadoID, COUNT(*) AS Cantidad_facturas
FROM facturas
GROUP BY EmpleadoID
ORDER BY Cantidad_facturas DESC;


-- Factura detalle
-- 1) ¿Cuál es el producto que aparece en más líneas de la tabla Factura Detalle?
select ProductoID, count(ProductoID) 
from facturadetalle
group by productoID
order by count(ProductoID) desc;
 -- Respuesta: producto 59 --
 
-- 2) ¿Cuál es el total facturado? Considerar que el total facturado es la suma decantidad por precio unitario.
select Cantidad, PrecioUnitario, sum(Cantidad)*PrecioUnitario as Total 
from facturadetalle;
-- total: 718438 --

-- 3) ¿Cuál es el total facturado para los productos ID entre 30 y 50?
select Cantidad, PrecioUnitario, floor(sum(Cantidadfacturadetalle)PrecioUnitario) as Total 
from facturadetalle
where ProductoID
between 30 and 50; 
-- total: 273074 --

-- 4) ¿Cuál es el precio unitario promedio de cada producto?
SELECT avg(PrecioUnitario), ProductoID
FROM facturadetalle
GROUP BY ProductoID;

-- 5) ¿Cuál es el precio unitario máximo?
SELECT  MAX(PrecioUnitario), ProductoID
FROM facturadetalle;



-- -------------------------------------------------
-- PARTE 2
-- -------------------------------------------------

-- 1) Generar un listado de todas las facturas del empleado 'Buchanan'.
SELECT * 
FROM EMarket.Facturas
INNER JOIN EMarket.Empleados ON Empleados.EmpleadoID = Facturas.EmpleadoID
WHERE Apellido= 'Buchanan';

-- 2) Generar un listado con todos los campos de las facturas del correo 'Speedy Express'.
SELECT *
FROM FACTURAS
INNER JOIN CORREOS ON FACTURAS.EnvioVia = CORREOS.CorreoID
WHERE CORREOS.Compania = "Speedy Express";

-- 3) Generar un listado de todas las facturas con el nombre y apellido de los empleados.
SELECT FacturaID, Nombre, Apellido 
FROM facturas
INNER JOIN empleados ON empleados.EmpleadoID = facturas.EmpleadoID;

-- 4) Mostrar un listado de las facturas de todos los clientes “Owner” y país de envío “USA”.
SELECT FacturaID
FROM facturas
INNER JOIN clientes ON clientes.ClienteID = facturas.ClienteID
WHERE clientes.Titulo = "Owner" AND facturas.PaisEnvio = "USA";

-- 5) Mostrar todos los campos de las facturas del empleado cuyo apellido sea “Leverling” o que incluyan el producto id = “42”.
SELECT *
FROM facturas
INNER JOIN empleados ON empleados.EmpleadoID = facturas.EmpleadoID
INNER JOIN facturadetalle ON facturadetalle.FacturaID = facturas.FacturaID
WHERE apellido = "Leverling" OR facturadetalle.ProductoID = 42;

-- 6) Mostrar todos los campos de las facturas del empleado cuyo apellido sea “Leverling” y que incluya los producto id = “80” o ”42”.
SELECT *
FROM  FACTURAS
INNER JOIN EMPLEADO ON FACTURAS.EmpleadoID = EMPLEADOS.EmpleadoID
INNER JOIN FACTURADETALLE ON FACTURAS.FacturaID = FACTURADETALLE.FacturaID
WHERE  EMPLEADO.Apellido = "Leverling" and FACTURADETALLE.ProductoID = 80 OR FACTURADETALLE.ProductoID = 42;
    
-- 7) Generar un listado con los cinco mejores clientes, según sus importes de compras total (PrecioUnitario * Cantidad).
SELECT clientes.ClienteID, Contacto, SUM(PrecioUnitario*Cantidad) as total
FROM clientes
INNER JOIN facturas ON facturas.ClienteID = clientes.ClienteID
INNER JOIN facturadetalle ON facturadetalle.FacturaID = facturas.FacturaID
GROUP BY clientes.ClienteID
ORDER BY total desc
LIMIT 5;

-- 8) Generar un listado de facturas, con los campos id, nombre y apellido del cliente, fecha de factura, país de envío, Total, ordenado de manera descendente por fecha de factura y limitado a 10 filas.
SELECT  FACTURAS.FacturaID as id, CLIENTES.Contacto, FACTURAS.FechaFactura,  FACTURAS.PaisEnvio, sum(FACTURADETALLE.Cantidad*FACTURADETALLE.PrecioUnitario) as total
FROM FACTURAS
INNER JOIN CLIENTES ON FACTURAS.ClienteID = CLIENTES.ClienteID
INNER JOIN FACTURADETALLE ON FACTURADETALLE.FacturaID = FACTURAS.FacturaID
GROUP BY FACTURAS.FacturaID
ORDER BY FACTURAS.FechaFactura DESC LIMIT 10;






