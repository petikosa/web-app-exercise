create sequence hibernate_sequence start with 1 increment by 1
create table day (id integer not null, day integer, primary key (id))
create table day_opening_hours (day_id integer not null, opening_hours_id integer not null)
create table opening_hours (id integer not null, end integer not null, note varchar(255), start integer not null, primary key (id))
create table place (id integer not null, address varchar(255), name varchar(255), primary key (id))
create table place_opening_hours (place_id integer not null, opening_hours_id integer not null)
alter table day_opening_hours add constraint UK_gyyjlqel4yj84viqrnxn7fvhy unique (opening_hours_id)
alter table place_opening_hours add constraint UK_s1s60v96rv2g8rfbsyql9kmx unique (opening_hours_id)
alter table day_opening_hours add constraint FKex6yvwvfr2xkqeccfe8x7iv56 foreign key (opening_hours_id) references opening_hours
alter table day_opening_hours add constraint FKnfm1rn1yfqwm39qqp24us64n8 foreign key (day_id) references day
alter table place_opening_hours add constraint FKowo6y3xknjfesq4tiw38fxt97 foreign key (opening_hours_id) references day
alter table place_opening_hours add constraint FKhf99epam612iajgo6queb8myw foreign key (place_id) references place
create sequence hibernate_sequence start with 1 increment by 1
create table day (id integer not null, day integer, primary key (id))
create table day_opening_hours (day_id integer not null, opening_hours_id integer not null)
create table opening_hours (id integer not null, end integer not null, note varchar(255), start integer not null, primary key (id))
create table place (id integer not null, address varchar(255), name varchar(255), primary key (id))
create table place_opening_hours (place_id integer not null, opening_hours_id integer not null)
alter table day_opening_hours add constraint UK_gyyjlqel4yj84viqrnxn7fvhy unique (opening_hours_id)
alter table place_opening_hours add constraint UK_s1s60v96rv2g8rfbsyql9kmx unique (opening_hours_id)
alter table day_opening_hours add constraint FKex6yvwvfr2xkqeccfe8x7iv56 foreign key (opening_hours_id) references opening_hours
alter table day_opening_hours add constraint FKnfm1rn1yfqwm39qqp24us64n8 foreign key (day_id) references day
alter table place_opening_hours add constraint FKowo6y3xknjfesq4tiw38fxt97 foreign key (opening_hours_id) references day
alter table place_opening_hours add constraint FKhf99epam612iajgo6queb8myw foreign key (place_id) references place
create sequence hibernate_sequence start with 1 increment by 1
create table day (id integer not null, day integer, primary key (id))
create table day_opening_hours (day_id integer not null, opening_hours_id integer not null)
create table opening_hours (id integer not null, end integer not null, note varchar(255), start integer not null, primary key (id))
create table place (id integer not null, address varchar(255), name varchar(255), primary key (id))
create table place_days (place_id integer not null, days_id integer not null)
alter table day_opening_hours add constraint UK_gyyjlqel4yj84viqrnxn7fvhy unique (opening_hours_id)
alter table place_days add constraint UK_i79d67fih6efuusduwcwyradg unique (days_id)
alter table day_opening_hours add constraint FKex6yvwvfr2xkqeccfe8x7iv56 foreign key (opening_hours_id) references opening_hours
alter table day_opening_hours add constraint FKnfm1rn1yfqwm39qqp24us64n8 foreign key (day_id) references day
alter table place_days add constraint FKtewn69hed095i21fdkkd3hcdr foreign key (days_id) references day
alter table place_days add constraint FKcjphh99b31ng568xwmc7sgok foreign key (place_id) references place
