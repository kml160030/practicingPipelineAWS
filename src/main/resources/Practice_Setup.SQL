create table practice (
	id 		serial,
	username varchar(50) unique not null,
	password varchar(50) not null,

	constraint id_pk primary key (id)
);

--insert into practice values('kalyb','password');

select * from practice;

--drop table practice;