## mysql基础

### 1.登录

- mysql -u root -p密码
- mysql  -h目标 uroot -p链接目标的密码
- mysql  --host=ip       --user=root    --password= 链接目标的密码

### 2.退出：

- exit
- quit

### 3.mySql：定义了所有关系型数据库的规则。

### 4.mySql通用语法

- 可以多行也可以单行，以分号结束
- 不区分大小写，建议使用大写来书写

```sql
-- 注释内容
#注释内容
//多行注释
/* mmmmmmm*/

```

### 5.sql分类

DDL：数据定义语言，用于定义数据库对象，操作数据库和表。

DML：增删改表中的数据

DQL:查询表中的数据

DCL:用来定义数据库的访问权限和安全级别，及创建用户

#### 5.1操作数据库

CR(retrieve)UD:增删改查。

```sql
  #判断数据库是否存在，并指定字符集。
  create database if not exists wl character set gbk;
  -- 修改数据库的字符集
  alter  database wl character set utf8;
  -- 删除数据库
  drop dadabase name;
  -- 先判断是否存在
  drop database if exists  名字;
  -- 使用数据库：
  use  数据库名称
  --查看当前使用的数据库
  select database();
```

#### 5.2 操作表

##### 5.2.1常用的数据类型

```sql
1.int   整数类型
2.double :小数类型
3.date:日期，只包含年月日，yyyy-MM-dd
4.datatime:日期，包含年月日时分秒   yyyy-MM-dd  HH:mm:ss
5.timestamp:时间戳类型  包含年月日时分秒   yyyy-MM-dd  HH:mm:ss   #如果将来不给这个字段赋值，或者赋值为null,默认使用当前系统时间，来自动赋值
6.varchar:字符串
name varchar(20):姓名最大20个字符串
zhangsan 8个字符   张三 ：两个字符


=============创建表===============

create table student(
    id int,
    name varchar(32),
    age int,
    score double(4,1),
    birthday date
    );
    ================复制表====================
create table 表名 like  被复制的表名
=====================查询表=======================
show tables #查看数据库中的所有表
desc  表名   #查询表结构
===================u修改表==================
alter table 表名 rename  to 新名字
alter table 表名 character set 字符集名称
alter  table  表名 add 列名 数据类型   -- 添加列
#修改列名称，类型
alter table 表名 change 列名 新列名 新数据类型
alter table 表名 modify 列名 新数据类型
#删除列
alter table 表名 drop 列名


    
```

#### 5.3DML：增删改表中的数据

5.3.1增加数据

```sql
insert into 表名（列名1，列名2，。。。。）values(x,x,x)
/*列名和值要一一对应，
如果表名后，不定义列名，则默认给所有列添加值。
除了数字类型外，其他类型需要用引号引起来。*/


```

5.3.2删除表中数据

```sql
#按照条件删除
DELETE FROM 表名  WHERE 条件（id=1）； 
#删除表
   ##1.DELETE FROM 表名  --- 按行删除
   ##2.删除表，再创建一个一模一样的空表
   truncate table 表名  -- 先删除，再创建，效率更高
   

```

5.3.3修改表中数据

```sql
#查询表
select  * from   表名
#修改表的基本语法
update 表名 set 列名1=值1，列名2=值2,.....[where 条件]
-- 如果不加任何条件，表中对应的所有值都会修改

```

#### 5.4DQL:查询表中的数据

```sql
select
  字段列表
  from
     表名列表
   where
     条件列表
   group by 
     分组字段
    having 
    	分组之后的条件
    order by 
       排序
     limit 
       分页限定
       
```

#### 5.4.1基础查询

- 多个字段查询

- ```
  select 属性名1，属性名2.... from  表名
  ```

  

- 去除重复

- ```
  select distinct 属性名 from  表名
  ```

  

- 计算列

  - 一般可以使用四则计算。（一般都是数字型计算）
  - ifnull(表达式1，表达式2)：null参与的运算，计算结果都为null,
    - 表达式1：哪个字段要判断为null，
    - 表达式2：如果该字段为null后的替换值。

- ```sql
  	select 属性1，属性2，属性3+属性4 from 表名
  	如果某一字段下的某个值为null,按一定的要求处理
  	select 属性1，属性2，ifnull(属性3,0)+属性4 from 表名
  ```

  

- 起别名

- as 可以省略

  - ```sql
    select 属性1，属性2，ifnull(属性3,0)+属性4  as 总分 from 表名
    ```

#### 5.4.2条件查询

where子句后跟条件

运算符

- > > < ,> >=,<= ,=,<>

- between  and 

- in(集合)

- like ：模糊查询

  - 占位符
    - _：单个任意字符
    - %：多个任意字符

- is null 

- and  或者 &&

- or  或 ||

- not 或 ！

```sql
#查询一个表里姓马的有哪些
select * from 表名 where name like '马%';
#查询姓名中第二个是化的人
select * from 表名 where name like '_化%';
#查询姓名是三个字的人
select * from 表名 where name like '___';
#查询姓名中包含马的人
select * from 表名 where name like '%马%';
```

### 5.4.3DQL:查询语句

##### 1.排序查询

```sql
1.select  条件  from  表名  order by  排序字段1，排序字段2  #当第一排序条件不满足。在使用第二字段
#order by  子句
## asc:升序
## desc :降顺
select  * from 表名 order by 属性名1 ASC,属性名2 desc;

```

##### 2.聚合函数（用来做列的纵向计算）

```sql
count:计算个数
max:计算最大值
min:计算最小值
sum:求和
avg:平均值
select avg(math) from 表名
聚合函数的计算，排除非空null值
	#解决方案1：选择不包含null的列进行计算
	#解决方案2：ifnull函数

```

3.分组查询：

```sql
#语法： group by 分组字段
#注意：
#	1.分组之后查询的字段：分组字段，聚合函数
#在分组之前加条件，
select sex,count(id) from 表名 where 条件  group by  条件
#对分组之后的结果进行筛选，加having  条件
	对于一个成绩表，按照性别分组，分别查询男，女的平均分，人数要求,分数低于70的人，不参与分组，分组之后人数要大于2人
	select sex，avg(math) from 表名 where math>70 group by sex having count(id)>2;

```

<u>注意</u>：**where和having的区别：**

1. where在分组之前进行限定，如果不满足条件，则不参与分组。
2. having在分组之后进行限定，如果不满足结果，则不会被查询出来。
3. where后不可以跟聚合函数，having可以根据聚合函数进行判断。
4. 一般在聚合函数之后起别名，需要判断时，用别名

`select sex，avg(math)  count(id)  as 人数 from 表名 where math>70 group by sex having 人数>2;`

##### 4.分页查询

- 语法：limit开始的索引，每页查询的条数
- 公式：开始的索引=（当前页码-1）*每页显示的条数
- 分页操作类似一个方言。每种数据库的分页命令不一样。

### 5.5约束

- 对表中的数据进行约束，保证数据的完整性、有效性和正确性
- 分类：
  - 主键约束  primary key :非空且唯一。
  
    - 删除主键；alter  table 表名 drop primary key;
    - 创建表后，添加主键：alter  table 表名  modify  id  int primary  key;
  
    - 自动增长：如果某一列是数值类型的，使用auto_increment ，自动增长该数值。
  
      ID  INT PRIMARY  KEY   auto_increment 
  - 非空约束 ：not null
  - 唯一约束：unique ：值可以为null,但是这列中只能有一个null.
  - 外键约束： foreign key
  
    - constraint   外键名称 foreign key 外键列名称 references  主表名称（主表列名称）
    - 删除外键：alter table employee  drop  foreign key  外键名称

5.5.1级联操作：

1. 添加级联操作：
   1. alter table 表名 add  constraint 外键名称   foreign key （外键字段名称） references 主表名称（主表列名称） on update cascade  on delete cascade;
   2. 分类：
      1. 级联更新：on update cascade
      2. 级联删除：on  delete cascade;

### 6.数据库的设计：

- ​	多表之间的设计
  - 一对一：人和身份证
    - 实现方式：一对一关系，可以在任意一方添加唯一外键指向另一方的主键。
  - 一对多（多对一）：
    - 学生和课程
    - 实现方式：部门和员工
    - 实现方式：在多的一方建立外键，指向一的一方的主键
  - 多对多：
    - 学生和课程：
    - 实现方式：多对多关系实现需要借助第三张表，中间表至少包含两个字段，这两个字段作为第三章表的外键，分别指向这两张表的主键。
- 数据库设计的范式
  - 第一范式：每一列都是不可分割的原子数据项
  - 第二范式：在1范式的基础上，非码属性必须完全依赖于候选码(在1NF基础上消除非主属性对主码的部分函数依赖)
    - 如果在一个表中，一个属性和属性组，被其他所有属性所完全依赖，则称这个属性或者属性组为该表的码。
    - 主属性：码属性组中的所有属性。
    - 非主属性：出国码属性组的属性
  - 第三范式：在2范式的基础上，任何非主属性不依赖于其他非主属性。（在2NF基础上消除传递依赖）



### 7.数据库备份与还原

1. 命令行：
   - 语法：mysqldump  -u用户名  -p密码   数据库名 >保存的路径
   - 还原：
     - 登录数据库
     - 创建数据库
     - 使用数据库
     - 执行文件  source   保存的路径

### 8.多表查询

#### 8.1内连接查询

- 隐式内连接

- ```sql
  #查询员工表的名称。性别，部门表的名称
  select emp.name,emp.gender,dept.name  from emp ,dept where emp.'dept.id'=dept.'id'
  上述优化写法：在from后给表起别名
  emp t1,dept t2
  
  ```

  

- 显式内连接

- ```sql
  select 字段列表 from  表名1 [inner] join 表名2 on 连接条件
  ```

- 内连接查询注意：

  - 从哪些表中查询
  - 条件是什么
  - 查询条件

#### 8.2外连接查询

- 左外连接
  -  select  字段列表 from  表1     left    [outer]  join     表2   on  条件;
- 查询的是所有左表数据及其交集部分。
- 
- 右外连接
  - select  字段列表 from  表1     left    [outer]  join     表2   on  条件;
  - 查询的是所有右边表数据及其交集部分。



#### 8.3子查询

- 子查询的结果是单行单列的：

  - 子查询可以作为条件，使用运算符进行判断。运算符：>< >=,<=.=

  - 查询员工工资小于平均工资的人所有信息。

    - ```sql
      select * from  emp where emp.salary<(select avg(salary) from emp);
      ```

- 子查询的结果是多行单列的

  - 子查询可以作为条件，使用运算符in 来判断

  - 例如查询‘市场部’和‘财务部’所有员工信息

    - ```sql
      select * from  emp  where dept_id in(select id from dept where name ='财务部'  or '市场部');
      ```

- 子查询的结果是多行多列的

  - 子查询可以作为一张虚拟表来参与查询

    - 查询员工入职日期是2011-11-11日之后的员工信息和部门信息
    - ``select dept t1,(select  *  from emp where emp.'join_tade'> '2011-11-11'`)  `t2 where t1.id=t2.'dept_id' ;   -(子查询方式)`
    - `select * from  emp t1 , dept t2 where  t1.'dept_id'=t2.'id' and  t1.'join_date' >2011-11-11`

    

