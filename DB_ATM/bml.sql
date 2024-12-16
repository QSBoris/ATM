create database bankSystem;
use bankSystem;
create table signup(form_no varchar(60), name varchar(60), surname_name varchar(60), gender varchar(60), dob varchar(60), email varchar(60), martial_status varchar(60),adress varchar(60), city varchar(60), pincode varchar(60), state varchar(60));
select * from Signup;

create table signuptwo(form_no varchar(60), religion varchar(60), category varchar(60), income varchar(60), educationon varchar(60),occupation varchar(60), pan varchar(60),  SocialSS varchar(60), seniorcitizen varchar(60), existingacc varchar(60));
select * from Signuptwo;

create table signupthree ( form_no varchar(30), account_Type varchar(40), card_number varchar(30), pin varchar(30), facility varchar(200));
select * from Signupthree;

create table login(form_no varchar(30),card_number varchar(50), pin varchar(30));
select*from Login;

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));
select * from bank;