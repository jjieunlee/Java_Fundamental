SELECT * FROM emp;
SELECT * FROM dept;
# allen의 급여와 동일하거나 더 많이 받는 사원의 이름과 급여 출력
SELECT ename 사원이름, sal 급여
FROM emp
WHERE sal>=(SELECT sal FROM emp WHERE ename='allen');

# dallas 에서 근무하는 사원의 이름 부서번호를 출력
SELECT ename 사원이름, deptno 부서번호
FROM emp
WHERE deptno=(SELECT deptno FROM dept WHERE loc='dallas');

# sales 부서에서 근무하는 모든 사원의 이름과 급여 출력
SELECT ename 사원이름, sal 급여
FROM emp
WHERE deptno=(SELECT deptno FROM dept WHERE dname='sales');

# 자신의 직속 상관이 'king'인 사원의 이름과 급여
SELECT ename 사원이름, sal 급여
FROM emp
WHERE mgr=(SELECT empno FROM emp WHERE ename='king');

# 다중쿼리
# 급여를 3000이상받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의
# 이름과 급여, 부서번호 출력(3000이상 받는 부서가 1개 이상이다)
SELECT ename 이름, sal 급여, deptno 부서번호
FROM emp
WHERE deptno IN(SELECT deptno FROM emp WHERE sal>=3000);

# in 연산자를 이용하여 부서별로 가장 급여를 많이 받는 사원의 사원번호,급여,부서번호
SELECT empno 사원번호, sal 급여, deptno 부서번호
FROM emp
GROUP BY deptno;

SELECT empno 사원번호, sal 급여, deptno 부서번호
FROM emp
WHERE sal IN(SELECT MAX(sal) FROM emp GROUP BY deptno);

# 직책이 manager인 사원이 속한 부서의 부서번호와 부서명과 부서의위치 출력
SELECT deptno 부서번호, dname 부서명, loc 부서위치
FROM dept
WHERE deptno IN(SELECT deptno FROM emp WHERE job='manager');

# 직책이 'salesman'보다 급여를 많이 받는 사원들의 이름과 급여 출력(any연산자 사용)
SELECT ename 사원이름, sal 급여
FROM emp
WHERE sal >(SELECT min(sal) FROM emp WHERE job='salesman');

SELECT ename 사원이름, sal 급여
FROM emp
WHERE sal >ANY(SELECT sal FROM emp WHERE job='salesman');

# DML
# 입력
# EMP 테이블에 아래와 같은 사원추가하기
# EMPNO : 8000 , ENAME : 최수만, JOB : 방장, MGR : 7900 
# HIREDATE : 오늘 , SAL : 2000, COMM : 100 , DEPTNO : 40 

# DATE=>curdate(): 2020-06-02(시 분 초 x)
# datetime =>now(): 2020-06-02 11:25:45(시 분 초 o)
DELETE FROM emp WHERE empno=8000;
INSERT INTO emp(empno, ename, job, MGR, hiredate, sal, comm, deptno) VALUES (8000,'최수만',
'방장', 7900, curdate(), 2000,100,40);

# update(수정)
SELECT * FROM member;
INSERT INTO member() VALUES(5,'잡스',"미국");

# member 테이블의 내용중 num칼럼이 3인 회원의 주소를 한국으로 수정
UPDATE member SET addr='한국' WHERE num=3;

# member테이블 내용중 num칼럼이 2인 회원의 이름과 주소를 jobs 와 us로 바꾸기
UPDATE member 
SET addr='us', NAME='jobs'
WHERE num=2;

# member테이블에서 num칼럼이 3인 회원의 정보를 삭제
DELETE FROM member WHERE num=3;

#트랜잭션 시작
START TRANSACTION;
INSERT INTO member(num, NAME, addr) VALUES(7,'베조스1','미국');
INSERT INTO member(num, NAME, addr) VALUES(8,'머스크1','미국');
INSERT INTO member(num, NAME, addr) VALUES(9,'이재용1','한국');
INSERT INTO member(num, NAME, addr) VALUES(10,'이지은1','한국');

# 트랜잭션 끝: 모두 수행
COMMIT;
# 트랜잭션 끝 : 모두 취소
ROLLBACK;

SELECT @@autocommit;
# autocommit : 0 =>  자동 커밋을 지원하지 않음
# autocommit : 1 => 자동 커밋을 지원
SET autocommit=1;

DROP TABLE test;

CREATE TABLE test(
num INT,
NAME VARCHAR(50)
)

# 테이블 구조 확인하기
DESC test;

# 테이블 이름 변경하기
ALTER TABLE member RENAME member1;

# 테이블 삭제하기
DROP TABLE test;

CREATE TABLE dept2(
deptno TINYINT PRIMARY KEY,
dname VARCHAR(15) DEFAULT '영업부',
loc CHAR(1) CHECK(loc IN('1','2'))
)

INSERT INTO dept2(deptno, dname, loc) VALUES (10,'관리부','1');
INSERT INTO dept2(deptno, dname, loc) VALUES (20,'관리부','2');
INSERT INTO dept2(deptno, loc) VALUES (30,'1');
INSERT INTO dept2(deptno) VALUES (40);
SELECT * FROM dept2;

CREATE TABLE dept3(
deptno TINYINT PRIMARY KEY,
dname VARCHAR(15) NOT NULL);

INSERT INTO dept3(deptno, dname) VALUES (10,'총무부');

CREATE TABLE emp2(
empno SMALLINT PRIMARY KEY,
ename VARCHAR(15) NOT NULL,
deptno TINYINT,
FOREIGN KEY(deptno) REFERENCES dept2(deptno)

);

INSERT INTO emp2(empno, ename, deptno) VALUES(1000,'kim',10);
INSERT INTO emp2(empno, ename, deptno) VALUES(2000,'lee',20);
# 외래키를 사용할때 부모테이블에 존재하는 정보를 사용해야 함
INSERT INTO emp2(empno, ename, deptno) VALUES(3000,'park',50);

# 칼럼 추가
ALTER TABLE dept3 ADD(loc CHAR(1));

DESC dept3;

# 컬럼이름수정
ALTER TABLE dept3 CHANGE loc location CHAR(2);
SELECT * FROM emp2;
DESC emp2;

CREATE TABLE dept4(
deptno TINYINT,
dname VARCHAR(15),
loc VARCHAR(15)
);

# 테이블 복사1
INSERT INTO dept4 SELECT * FROM dept;

# 테이블 복사2
CREATE TABLE dept5 AS SELECT * FROM dept;

# 테이블 구조만 복사
CREATE TABLE dept6 AS SELECT * FROM dept WHERE 1=2;
DESC dept6;
SELECT * FROM dept6;
