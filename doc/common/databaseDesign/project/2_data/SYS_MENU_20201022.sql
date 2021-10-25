REM INSERTING into SYS_MENU
SET DEFINE OFF;
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('QM40','QM','Find Assignment','Find Assignment','/qm/40/getDefault.do','QM40','000004','Find Assignment','Y','0',to_date('14/08/2020','DD/MM/RRRR'),'0',to_date('14/08/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('BBS',null,'협업','Collaboration','#','BBS','800000','Bulletin board for internal communication','Y','0',to_date('23/11/2018','DD/MM/RRRR'),'0',to_date('13/10/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('BBS0200','BBS','게시판','Bulletin Board','/bbs/0202/getDefault.do','BBS0200','800100','Bulletin Board','Y','0',to_date('23/11/2018','DD/MM/RRRR'),'0',to_date('13/10/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('BBS0202','BBS0200','공지사항','Notice','/bbs/0202/getDefault.do',null,'800101','Notice board','Y','0',to_date('23/11/2018','DD/MM/RRRR'),'0',to_date('13/10/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('BBS0204','BBS0200','자유게시판','Free board','/bbs/0204/getDefault.do',null,'800102','Free board','Y','0',to_date('23/11/2018','DD/MM/RRRR'),'0',to_date('13/10/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9800','SYS','IT Support','IT Support','/sys/9802/getDefault.do','SYS9800','999800','IT Support','Y','0',to_date('23/11/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9802','SYS9800','Assignment','Assignment','/sys/9802/getDefault.do',null,'999801','IT Support function for assignment related issues','Y','0',to_date('23/11/2018','DD/MM/RRRR'),'0',to_date('28/08/2019','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9804','SYS9800','Invoice','Invoice','/sys/9804/getDefault.do',null,'999802','IT Support function for invoice related issues','Y','0',to_date('03/12/2018','DD/MM/RRRR'),'0',to_date('16/09/2019','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9806','SYS9800','IT Support ETC','IT Support ETC','/sys/9806/getDefault.do',null,'999803','IT Support function for Org, Billing Code and etc.','Y','0',to_date('17/09/2019','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('QM',null,'Quick Menu','Quick Menu','#','QM','000000','Quick Menu','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('QM10','QM','Select Database','Select Database','/qm/10/getDefault.do','QM10','000001','Select Database','Y','0',to_date('05/09/2018','DD/MM/RRRR'),'0',to_date('25/03/2019','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('QM20','QM','Find Person','Find Person','/qm/20/getDefault.do','QM20','000002','Find Person','Y','0',to_date('05/09/2018','DD/MM/RRRR'),'0',to_date('25/03/2019','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('QM30','QM','Find Organisation','Find Organisation','/qm/30/getDefault.do','QM30','000003','Find Organisation','Y','0',to_date('05/09/2018','DD/MM/RRRR'),'0',to_date('25/03/2019','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('PER',null,'Person Mgmt.','Person Mgmt.','#','PER','010000','Person Mgmt.','Y','0',to_date('05/09/2018','DD/MM/RRRR'),'0',to_date('10/08/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('PER0200','PER','Basic Info','Basic Info','/per/0202/getDefault.do','PER0200','010100','Basic Info','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('PER0202','PER0200','Find Person','Find Person','/per/0202/getDefault.do',null,'010101','Find Person','Y','0',to_date('05/09/2018','DD/MM/RRRR'),'0',to_date('22/10/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9899','SYS9800','Site Running Test','Site Running Test','/sys/9899/getDefault.do',null,'999899','Test if sites are running ok','Y','0',to_date('15/01/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9898','SYS9800','Monitor Databse Session','Monitor Databse Session','/sys/9898/getDefault.do',null,'999898','Monitor Databse Session','Y','0',to_date('15/01/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS',null,'System Administrator','System Administrator','#','SYS','990000','System Administrator','Y','0',to_date('05/09/2018','DD/MM/RRRR'),'0',to_date('10/08/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0200','SYS','Basic Information','Basic Information','/sys/0202/getDefault.do','SYS0200','990100','Basic Information','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0202','SYS0200','Common Code','Common Code','/sys/0202/getDefault.do',null,'990101','Common Code','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0204','SYS0200','Country / Currency','Country / Currency','/sys/0204/getDefault.do',null,'990102','Country / Currency','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0400','SYS','Menu / User','Menu / User','/sys/0402/getDefault.do','SYS0400','990200','Menu / User','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0402','SYS0400','Menu','Menu','/sys/0402/getDefault.do',null,'990201','Menu','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0404','SYS0400','Authority Group','Authority Group','/sys/0404/getDefault.do',null,'990202','Authority Group','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0406','SYS0400','User','User','/sys/0406/getDefault.do',null,'990203','User','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS0408','SYS0400','Menu - Authority Group','Menu - Authority Group','/sys/0408/getDefault.do',null,'990204','Menu - Authority Group','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9900','SYS','BBS','BBS','/sys/9902/getDefault.do','SYS9900','999900','BBS','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9902','SYS9900','Annoucement','Annoucement','/sys/9902/getDefault.do',null,'999901','Annoucement','Y','0',to_date('05/09/2018','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9904','SYS9900','Free Board','Free Board','/sys/9904/getDefault.do',null,'999902','Free Board','Y','0',to_date('05/09/2018','DD/MM/RRRR'),'0',to_date('07/11/2018','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('SYS9808','SYS9800','PERCI Source Generator','PERCI Source Generator','/sys/9808/getDefault.do',null,'999804','PERCI Source Generator','Y','0',to_date('17/03/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('ORG',null,'Organisation Mgmt.','Organisation Mgmt.','#','ORG','020000','Organisation Management','Y','0',to_date('25/09/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('ORG0200','ORG','Basic Info','Basic Info','/org/0202/getDefault.do','ORG0200','020100','Organisation Basic Info','Y','0',to_date('25/09/2020','DD/MM/RRRR'),'0',to_date('25/09/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('ORG0202','ORG0200','Organisation Profile','Organisation Profile','/org/0202/getDefault.do',null,'020101','Organisation Profile','Y','0',to_date('25/09/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('TMS',null,'Timesheet','Timesheet','#','TMS','040000','Timesheet','Y','0',to_date('13/10/2020','DD/MM/RRRR'),'0',to_date('13/10/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('PAY',null,'Payroll','Payroll','#','PAY','060000','Payroll','Y','0',to_date('13/10/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('INV',null,'Invoice','Invoice','#','INV','080000','Invoice','Y','0',to_date('13/10/2020','DD/MM/RRRR'),'0',to_date('13/10/2020','DD/MM/RRRR'));
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('ETC',null,'Additional','Additional','#','ETC','100000','Additional','Y','0',to_date('13/10/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('NAV',null,'NAV Sync','NAV Sync','#','NAV','120000','NAV Sync','Y','0',to_date('13/10/2020','DD/MM/RRRR'),null,null);
Insert into SYS_MENU (MENU_ID,PARENT_MENU_ID,MENU_NAME_KO,MENU_NAME_EN,MENU_URL,MENU_ICON,SORT_ORDER,DESCRIPTION,IS_ACTIVE,INSERT_USER_ID,INSERT_DATE,UPDATE_USER_ID,UPDATE_DATE) values ('RPT',null,'Report','Report','#','RPT','140000','Report','Y','0',to_date('13/10/2020','DD/MM/RRRR'),null,null);
