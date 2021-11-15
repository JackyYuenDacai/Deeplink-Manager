/*
    Database Init Script for Mysql
*/
drop database if exists dlm_db;
create database dlm_db;
ALTER DATABASE dlm_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

DROP USER 'dlm_user'@'%';
CREATE USER 'dlm_user'@'%' IDENTIFIED BY "...";
GRANT ALL PRIVILEGES ON dlm_db.* TO 'dlm_user'@'%';

use dlm_db;
/*
    Deeplink
    Filter
    Channel
    Access
*/
create table Deeplink(
    id nvarchar(64) primary key,
    code nvarchar(64) not null,
    target nvarchar(4096) not null,
    channelId nvarchar(64),
    embbedInfo nvarchar(4096),
    deniedTarget nvarchar(4096),
    filterType int unsigned,
    index indexCode (code),
    index indexChannel (channelId)
);
create table Filter(
    deeplinkId nvarchar(64),
    channelId nvarchar(64),
    name nvarchar(128),
    filterField nvarchar(64),
    filterType int unsigned, 
        /* 
        filter type: 
            0-none,
            1-between,
            2-equal,
            3-less,
            4-more,
            5-contains 
        */
    filterInverse boolean, /* if false: only the matched is valid */
    filterMustHave boolean, /* if denied if not found field */
    valueType int unsigned, 
        /*  
            0-int,
            1-float/double
            2-string
        */
    value nvarchar(256),
    extValue nvarchar(256),

    dvalue double,
    extDValue double,

    ivalue int,
    extIValue int,

    INDEX indexName (name),
    INDEX indexChannelId (channelId)
);

create table Channel(
    id nvarchar(64) primary key,
    name nvarchar(64) not null
);

create table Access(
    deeplinkId nvarchar(64),
    channelId nvarchar(64),
    ip VARBINARY(16),
    ipAddr nvarchar(64),
    accessDate date,
    accessTime time,
    accessTimezone int,
    extraInfo nvarchar(4096),
    denied boolean default false,
    INDEX indexDenied (denied),
    INDEX indexDate (accessDate),
    INDEX indexTime (accessTime)
);

create table NAS(
	time_index datetime,
	milli_mul int,
	milli_index int,
	avg_amp double,
	max_amp double,
	min_amp double
);
insert into Channel values("001","Default");
insert into Deeplink values("001","HelloWorld","https://www.google.com","001","Buggle",null,0);
insert into Filter values ("001","001","Deny facebook","asnOrg",5,false,true,2,"FACEBOOK",null,null,null,null,null);
insert into Filter values ("001","001","Deny google","asnOrg",5,false,true,2,"GOOGLE",null,null,null,null,null);



insert into Filter values ("002","002","Deny facebook","asnOrg",5,false,true,2,"FACEBOOK",null,null,null,null,null);
insert into Filter values ("002","002","Deny google","asnOrg",5,false,true,2,"GOOGLE",null,null,null,null,null);


insert into Filter values ("003","002","Deny facebook","asnOrg",5,false,true,2,"FACEBOOK",null,null,null,null,null);
insert into Filter values ("003","002","Deny google","asnOrg",5,false,true,2,"GOOGLE",null,null,null,null,null);


insert into Filter values ("004","003","Deny facebook","asnOrg",5,false,true,2,"FACEBOOK",null,null,null,null,null);
insert into Filter values ("004","003","Deny google","asnOrg",5,false,true,2,"GOOGLE",null,null,null,null,null);
