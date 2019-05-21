create table if not exists address
(
	address_id serial not null
		constraint address_pkey
			primary key,
	city varchar(255),
	local varchar(255),
	number varchar(255),
	street varchar(255),
	zip_code varchar(255)
);

alter table address owner to codecool;

create table if not exists hibernate_sequences
(
	sequence_name varchar(255) not null
		constraint hibernate_sequences_pkey
			primary key,
	next_val bigint
);

alter table hibernate_sequences owner to codecool;

create table if not exists play
(
	play_id serial not null
		constraint play_pk
			primary key,
	name varchar(255) not null,
	link_to_materials varchar(255)
);

alter table play owner to codecool;

create unique index if not exists play_id_uindex
	on play (play_id);

create table if not exists role_to_play
(
	role_to_play_id serial not null
		constraint role_to_play_pk
			primary key,
	name varchar(255) not null,
	play_id integer not null
		constraint role_to_play_play_play_id_fk
			references play
				on delete cascade
);

alter table role_to_play owner to codecool;

create unique index if not exists role_to_play_id_uindex
	on role_to_play (role_to_play_id);

create table if not exists technical_functions
(
	technical_id serial not null
		constraint technical_functions_pk
			primary key,
	name varchar(255) not null
);

alter table technical_functions owner to codecool;

create table if not exists users
(
	dtype varchar(31) not null,
	userId serial not null
		constraint users_pkey
			primary key,
	payment_per_spectacle double precision,
	technical_function_id integer
		constraint users_technical_functions_technical_id_fk
			references technical_functions,
	mail varchar(255) not null,
	name varchar(255) not null,
	surname varchar(255) not null,
	phone varchar(255) not null,
	address_id integer not null
		constraint users_address_address_id_fk
			references address
				on update cascade on delete cascade
);

alter table users owner to codecool;

create table if not exists play_staff
(
	play_staff_id serial not null
		constraint play_staff_pk
			primary key,
	role_to_play_id integer not null
		constraint play_staff_role_to_play_role_to_play_id_fk
			references role_to_play,
	userId integer not null
		constraint play_staff_users_user_id_fk
			references users
);

alter table play_staff owner to codecool;

create unique index if not exists play_staff_id_uindex
	on play_staff (play_staff_id);

create unique index if not exists technical_functions_technical_id_uindex
	on technical_functions (technical_id);

create table if not exists location
(
	location_id serial not null
		constraint location_pk
			primary key,
	name varchar(255) not null,
	address_id integer not null
		constraint location_address_address_id_fk
			references address
				on update cascade on delete cascade
);

alter table location owner to codecool;

create table if not exists orders
(
	order_id serial not null
		constraint orders_pk
			primary key,
	order_data date,
	location_id integer not null
		constraint orders_location_location_id_fk
			references location
				on update cascade on delete cascade,
	play_id integer not null,
	deal_status varchar(20),
	organiser_id integer not null
		constraint orders_users_user_id_fk
			references users
);

alter table orders owner to codecool;

create unique index if not exists orders_id_uindex
	on orders (order_id);

create unique index if not exists location_location_id_uindex
	on location (location_id);

