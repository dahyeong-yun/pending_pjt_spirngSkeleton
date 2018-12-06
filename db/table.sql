	create table member (
		mem_id varchar(50),
		mem_pw varchar(50) not null,
		mem_email varchar(100) not null,
		primary key(mem_id)
	);
    
    select * from member;