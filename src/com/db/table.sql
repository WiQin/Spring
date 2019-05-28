drop table t_account;

create table t_account(
    id number primary key,
    name varchar2(30),
    balance number
);

insert into t_account(id,name,balance) values(1,'tom',2000);
commit;