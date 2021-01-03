drop table if exists abbonamenti CASCADE 
drop table if exists abbonamenti_premium CASCADE 
drop table if exists abbonati CASCADE 
drop table if exists account CASCADE 
drop table if exists admins CASCADE 
drop table if exists esercizi CASCADE 
drop table if exists protocolli CASCADE 
drop table if exists protocolli_sessioni CASCADE 
drop table if exists sessioni CASCADE 
drop table if exists sessioni_esercizi CASCADE 
drop sequence if exists hibernate_sequence
create sequence hibernate_sequence start with 1 increment by 1
create table abbonamenti (id bigint not null, data_fine timestamp, data_inizio timestamp, abbonato_id bigint, primary key (id))
create table abbonamenti_premium (id bigint not null, data_fine timestamp, data_inizio timestamp, abbonato_id bigint, primary key (id))
create table abbonati (id bigint not null, codice_fiscale varchar(255) not null, cognome varchar(20) not null, data_iscrizione timestamp not null, data_nascita timestamp not null, domicilio varchar(50), nome varchar(20) not null, residenza varchar(50) not null, telefono_fisso varchar(10), telefono_mobile varchar(10), primary key (id))
create table account (password varchar(20) not null, username varchar(20) not null, id bigint not null, abbonamento_premium_id bigint, primary key (id))
create table admins (id bigint not null, password varchar(20), username varchar(20), primary key (id))
create table esercizi (id bigint not null, descrizione varchar(200), gruppo_muscolare varchar(20) not null, media binary(255), nome varchar(20) not null, primary key (id))
create table protocolli (id bigint not null, categoria varchar(20) not null, primary key (id))
create table protocolli_sessioni (protocollo_id bigint not null, sessioni_id bigint not null, primary key (protocollo_id, sessioni_id))
create table sessioni (id bigint not null, nome varchar(10), primary key (id))
create table sessioni_esercizi (sessione_id bigint not null, esercizi_id bigint not null, primary key (sessione_id, esercizi_id))
alter table abbonati add constraint UK_bo544vm4ug8ubfxjld4svgroe unique (codice_fiscale)
alter table account add constraint UK_kac9tccc5hqgp38g91wc6o2rn unique (password)
alter table account add constraint UK_gex1lmaqpg0ir5g1f5eftyaa1 unique (username)
alter table admins add constraint UK_7m02itd96ff7c8yh3bkroo5dc unique (password)
alter table admins add constraint UK_mi8vkhus4xbdbqcac2jm4spvd unique (username)
alter table esercizi add constraint UK_333xts1h1lm8pkr4adpm6nnlj unique (nome)
alter table protocolli_sessioni add constraint UK_skn731j84prg190ekj7hrl8gi unique (sessioni_id)
alter table sessioni add constraint UK_ckm0rnloy8t88xctrcvusoqxb unique (nome)
alter table sessioni_esercizi add constraint UK_t83iaqxswr6g0auil9m7tg75d unique (esercizi_id)
alter table abbonamenti add constraint FKgirpfucgu3ix6wm0b22n6rsqk foreign key (abbonato_id) references abbonati
alter table abbonamenti_premium add constraint FK_pb1mgvbrnid273k62vggdbfuv foreign key (abbonato_id) references abbonati
alter table account add constraint FK3ubl8nkfcx9x3fq7ac805hvyo foreign key (abbonamento_premium_id) references abbonamenti_premium
alter table account add constraint FKhv0we7x6cj3tsng92yo0rrcei foreign key (id) references abbonati
alter table protocolli_sessioni add constraint FKaw4wk3pygvyp3m2m674q8qfwv foreign key (sessioni_id) references sessioni
alter table protocolli_sessioni add constraint FKskgq1h45rciv0nkvyrpsnvew2 foreign key (protocollo_id) references protocolli
alter table sessioni_esercizi add constraint FKgvfbx6psurvfumed84b56pxpm foreign key (esercizi_id) references esercizi
alter table sessioni_esercizi add constraint FKnk3a749mimrlw8noolxxmobg7 foreign key (sessione_id) references sessioni