insert into abbonati (id,nome,cognome,data_Nascita,codice_Fiscale,residenza,domicilio,telefono_Fisso,telefono_Mobile,data_Iscrizione)
values (1,'MARIO', 'ROSSI', PARSEDATETIME('3 Feb 2001 00:00:00','d MMM yyyy HH:mm:ss','en'), 'RSSMRA01B03F839L',
'Via Manzoni 123, Napoli','Via Roma 1, Napoli','0811111111','3333333333', PARSEDATETIME('1 Dec 2001 00:00:00','d MMM yyyy HH:mm:ss','en'));

insert into abbonati (id,nome,cognome,data_Nascita,codice_Fiscale,residenza,domicilio,telefono_Fisso,telefono_Mobile,data_Iscrizione)
values (2,'LUCA', 'VERDE', PARSEDATETIME('14 Nov 1988 00:00:00','d MMM yyyy HH:mm:ss','en'), 'LCUVRD88S14G964P',
'Via Solfatara 123, Pozzuoli','Via Foria 100, Napoli','0812222222','3334444444', PARSEDATETIME('12 Sep 2020 00:00:00','d MMM yyyy HH:mm:ss','en'));

insert into abbonati (id,nome,cognome,data_Nascita,codice_Fiscale,residenza,domicilio,telefono_Fisso,telefono_Mobile,data_Iscrizione)
values (3,'ANDREA', 'GIALLO', PARSEDATETIME('11 Jul 1996 00:00:00','d MMM yyyy HH:mm:ss','en'), 'NDRGLL96L11F839C',
'Via dei Platani 123, Aversa','Via Viola 1, Napoli','0813333333','3335555555', PARSEDATETIME('11 Jun 2019 00:00:00','d MMM yyyy HH:mm:ss','en'));

insert into abbonamenti (id,data_inizio,data_fine,abbonato_id)
values (1,PARSEDATETIME('16 Dec 2020 00:00:00','d MMM yyyy HH:mm:ss','en'),PARSEDATETIME('16 Jan 2021 00:00:00','d MMM yyyy HH:mm:ss','en'),1);

insert into abbonamenti (id,data_inizio,data_fine,abbonato_id) 
values (2,PARSEDATETIME('16 Nov 2020 00:00:00','d MMM yyyy HH:mm:ss','en'),PARSEDATETIME('16 Jan 2021 00:00:00','d MMM yyyy HH:mm:ss','en'),2);

insert into abbonamenti (id,data_inizio,data_fine,abbonato_id)
values (3,PARSEDATETIME('23 Oct 2020 00:00:00','d MMM yyyy HH:mm:ss','en'),PARSEDATETIME('23 Nov 2020 00:00:00','d MMM yyyy HH:mm:ss','en'),3);