# SpringBootRelaciones

# Introducció a les relacions entre entitats/taules 

1-. Entitat Course 
Creeu una aplicació Spring Boot amb l’entitat Course tal i com es mostra a la figura (recordeu que necessita una id). 

Indicacions: La BD que fareu servir és H2. Necessitareu també Spring Web i Spring Data JPA i, si voleu, podeu instal·lar Lombok i utilitzar DevTools.

2-. Inseriu alguns cursos a la BD
Accediu directament la BD i inseriu alguns cursos amb queries.
Podeu generar aquestes queries a https://www.mockaroo.com/ i guardar-los a import.sql per tal de reaprofitar-los després.
3-. Creem els repositori.
Feu un repositori per poder fer CRUD dels cursos.
4-. Els controladors
Feu un controlador rest per accedir a tots els cursos o a un curs per id. La resposta http ha de ser vàlida també en els casos en què no hi ha cursos o s’accedeix a un curs incorrecte.  
