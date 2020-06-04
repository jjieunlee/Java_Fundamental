SELECT * FROM emp;

INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) 
VALUES(8001,'KIM','SALESMAN',7900,CURDATE(), 1000, NULL, 40);

UPDATE emp SET ename='kim1', job='clerk',mgr=7782, 
hiredate=CURDATE(),sal=1001,comm=10,deptno=30 
WHERE ename ='kim';

DELETE FROM emp WHERE empno =8001;

# date형을 문자열로 바꾸어 표현하기 -> date_format()
SELECT empno, ename, job, mgr, date_format(hiredate,'%Y.%m.%d'), sal, comm, deptno 
FROM emp
ORDER BY empno DESC
LIMIT 0, 10;

SELECT empno, ename, job, mgr, date_format(hiredate,'%Y.%m.%d'), sal, comm, deptno 
FROM emp
WHERE empno=8000;

DESC emp;

START TRANSACTION;
INSERT INTO member VALUES(12,'AAA','BBB');
SAVEPOINT myPoint;
INSERT INTO member VALUES(10,'bbb','BBB');
INSERT INTO member VALUES(11,'ccc','BBB');
ROLLBACK TO myPoint;
COMMIT;
SELECT * FROM member;

DELETE FROM member WHERE num=12;

START TRANSACTION;
INSERT INTO dept(deptno, dname, loc) VALUES (50,'A1','B1');
SAVEPOINT myPoint;
INSERT INTO dept(deptno, dname, loc) VALUES (60,'A2','B2');
INSERT INTO dept(deptno, dname, loc) VALUES (70,'A3','B3');
INSERT INTO dept(deptno, dname, loc) VALUES (80,'A4','B4');
ROLLBACK TO myPoint;
COMMIT;

SELECT * FROM dept;

DELETE FROM dept WHERE deptno=80;