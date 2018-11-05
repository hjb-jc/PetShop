#宠物表

#种类
drop table if exists p_Category;
create table p_Category(
  c_Id int primary key auto_increment,
  c_Name varchar(10)
);
insert into p_Category(c_Name) values ('泰迪犬'),('法国斗牛犬'),('吉娃娃'),('吉娃娃犬'),('精品柯犬');

select * from p_Category;

drop table if exists p_User;
create table p_User(
  u_Id int primary key auto_increment,
  u_FirstName varchar(10),
  u_LastName varchar(10),
  u_Email varchar(20),
  u_password varchar(20),
  u_Phone varchar(20),
  u_UserSatus int
);
insert into p_User(u_FirstName, u_LastName, u_Email, u_password, u_Phone, u_UserSatus) VALUES
('梁','德国','kh123@qq.com','123','12345678901',1);
select * from p_User;

select *  from p_User where u_LastName = "德国" and u_password = "123";

drop table if exists p_Tag;
#标签
create table p_Tag(
  t_Id int primary key auto_increment,
  t_Name varchar(10)
);
insert into p_Tag(t_Name) values ('精品犬'),('可爱犬'),('酷仔'),('调皮犬'),('乖巧犬');
select * from p_Tag;

drop table if exists p_pet;
create table p_pet(
  p_Id	int primary key auto_increment,
  p_Category varchar(20),   -- 种类
  c_Id int ,foreign key(c_Id) references p_Category(c_Id),
  p_Name 	varchar(20),    -- 名字
  p_PhotoUrls varchar(30),  -- 相片
  p_Tags  varchar(10),  	-- 标签
  p_Status varchar(4)      -- 状态
);
insert into p_pet( p_Category, c_Id, p_Name, p_PhotoUrls, p_Tags, p_Status) values
('泰迪',1,'精品泰迪 T.001','1.jpg','精品犬','在库'),
('法国斗牛犬',2,'法国斗牛犬 F.001','2.jpg','可爱犬','在库'),
('吉娃娃',3,'宠物级吉娃娃 J.001','3.jpg','酷仔','在库'),
('金毛犬',4,'精品金毛 JM.001','4.jpg','调皮犬','在库'),
('柯基犬',5,'精品柯基 K.001','5.jpg','乖巧犬','在库');
select  * from p_pet;

-- 订单
drop table if exists p_Order;
create table p_Order(
  o_Id	int primary key auto_increment,
  p_Id	int,foreign key (p_Id) references p_pet(p_Id),
  u_Id int,foreign key (u_Id) references p_User(u_Id),
  o_Quantity int,  -- 数量
  o_ShipDate  varchar(30), -- 发货日期
  o_Status	varchar(8)   -- 状态
);
insert into p_Order(p_Id, u_Id, o_Quantity, o_ShipDate, o_Status) values
(1,1,2,'2018-11-4','已订购');
select *  from p_Order;

