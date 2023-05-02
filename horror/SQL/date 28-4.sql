create table serviceStation(srNo_pk int not null auto_increment,serviceType varchar(20),primary key(srNo_pk));
insert into serviceStation values(1,'policetype');
insert into serviceStation values(2,'policetype');
insert into serviceStation values(3,'petroltype');
insert into serviceStation values(4,'desiltype');
insert into serviceStation values(5,'oiltype');
insert into serviceStation values(6,'hospitaltype');
insert into serviceStation values(7,'petroltype');
insert into serviceStation values(8,'Stype');
insert into serviceStation values(9,'Ptype');
insert into serviceStation values(10,'Qtype');
select * from serviceStation;

create table customerRecord(
srNo int not null,
custemerName varchar(20),
custemerNo long ,
carissue varchar(20),
cost int,
servecTypeId_fk int,
primary key(srNo), foreign key(servecTypeId_fk) references serviceStation(srNo_pk));
insert into customerRecord values(1,'Abhishek',9819792742,'notting',23432,1);
insert into customerRecord values(2,'Abhishek',9819792742,'notting',53212,2);
insert into customerRecord values(3,'Abhishek',9819792742,'notting',33432,3);
insert into customerRecord values(4,'Abhishek',9819792742,'notting',43432,4);
insert into customerRecord values(5,'Abhishek',9819792742,'notting',53432,5);
insert into customerRecord values(6,'Abhishek',9819792742,'notting',63432,6);
insert into customerRecord values(7,'Ankita',9819792742,'notting',73432,7);
insert into customerRecord values(8,'Anusha',9819792742,'notting',83432,8);
insert into customerRecord values(9,'Anil',9819792742,'notting',93432,9);
insert into customerRecord values(10,'Asha',9819792742,'notting',234432,10);


select * from serviceStation left join customerRecord on servecTypeId_fk = srNo_pk;

select count(*) from customerRecord;
select * from customerRecord where cost>=50000;
select custemerName from customerRecord where custemerName like 'A%';

