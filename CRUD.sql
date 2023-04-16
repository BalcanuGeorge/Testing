/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [ID]
      ,[Nume]
      ,[Prenume]
      ,[Adresa]
      ,[Oras]
  FROM [Persoane].[dbo].[DetaliiPersoane]

  /*INSERT INTO*/

INSERT INTO DetaliiPersoane (ID, Nume, Prenume, Adresa, Oras)
VALUES ('1', 'Pop', 'Vasile', 'Strada Principala', 'Onesti');
l


/*UPDATE*/
UPDATE DetaliiPersoane
SET Oras = 'Sibiu', Adresa ='Strada Lalelelor'
WHERE  ID = 1;

/*DELETE row*/
DELETE FROM DetaliiPersoane WHERE ID =1;


INSERT INTO DetaliiPersoane (ID, Nume, Prenume, Adresa, Oras)
VALUES ('1', 'Pop', 'Vasile', 'Strada Principala', 'Onesti');

INSERT INTO DetaliiPersoane (ID, Nume, Prenume, Adresa, Oras)
VALUES ('2', 'Pop', 'Gheorghe', 'Strada Principala', 'Onesti');



/*DELETE all row*/
DELETE FROM DetaliiPersoane;