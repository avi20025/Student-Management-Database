CREATE TABLE studentInfos(
lastName VARCHAR(45), 
firstName VARCHAR(45), 
netID INT, 
credHours INT, 
balanceDue DOUBLE
);

LOAD DATA LOCAL INFILE '/Users/boo/Desktop/CS Projects/Student Database System/output.txt' INTO TABLE studentInfos;

select * from studentInfo;