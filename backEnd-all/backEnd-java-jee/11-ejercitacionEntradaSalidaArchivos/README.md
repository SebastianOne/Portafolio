Para esta ejercitación se realizó la creación de dos clases Empleado y Empresa, donde la empresa tenía una lista de empleados; además se realizó la creación de dos clases Persistencia, ya que el enunciado pedía primero persistir
una empresa y a su lista de empleados, por lo cual se implementó Serializable en Empresa para poder leer y guardar en el archivo empresas.txt a la empresa, y el otro punto pedía persistir solo los empleados de dicha empresa en un archivo de empleados; en esta segunda consigna sé pedía que se guardaran como texto plano cada atributo del empleado separado por una coma de la siguiente forma:

Juan;Rodriguez;1154;56000
Jorge;Sanchez;2322;74000
Mario;Martinez;5420;46000
Santiago;Pereyra;7293;75000

por lo cual no se implementó Serializable y se usó otras clases para escribir y leer en el archivo empleados.txt-
