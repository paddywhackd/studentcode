--BEGIN TRANSACTION;
DROP TABLE IF EXISTS member, interest_group, event, event_member, interest_group_member CASCADE;


CREATE TABLE member (
	member_id SERIAL NOT NULL,
	last_name varchar(25) NOT NULL,
	first_name varchar(25) NOT NULL,
	 email_address varchar(50) NOT NULL,
	phone_number varchar(15), 
	date_of_birth date NOT NULL,
	reminder_email boolean DEFAULT FALSE NULL,
	CONSTRAINT UQ_member_email_address UNIQUE(email_address),
	CONSTRAINT PK_member_id PRIMARY KEY(member_id)
);
	
CREATE TABLE interest_group (
	group_id serial NOT NULL,
	group_name varchar(50) NOT NULL,
	CONSTRAINT PK_interest_group PRIMARY KEY(group_id)
);

CREATE TABLE event (
	event_number_id serial NOT NULL,
	event_name varchar(50) NOT NULL,
	event_description varchar(100) NOT NULL,
	duration INTERVAL DEFAULT '30m' CHECK(duration >= '30m') NULL,
	event_holder int NOT NULL,
	CONSTRAINT PK_event_number_id PRIMARY KEY(event_number_id),
	CONSTRAINT FK_event_group FOREIGN KEY(event_holder) REFERENCES interest_group(group_id)
);

CREATE TABLE event_member(
	event_id int NOT NULL, 
	member_id int NOT NULL,
	CONSTRAINT PK_event_member PRIMARY KEY(event_id, member_id),
	CONSTRAINT FK_event_member_member FOREIGN KEY(member_id) REFERENCES member(member_id),
	CONSTRAINT FK_event_member_event FOREIGN KEY(event_id) REFERENCES event(event_number_id)
);

CREATE TABLE interest_group_member (
	member_id int NOT NULL,
	group_id int  NOT NULL,
	CONSTRAINT PK_interest_group_member PRIMARY KEY(member_id, group_id),
	CONSTRAINT FK_interest_group_member_member FOREIGN KEY(member_id) REFERENCES member(member_id),
	CONSTRAINT FK_interest_group_member_group FOREIGN KEY(group_id) REFERENCES interest_group(group_id)
);

INSERT INTO member (last_name, first_name, email_address, phone_number, date_of_birth, reminder_email)
VALUES ('Seinfeld', 'Jerry', 'funnyman67@gmail.com', '915-813-1974', '1954-4-29', false),
('Costanza', 'George', 'serenitynow318@gmail.com', '427-294-4297', '1954-8-12', false),
('Benes', 'Elaine', 'sponge4life@yahoo.com', '248-746-9427', '1960-7-4', false), 
('Kramer', 'Cosmo', 'assman123@aol.com', '759-427-9257', '1952-4-20', false), 
('Costanza', 'Frank', 'festivus4therestofus@geocities.com', '625-882-7654', '1938-6-12', true),
('nazi', 'soup', 'nosoup4u@gmail.com', '991-213-4453', '1958-8-12', true), 
('Maestro', 'The', 'nothinavailableintuscany@aol.com', '272-754-8861', '1957-5-17', true), 
('Bookman', 'Joe', 'joyboy300k@aol.com', '676-975-5544', '1929-12-31', true);

INSERT INTO interest_group (group_name)
VALUES ('The Van Buren Boys'), 
('The Yankees'), 
('the library inspectors'), 
('MoviePhone'),
('the league of ex-girlfriends');

INSERT INTO event (event_name, event_description, duration, event_holder)
VALUES 
('The Beat in', 'George must steal the next ladies purse or he''s a dead man', '120m', (select interest_group.group_id from interest_group where group_name = 'The Van Buren Boys')), 
('Festivus Celebration', 'the annual gathering around the pole featuring feats of strength', '240m', (select interest_group.group_id from interest_group where group_name = 'the library inspectors')),
('Return Your book day', 'return Tropic of Cancer, Jerry', '180m', (select interest_group.group_id from interest_group where group_name = 'MoviePhone')), 
('the league of ex-girlfriends', 'Annual gathering of the women Jerry has wronged', '1060m', (select interest_group.group_id from interest_group where group_name = 'the league of ex-girlfriends'));

INSERT INTO interest_group_member(group_id, member_id)
values((SELECT member.member_id from member where first_name = 'George'),(select interest_group.group_id from interest_group where group_name = 'The Van Buren Boys'));

INSERT INTO interest_group_member(group_id, member_id)
values((SELECT member.member_id from member where first_name = 'Joe'),(select interest_group.group_id from interest_group where group_name = 'the library inspectors'));

INSERT INTO interest_group_member(group_id, member_id)
values((SELECT member.member_id from member where first_name = 'Cosmo'),(select interest_group.group_id from interest_group where group_name = 'MoviePhone'));

INSERT INTO interest_group_member(group_id, member_id)
values((SELECT member.member_id from member where first_name = 'Elaine'),(select interest_group.group_id from interest_group where group_name = 'the league of ex-girlfriends'));


INSERT INTO event_member(member_id, event_id)
VALUES((SELECT member.member_id from member where first_name like 'Frank'), (select event.event_number_id from event where event_name like 'Festivus Celebration'));

INSERT INTO event_member(member_id, event_id)
VALUES((SELECT member.member_id from member where first_name like 'Jerry'), (select event.event_number_id from event where event_name like 'Return Your book day'));

INSERT INTO event_member(member_id, event_id)
VALUES((SELECT member.member_id from member where first_name like 'Elaine'), (select event.event_number_id from event where event_name like 'Annual gathering of the women Jerry has wronged'));


--COMMIT;


--ROLLBACK;


