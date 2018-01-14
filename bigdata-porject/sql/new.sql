-- 메뉴 대분류

create table menu_category(

    mcno integer null,
    mtype varchar(20) not null,
    mcdate datetime not null default now(),
    delchk char(1) not null default 'N',
    mccontent varchar(60) not null
);

alter table menu_category add constraint primary key menu_category_mcno_pk(mcno);
alter table menu_category modify mcno integer not null auto_increment;

-- 메뉴 상세

create table menu(
    mno integer null,
    mcno integer not null,
    mname varchar(30) not null,
    mprice varchar(30) not null,
    mcontent varchar(100) not null,
    mdate datetime not null default now(),
    delchk char(1) not null default 'N'
);

-- 메뉴 key

alter table menu add constraint primary key menu_mno_pk(mno);
alter table menu modify mno integer not null auto_increment;
alter table menu add foreign key menu_mcno_fk(mcno)
references menu_category(mcno);

-- 메뉴 사진

create table menu_image(
    mino integer null,
    mno integer not null,
    filename varchar(255) not null,
    newfilename varchar(255) not null,
    midate datetime not null default now()
);

alter table menu_image add primary key menu_image_mino_pk(mino);
alter table menu_image modify mino integer not null auto_increment;
alter table menu_image add foreign key menu_image_mino_fk(mno)
references menu(mno);

-- 메뉴 템플릿

create table menu_temp(
  mtno integer null,
  mttype varchar(20) not null,
  mtarea varchar(20) not null,
  mname varchar(30) not null,
  mtype varchar(30) not null,
  mprice varchar(30) not null,
  mcontent varchar(30) not null,
  mtdate datetime not null default now(),
  delchk char(1) not null default 'N'
);


alter table menu_temp add primary key menu_temp_mtno_pk(mtno);
alter table menu_temp modify mtno integer not null auto_increment;