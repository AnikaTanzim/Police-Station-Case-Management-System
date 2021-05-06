CREATE DATABASE PoliceStationCaseManagement;
use PoliceStationCaseManagement;

-----Table 1: DistrictCodes tables-----

CREATE TABLE DistrictCodes(
	DistrictId int IDENTITY (8001,1) PRIMARY KEY,
	DistrictName varchar(50) NOT NULL
);

INSERT INTO DistrictCodes VALUES ('Barguna'), ('Barisal'),('Bhola'),('Jhalokathi'),('Potuakhali'), ('Pirojpur'),('Bandarban'), ('Brahmanbaria'),('Chandpur'),('Chittagong'),('Comilla'), ('Coxs Bazar'),
								 ('Feni'), ('Khagrachhari'),('Lakshmipur'),('Noakhali'),('Rangamati'), ('Dhaka'),('Faridpur'), ('Gazipur'),('Gopalganj'),('Kishorganj'),('Madaripur'), ('Manikganj'),
								 ('Munshiganj'), ('Narayanganj'),('Narsingdi'),('Rajbari'),('Shariatpur'), ('Tangail'),('Bagerhat'), ('Chuadanga'),('Jessore'),('Jhenaidaha'),('Khulna'), ('Kushtia'),
								 ('Magura'), ('Meherpur'),('Narail'),('Satkhira'),('Jamalpur'), ('Mymensingh'),('Netrokona'), ('Sherpur'),('Bogura'),('Joypurhat'),('Naogan'), ('Natore'),
								 ('Chapai Nawab Ganj'), ('Pabna'),('Rajshahi'),('Sirajganj'),('Dinajpur'), ('Gaibandha'),('Kurigram'),('Nilphamari'),('Lalmonirhaat'),('Panchagarh'),('Rangpur'),('Thakurgaon'),
								 ('Habiganj'),('Moulovibajar'), ('Sunamganj'),('Sylhet');
								 
								 
								 
								
								
SELECT * FROM DistrictCodes;
Truncate table DistrictCodes;
DROP TABLE DistrictCodes;

-------Table 2: PoliceStation Table------

CREATE TABLE PoliceStation(
PoliceStationId int NOT NULL  IDENTITY(2001,1) PRIMARY KEY,
PoliceStationName Varchar(100) NOT NULL, 
CodeNo int NOT NULL  , 
Area varchar(50) NOT NULL,
OfficerInCharge Varchar(100)

);

INSERT INTO PoliceStation values('ADABAR Police Station','1207','Adabar, Dhaka','Abul kalam'),
								('BADDA  Police Station','1214','Baridhara, Dhaka','Abdur rahman'),
								('BANGSHAL  Police Station','1245','Fazlul Karim Community Center, English Road','Ashique Islam'),
								('BIMAN BANDAR  Police Station','1254','Cargo Village, Shahjala Int Airport','Ishmam kalam'),
								('CANTONMENT  Police Station','1206','Cantonment, Dhaka','Jabir Islam'),
								('CHAWK BAZAR  Police Station','1354','59 Urdu Road, Dhaka','Abdur Rahim'),
								('DHAKKHINKHAN  Police Station','1254','193 Dhakkhinkhan, Dhaka','Mishal monsur'),
								('DAR US SALAM  Police Station','1254','100 Golatek, Dar Us Salam','Ashfaque Islam'),
								('DEMRA  Police Station','1254','Ahmed Bawani, Demra','Istiaq islam'),
								('DHANMONDI Police Station','1209','R#6. H#21, Dhanmondi','Abul karim'),
								('GANDARIAI Police Station','1254','Keshab Benarjee Rd','Arman kamal'),
								('GULSHANI Police Station','1214','H-32, 115 Gulshan Avenue, Gulshan-2','Ahnaf khan'),
								('HAZARIBAGI Police Station','1254','98/2 Gojmohal, Hazaribag','Ahmed Islam'),
								('JATRABARII Police Station','1236','Dhaka-Demra Highway','Abul kalam'),
								('KAFRULI Police Station','1205','Mirpur-14, Dhaka','Mainul Islam'),
								('KALABAGAN I Police Station','1209','30 North road, Vutergoli, Kalabagan','Abul khan'),
								('KAMRANGICHORI Police Station','1209','Signboard, Asrafabad, Kamrangirchar','Fahim ahmed'),
								('KHILGOAN Police Station','1219','Khilgaon Taltola Market, Block#A,','Faisal Islam'),
								('KHILKHET Police Station','1229','R-1, Nikunjo-2(South Side), Khilkhet','Farhan Akhter'),
								('KATAMTOLI Police Station','1254','Rayerbagh Rd, Mujahidnagar','Faizul Khan'),
								('KOTWALI Police Station','1254','2 No Simson Road, Kotwali','Rashedul Islam'),
								('LALBAG Police Station','1211','Shaheed Nagar, RND Road, House#24','Ove Chowdhury'),
								('MIRPUR MODEL Police Station','1216','Mirpur-2','Mehedi Islam'),
								('MOHAMMADPUR Police Station','1225','Sat Mosjid Road','Kazi Iqbal'),
								('MOTIJHEEL Police Station','1223','140 Motijheel C/A','Argha Chowdhury'),
								('MUGDA Police Station','1221','Wapdagoli, Mugda','Robiul Islam'),
								('NEW MARKET Police Station','1205','Nilkhet Katabon Road','Fahim Ahmed'),
								('PALLABI Police Station','1217','Pallabi-12','Zobaidul Khan'),
								('PALTAN Police Station','1000','Paltan VIP Road, Paltan','Saimum Islam'),
								('RAMNA Police Station','1217','Old Elephant road','Mohaimin Chowdhury'),
								('RAMPURA Police Station','1254','House#21,Block#H, Road#3/1, Khilgoan','Mishal Khan '),
								('RUPNAGAR Police Station','1254','House#10/A, Road#8, Section#7, Arambagh','Ayon Khan'),
								('SABUZBAG Police Station','1214','202 Moddho Basabo','Masfiq Kamal'),
								('SHAH ALI Police Station','1254','Road#1, Section#1, Block#B, House#29, Shah Ali',' Aryan Khan'),
								('SHAHBAG Police Station','1205','Shahbagh more, Shahbagh','Prithiraz Das'),
								('SHAJAHANPUR Police Station','1254','Shahjahanpur Railway Colony','Pradipto Narayan'),
								('SUTRAPUR Police Station','1254','37 Water Road','Snehal salsabil'),
								('SHYAMPUR Police Station','1254','Postagola','Tonmoy Das'),
								('SHER E BANGLA NAGAR Police Station','1254','Sayed Mahbub Morshed Ave','Farhan Sadique'),
								('TEJGOAN INDUSTRIAL Police Station','1215','56 Tejkunipara, Farmgate','Subayer Islam'),
								('TEJGOAN Police Station','1208','Tejgao','Md Zawad'),
								('UTTARA (EAST) Police Station','1230','R-14/D, Sector-4, H-12, Uttara','Mahrab aritro'),
								('UTTARA (WEST) Police Station','123','H-48, Road No: 18, Sector: 11, Uttara','Ishmam chowdhury'),
								('UTTARKHAN Police Station','1254','Madarbari, Mazer road, Uttarkhan','Ashraful Ahmed '),
								('VASHANTEK Police Station','1254','Vashantek, Mirpur,','Rifat Islam'),
								('VATARA Police Station','1204','Natunbazar','Ahmed Inteshar'),
								('WARI Police Station','1203','25 Tipusultan Rd','Hasibul haque');
SELECT * FROM PoliceStation;
DROP TABLE PoliceStation;
truncate table policeStation;

--------Table 3: Police Officer Table---------
CREATE TABLE PoliceOfficer(

	PoliceOfficerId int IDENTITY(7001,1) PRIMARY KEY,
	PoliceOfficerName varchar(100) NOT NULL,
	Designation varchar(50) NOT NULL,
	Area varchar(100) NOT NULL,
	CaseHandledNo int ,
	PhoneNo varchar(11) NOT NULL,
	Address varchar(100) ,
	DutyHour int DEFAULT 8 ,
	YearsOfExperience int 

);

INSERT INTO PoliceOfficer VALUES('Abdul karim','Sub-Inspector','Dhanmondi',3,'01733459558','Dhanmondi 10/A,Dhaka',7,3),
								('Rejaul haque','Additional Deputy Inspector','Tejgao',8,'01678459547','Niketon Housing',7,6),
								('Rashedul Haque','Traffic Inspector','Ramna',2,'01758459591','Bangla motor',9,1),
								('Moinul zaman','Assistant Sub-Inspector','Shahbag',6,'01674478558','Dhanmondi Lake Road',8,4),
								('Rafiqu ul Islam','Sub-Inspector','Kalabagan',8,'01718459558','Green Road, Jahanara Garder',7,5),
								('Robiul monsur','Assistant Sub-Inspector','Lalbag',5,'01712459545','Dhanmonid road 12/A',8,4),
								('Ishmam Salsabil','Additional Deputy Commissioner','Bangshal',8,'01778849778','Bangshal,Nimtoli lane',8,10),
								('Pradipta Narayan Chowdhury','Sub-Inspector','Motijheel',3,'01741595581','new eskaton,Dilu Road',7,5),
								('Ashraful Islam','Traffic Inspector','Palton',3,'01772459558','Shideshwari,peer shaheber goli',9,2),
								('Tonmoy das','Sub-Inspector','Rampura',3,'01745459558','Mogbazar',7,5);


select PoliceOfficerName,Designation,max(CaseHandledNo) from PoliceOfficer  group by PoliceOfficerName,Designation ;

drop table PoliceOfficer;
truncate table policeOfficer;
SELECT * FROM PoliceOfficer;

--------Table 4: Case Table---------
CREATE TABLE Cases(
	CaseNo Int PRIMARY KEY IDENTITY(6001,1),
	SectionNo Int Not Null ,
	PoliceStationId int FOREIGN KEY REFERENCES PoliceStation(PoliceStationId),
	PoliceOfficerId int FOREIGN KEY REFERENCES PoliceOfficer(PoliceOfficerId),
	MagistrateSection Int Null,
	StolenGoods Varchar(100) Null,
	RevivedGoods Varchar(100) Null,
    CaseAcceptance Varchar(5) Not Null ,
	ComplainLetterNo Int Not Null,
	FinalReport Varchar(5) Null ,
	CriminalStatus Varchar(100) Not Null,
	InvestigatingOfficerName Varchar(100) Not Null,
	CaseFilerName Varchar(100) Not Null ,
	AreaOfCrime Varchar(100) Null,
	ClosingDate Varchar(15) Null ,
	ReceivingDate DATETIME Not Null ,
	TypeOfCase Varchar(10) Not Null 
 
);

SELECT * FROM Cases;
truncate table Cases;
DROP TABLE Cases;

insert into Cases values 
(307,2040,7002,1860,null,null,'yes',567,'FRT', 'Surrender','Rejaul haque','Nafiur Rashid','Tejgaon Shilpanchol,infront of DMG gate, Kuni Para,word no-37','2018-12-03','2018-01-05 12:04:03','FIR'),
(171,2014,7004,462,null,null,'yes',567,'FRT', 'Convicted','Moinul zaman','Mahmudur Rahaman','Jatrabari, Bazar Road,word no-7',null,'2018-06-03 11:04:03','GD'),
(60,2008,7010,462,null,null,'yes',567,'FRT', 'Reedemed','Tonmoy das','Syed Rabbi Hasan','DAR US SALAM Road,infront of DAR US SALAM  Police Station',null,'2018-11-06 10:28:34','FIR'),
(188,2039,7006,1860,'laptop',null,'yes',567,'FRT', 'Convicted','Golam Rabbani ','Nafiur Rashid','SHER E BANGLA NAGAR koloni','nil','2018-12-15 09:45:03','FIR'),
(60,2001,7008,462,null,null,'no',567,'FRF', 'Convicted','Pradipta Narayan Chowdhury','Faiyaj Hossain Mridha ','Adabor, beside Adabor School and College','2019-01-03','2019-01-03 12:04:03','GD');


insert into Cases values 
(188,2039,7006,1860,'laptop',null,'yes',567,'FRT', 'Convicted','Golam Rabbani ','Nafiur Rashid','SHER E BANGLA NAGAR koloni','nil','2018-12-15 09:45:03','FIR'),
(60,2001,7008,462,null,null,'no',567,'FRF', 'Convicted','Pradipta Narayan Chowdhury','Faiyaj Hossain Mridha ','Adabor, beside Adabor School and College','2019-01-03','2019-01-03 12:04:03','GD');


-------Table5: Victim Table--------

CREATE TABLE Victim(
	VictimId int IDENTITY(1001,1) PRIMARY KEY,
	CaseNo int FOREIGN KEY REFERENCES Cases(CaseNo) not null,
	VictimName varchar(100) NOT NULL,
	Age int NOT NULL,
	FathersName varchar(100) ,
	Village varchar(50),
	Thana varchar(50) NOT NULL,
	DistrictId int NOT NULL FOREIGN KEY REFERENCES DistrictCodes(DistrictId),
	PresentAddress varchar(100) NOT NULL,
	PresentThana  varchar(50),
	PresentDistrictId int FOREIGN KEY REFERENCES DistrictCodes(DistrictId),
	MobileNo varchar(11) NOT NULL

);

SELECT * FROM Victim;
truncate table victim;
DROP TABLE Victim;

INSERT INTO Victim VALUES (6010,'Abdur Rashid',32,'Md.Salam Rashid','Balia','Babuganj',8004,'Kawran bazar','Tejgaon',8001,01722222753),
						  (6011,'Solaiman Khan',25,'Abrar Bhuiya','Goalbari','Parshuram',8006,'Shahjahanpur','Shahjahanpur',8001,01722249909),
						  (6012,'Kamrun Nahar',38,'Abul Kalam','Ghorua','Beanibazar',8003,'East building','Keraniganj',8001,01733349909),
						  (6013,'Rahman Khalil',25,'Md.Tipu Sultan','Des bhuyai','Hizla',8004,'Crowpara','Shreepur',8005,01725679909),
						  (6014,'Halima Begum',59,'Jobayer Hasan','Jhigli','Feni Sadar',8006,'117/2 baumoni','Feni',8006,01914249909);

--------Table 6: Accused Table---------

CREATE TABLE Accused(
	AccusedId int IDENTITY(3001,1) PRIMARY KEY,
	CaseNo int FOREIGN KEY REFERENCES Cases(CaseNo),
	AccusedName varchar(100),
	Age int ,
	FathersName varchar(100) ,
	Village varchar(50),
	Thana varchar(50) ,
	DistrictId int FOREIGN KEY REFERENCES DistrictCodes(DistrictId),
	PresentAddress varchar(100),
	PresentThana  varchar(50),
	PresentDistrictId int FOREIGN KEY REFERENCES DistrictCodes(DistrictId)


);
select * from Accused;
truncate table accused;
DROP TABLE Accused;
INSERT INTO Accused VALUES ('Solaiman Mia',34,'Khalil Morshed','IslaamPur','Jagannathpur',8003,'Elephant road','Ramna',8001),
                           ('Solaiman Mia',34,'Khalil Morshed','IslaamPur','Jagannathpur',8003,'Elephant road','Ramna',8001),

INSERT INTO Accused VALUES (6010,'Solaiman Mia',34,'Khalil Morshed','IslaamPur','Jagannathpur',8003,'Elephant road','Ramna',8001),
                           (6011,'MD.Kashem Hossain Mridha',50,'Golam Rabbani','Bahirghat','Bahirghat',8003,'Khilgaon','Khilgaon',8001),
						   (6012,'MD Rahat Osman',50,'Md Raja','Patuakhali','Patuakhali',8003,'Shutrapur','Shutrapur',8001),
						   (6013,'Abdur Rashid',32,'Md.Salam Rashid','Balia','Babuganj',8004,'Kawran bazar','Tejgaon',8001);
--------Table 7: Witness Table---------

CREATE TABLE Witness(
	WitnessId int IDENTITY(4001,1) PRIMARY KEY,
	CaseNo int FOREIGN KEY REFERENCES Cases(CaseNo),
	WitnessName varchar(100) NOT NULL,
	Age int NOT NULL,
	FathersName varchar(100) ,
	Village varchar(50),
	Thana varchar(50) NOT NULL,
	DistrictId int NOT NULL FOREIGN KEY REFERENCES DistrictCodes(DistrictId),
	PresentAddress varchar(100) NOT NULL,
	PresentThana  varchar(50),
	PresentDistrictId int FOREIGN KEY REFERENCES DistrictCodes(DistrictId),
	MobileNo varchar(11) Not Null


);

INSERT INTO Witness VALUES (6010,'Abdur Rashid',32,'Md.Salam Rashid','Balia','Babuganj',8004,'Kawran bazar','Tejgaon',8001,'01987654'),
						  (6011,'Solaiman Khan',25,'Abrar Bhuiya','Goalbari','Parshuram',8006,'Shahjahanpur','Shahjahanpur',8001,'01876543'),
						  (6012,'Kamrun Nahar',38,'Syed Rabbi Hasan ','Ghorua','Babuganj',8003,'East building','Keraniganj',8001,'01765432'),
						  (6013,'Rahman Khalil',25,'Md.Tipu Sultan','Patuakhali','Patuakhali',8004,'Crowpara','Shreepur',8005,'01567892'),
						  (6014,'Halima Begum',59,'Fatima khatun','Jhigli','Feni Sadar',8006,'117/2 baumoni','Feni',8006,'014567892');


SELECT * FROM Witness;
truncate table Witness;
DROP TABLE Witness;

--------Table 8: Evidence Table---------

create table Evidence(
	EvidenceId int IDENTITY(5001,1) PRIMARY KEY,
	CaseNo int FOREIGN KEY REFERENCES Cases(CaseNo) not null,
	EvidenceName varchar(100) NOT NULL,
	Area varchar(50),
	Time varchar(25),
	CollectedFrom Varchar(50),
	EvidenceStatus Varchar(25),
	TypeOfEvidence Varchar(20) not null,

);
SELECT * FROM Evidence;
truncate table Evidence;
DROP TABLE Evidence;


------------------------------queries-----------------------------------------------------
--join

select cases.CaseNo ,Victim.VictimName,Accused.AccusedName,Witness.WitnessName,Evidence.EvidenceName
from (((cases  
left join Witness  on cases.CaseNo=Witness.CaseNo)
left join Evidence on cases.CaseNo=Evidence.CaseNo)
left join Accused on cases.CaseNo=Accused.CaseNo)
left join Victim on cases.CaseNo=Victim.CaseNo;

--constraints

Alter table Victim Add check(MobileNo > 11);

Alter table Witness Add check(MobileNo > 11);

----

select CaseNo,CriminalStatus from cases where ClosingDate<> '';

Select AccusedName from accused group by AccusedName having count(distinct CaseNo)  >1 ;

Select count(CaseNo) from Accused ;

select TypeOfCase,count(TypeOfCase) as 'total' from cases where TypeofCase='GD' group by TypeOfCase;

select count(TypeOfCase) as 'total' from cases where TypeofCase='FIR' ;

Select ReceivingDate,count(CaseNo) from cases group by ReceivingDate;
select CaseNo,count(InvestigatingOfficerName) from cases group by CaseNo,InvestigatingOfficerName;

select PoliceOfficerName,Designation,max(CaseHandledNo) from PoliceOfficer  group by PoliceOfficerName,Designation ;

select Top 1 PoliceOfficerName,Designation,max(CaseHandledNo) from PoliceOfficer  group by PoliceOfficerName,Designation ;

Select ReceivingDate,count(CaseNo) from cases where ReceivingDate = '2018-12-15 09:45:03:000' group by ReceivingDate;

Select ReceivingDate,count(CaseNo) from cases where ReceivingDate BETWEEN '2018-12-15' AND '2019-01-03' group by ReceivingDate;

---sub query

select CaseNo from cases where 
CaseNo =(select CaseNo from Victim where  MobileNo='01953006423')
or
CaseNo in (select CaseNo from PoliceOfficer where  PhoneNo='01953006423')
or
CaseNo in(select CaseNo from Witness where  MobileNo='01953006423');

SELECT AccusedName FROM Accused where caseNo IN(Select CaseNo from Cases where CriminalStatus = 'Convicted');



