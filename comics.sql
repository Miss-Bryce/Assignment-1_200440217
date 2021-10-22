CREATE DATABASE IF NOT EXISTS comicsdatabase;
use comicsdatabase;

CREATE TABLE IF NOT EXISTS dccomics(
id int auto_increment primary key,
comicname nvarchar(100) not null,
chargrouping nvarchar(50) not null,
numpermonth int(25) not null
);

insert into dccomics(id, comicname, chargrouping, numpermonth)
values(1, "Justice League Incarnate", "Justice League", 5);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(2, "Shazam", "Teen Titans", 4);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(3, "Blue & Gold", "Individuals", 8);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(4, "Batman: Reptilian", "Batman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(5, "Batman/Catwoman", "Batman", 12);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(6, "Arkham City: The Order of The World", "Batman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(7, "Batman: The Adventures Continue Season Two", "Batman", 7);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(8, "Aquaman: The Becoming", "Aquaman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(9, "Checkmate", "Individuals", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(10, "Harley Quinn: The Animated Series: The Eat. Bang! Kill. Tour", "Batman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(11, "Crush & Lobo", "Individuals", 8);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(12, "The Joker Presents: A Puzzlebox", "Batman", 7);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(13, "Justice League Infinity", "Justice League", 7);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(14, "Justice League: Last Ride", "Justice League", 7);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(15, "Legends of the Dark Knight", "Batman", 8);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(16, "Mister Miracle: The Source of Freedom", "Individuals", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(17, "Nubia and The Amazons", "Wonder Woman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(18, "Suicide Squad: King Shark", "Suicide Squad", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(19, "The Swamp Thing", "Individuals", 10);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(20, "Titans United", "Teen Titans", 7);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(21, "Wonder Woman: Black and Gold", "Wonder Woman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(22, "Batman: The Imposter", "Batman", 3);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(23, "Batman vs Bigby! A Wolf in Gotham", "Batman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(24, "Catwoman: Lonely City", "Batman", 4);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(25, "The Nice House on The Lake", "Individuals", 12);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(26, "Suicide Squad: Get Joker!", "Suicide Squad", 3);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(27, "Superman vs. Lobo", "Superman", 3);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(28, "Aquaman/Green Arrow: Deep Target", "Aquaman", 7);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(29, "Dark Knights of Steel", "Batman", 12);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(30, "DC Vs. Vampires", "Individuals", 12);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(31, "Robin & Batman", "Batman", 3);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(32, "Robins", "Batman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(33, "Task Force Z", "Batman", 12);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(34, "Batman: One Dark Knight", "Batman", 3);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(35, "Human Target", "Individuals", 12);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(36, "Wonder Woman Historia: The Amazons", "Wonder Woman", 3);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(37, "Batman: Urban Legends", "Batman", 10);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(38, "Teen Titans Academy", "Teen Titans", 10);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(39, "Future State: Gotham", "Batman", 8);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(40, "Superman: Son of Kal-El", "Superman", 6);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(41, "I Am Batman", "Batman", 3);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(42, "Deathstroke Inc", "Individuals", 4);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(43, "Green Lantern: John Stewart - A Celebration of 50 Years", "Individuals", 1);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(44, "Wonder Woman: 80 Years of the Amazon Warrior", "Wonder Woman", 1);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(45, "Wonder Woman: Evolution", "Wonder Woman", 2);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(46, "Future State: Immortal Wonder Woman", "Wonder Woman", 2);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(47, "Wonder Woman in the Fifties", "Wonder Woman", 1);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(48, "Sensational Wonder Woman", "Wonder Woman", 7);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(49, "Superman '78", "Superman", 5);
insert into dccomics(id, comicname, chargrouping, numpermonth)
values(50, "Future State: Superman of Metropolis", "Superman", 2); 

select * from dccomics;

SELECT chargrouping FROM dccomics;

SELECT chargrouping, FLOOR(count(id) / (SELECT COUNT(*) FROM dccomics) * 100) FROM dccomics GROUP BY chargrouping;

