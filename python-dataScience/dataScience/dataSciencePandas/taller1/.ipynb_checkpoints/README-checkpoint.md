Muchos gobiernos alrededor del mundo han promovido la iniciativa de datos abiertos como un mecanismo de transparencia que habilita a cualquier ciudadano tener acceso a datos de dominio público y que de esta forma, si lo desea, pueda aportar al desarrollo de políticas públicas, económicas y de cualquier otra índole, siendo ya no solo una labor exclusiva de los funcionarios públicos.

Colombia no es la excepción. En el portal datos.gov.co los ciudadanos pueden acceder a datos oficiales y no oficiales de diferentes categorías, entidades y zonas del país. Adicionalmente, también pueden aportar a la comunidad subiendo nuevos datos o análisis sobre los datos ya existentes. Al día de hoy existen casi 6 mil conjuntos de datos, más de 12 mil visualizaciones y 960 entidades.

La Policía Nacional ha publicado un histórico desde el 2010 a la fecha de delitos de diferente tipo dividido en 10 reportes:

Delitos sexuales 
Violencia intrafamiliar
Secuestro
Terrorismo
Homicidio
Hurto 1 2 3
Lesiones personales
Extorsión

Realice un análisis exploratorio sobre al menos 3 de los anteriores reportes y responda la siguientes preguntas para cada uno de los tipos de delitos:

¿Cuáles han sido los departamentos (TOP 3) más afectados a nivel histórico y en el último año?
¿Cuál ha sido históricamente el arma o medio más común para cometer el delito?
¿Cómo es la proporción de géneros y grupos etarios que han estado involucrados en este tipo de delito? ¿Han variado con el paso de los años?
¿Se evidencia alguna tendencia para cometer dicho delito en algún mes particular del año?
Para los casos en los que se disponga del detalle del delito o de una descripción, como por ejemplo en delitos sexuales y secuestro, ¿cuáles son los delitos, descripciones o modalidades más comunes?
(BONO) Para tener una mayor significancia estadística de los resultados obtenidos en el punto 1, es importante que normalice las cantidades obtenidas por cantidad de habitantes en el municipio. En este CSV puede obtener la población por departamento para el año 2018. Asuma que la población no ha cambiado con el paso de los años. 
Aspectos a tener en cuenta:



Note que los reportes no se encuentran detallados a nivel de hecho particular. Presentan un nivel de agregación a partir de sus diferentes atributos como departamento, municipio, fecha, entre otros. Razón por la cuál en algunos registros encontrará cantidades superiores a 1. Esta cantidad corresponde a la cantidad de hechos ocurridos para ese conjunto de atributos.

Asegúrese de eliminar registros repetidos que puedan afectar el análisis. Puede hacer uso de la función drop_duplicates de Pandas.

De forma similar a SQL, Pandas cuenta con una función para convertir textos a fechas: to_datetime.

Para los casos en los que necesita realizar agrupaciones, puede usar la función groupby.

Reporte cualquier problema de calidad de datos que evidencie durante su análisis: campos nulos, departamentos mal escritos, formatos de fechas incorrectos, rangos de fechas inexistentes, entre otros. Si no evidencia ningún problema de calidad de datos, también mencionelo.

Para realizar el bono, necesitará hacer un join de los dos datasets. Puede hacerlo utilizando la función merge.
