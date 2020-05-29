# emp테이블 출력
DESC emp;

# emp테이블에서 사원번호, 사원이름, 직업을 출력
SELECT empno, ename, job 
FROM emp;

# empㅌ[이블에서 사원번호, 급여, 부서번호를 출력 단, 급여가 많은 순서로 출력
SELECT empno, sal, DEPTNO 
FROM emp 
ORDER BY sal DESC;

# emp 테이블에서 사원번호 , 급여, 입사일을 출력, 단, 급여가 적은 순서대로
SELECT empno, sal, hiredate 
FROM emp 
ORDER BY sal;

# emp테이블에서 직업, 급여를 출력. 단, 직업명으로 오름차순, 급여로 내림차순
SELECT job, sal 
FROM emp 
ORDER BY job ASC, sal DESC;

# 칼럼에 별칭 붙이기
SELECT empno AS "사원번호", ename AS "사원이름" 
FROM emp;

# emp테이블에서 부서번호가 10번인 사원들의 급여를 출력하되 10%인상된 금액으로 출력하기
SELECT sal+sal*1/10 
FROM emp 
WHERE deptno=10;

# emp테이블에서 부서번호가 10번인 사원들의 부서번호와 급여와 급여+커미션을 출력
SELECT deptno 부서번호, sal 급여, sal+ifnull(comm,0) "급여+커미션"
FROM emp
WHERE deptno=10;

# emp테이블에서 급여가 3000이상인 사원들의 모든 정보 출력하기
SELECT * 
FROM emp 
WHERE sal>=3000;

# emp테이블에서 부서번호가 30번이 아닌 사람들의 이름과 부서번호 출력
SELECT ename AS "이름", deptno AS "부서번호" 
FROM emp 
WHERE deptno!=30;

# emp테이블에서 부서번호가 10번이고 급여가 3000이상인 사원들의 이름과 급여를 출력
SELECT ename AS "사원이름", sal AS "급여" 
FROM emp
WHERE deptno=10 AND sal>=3000;

# emp테이블에서 직업이 salesman이거나 manager인 사원의 사원번호와 부서번호 출력
SELECT empno AS "사원번호", deptno AS "부서번호", job AS '직업'
FROM emp
WHERE job="salesman" OR job="manager"
ORDER BY empno DESC;

# UNION ALL
SELECT empno,deptno, job
FROM emp
WHERE job ='salesman'
UNION ALL
SELECT empno, deptno, job
FROM emp
WHERE job = 'manager';

# emp테이블에서 부서번호가 10번이거나 20번인 사원의 사원번호와 이름, 부서번호 출력
SELECT empno 사원번호, ename 이름, deptno 부서번호
FROM emp
WHERE deptno=20 OR deptno=10;

# in 연산자 사용
SELECT empno 사원번호, ename 이름, deptno 부서번호
FROM emp
WHERE deptno IN(10,20);

# emp테이블에서 급여가 1000과 2000사이인 사원들의 사원번호, 이름, 급여를 출력
SELECT empno 사원번호, ename 이름, sal 급여
FROM emp
WHERE sal>=1000 AND sal<=2000;

# between 함수 사용
SELECT empno 사원번호, ename 이름, sal 급여
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

# 사원이름이 'ford'와 'scott'사이의 사원들의 사원번호, 이름 출력
SELECT empno 사원번호, ename 이름
FROM emp
WHERE ename BETWEEN 'ford' AND 'scott';

# 사원이름이 'J'로 시작하는 사원의 사원이름과 부서번호 출력
SELECT ename 사원이름, deptno 부서번호
FROM emp
WHERE ename LIKE 'J%';

# 사원의 이름이 'J'를 포함하는 사원의 사원이름과 부서번호 출력
SELECT ename 사원이름, empno 부서번호
FROM emp
WHERE ename LIKE '%J%';

# 사원의 두번째 글자가 'A'인 사원의 이름, 급여,입사일 출력
SELECT ename 사원이름, sal 급여, hiredate 입사일
FROM emp
WHERE ename LIKE '_A%';

# 사원 이름이 'ES'로 끝나는 사원의 이름, 급여, 입사일 출력
SELECT ename 사원이름, sal 급여, hiredate 입사일
FROM emp
WHERE ename LIKE '%ES';

# 입사년도가 81인 사원들의 입사일과 사원번호 출력
SELECT hiredate FROM emp;
SELECT hiredate 입사일, empno 사원번호
FROM emp
WHERE hiredate LIKE "1981%";

# 커미션 null인 사원의 사원이름과 커미션 출력
SELECT ename 사원이름, comm 커미션
FROM emp
WHERE comm IS NULL;

# 커미션이 null이 아닌 사원의 사원이름과 커미션을 출력
SELECT ename 사원이름, comm 커미션
FROM emp 
WHERE comm IS NOT NULL;

# 연결연산자
SELECT CONCAT(ename,"의 직업은 ",job,"입니다.")
FROM emp;

SELECT CONCAT(empno,"번호인 직원의 이름은",ename,"입니다")
FROM emp;

# 문자함수
# 아스키코드로 문자 출력하는 함수
SELECT CHAR(65);

# 문자열 연결함수
SELECT CONCAT(ename ,"님") 
FROM emp;

# 문자열을 소문자로 바꾸는 함수
SELECT LOWER(ename) 이름
FROM emp;

# 문자열을 대문자로 바꾸는 함수
SELECT UPPER(ename) 이름
FROM emp;

# 남은자리 정해진 문자로 채우는 함수
# 왼쪽에서 채움
SELECT LPAD('hi',10,'*');
#오른쪽에서 채움
SELECT RPAD('hi',10,'*');
SELECT LPAD(ename,10,"*")
FROM emp;

# 문자열의 길이를 출력하는 함수(length(), char_lenght())
SELECT LENGTH('국어');
SELECT CHAR_LENGTH('국어');

SELECT ename 이름, LENGTH(ename) 이름길이,CHAR_LENGTH(ename)
FROM emp;

# 문자열 자르기
# 왼쪽에서 n번째 까지만 출력(left(문자열,n))
SELECT LEFT('abcd',3);

SELECT LEFT(ename,2)
FROM emp;
# 오른쪽에서 n번째 까지만 출력((right(문자열, n))
SELECT RIGHT('abcd',3);#bcd
#문자열 중간에서 자르기. 문자열 왼쪽에서 n번째 자리에서부터 m개 출력 (substring(문자열,n,m))
SELECT SUBSTRING('abcde',2,2); #bc

# 천단위로 ,를 표시하고 반올림할 소수점의 자리수를 표현
SELECT FORMAT(12345.2345567,1);
SELECT ename,NUL(comm,0) FROM emp;

# 숫자함수
# 절대값 출력
SELECT ABS(-3.444);
SELECT ABS(-10);

# 올림(정수))
SELECT CEIL(1.346246);

# 내림(정수))
SELECT FLOOR(23.466);

# 반올림(숫자자리수+1의 위치에서 반올림)
SELECT ROUND(3.452452,2);

# 나머지 구하기
SELECT MOD(10,3);

# 숫자를 지정한 소숫점 자리수 만큼만 자르기
SELECT TRUNCATE(11111.22292222,3);

#날짜함수
# 현재 날짜, 시간(시:분:초))
SELECT NOW();

# 현재 날짜 +2
SELECT ADDDATE(NOW(),INTERVAL 2 DAY);

# 현재 시간 -2
SELECT SUBDATE(NOW(),INTERVAL 2 HOUR);

# 현재  날짜만 출력
SELECT CURDATE();

# 현재 시간만 출력
SELECT CURTIME();

#
SELECT DATEDIFF('2018-04-02','2018-03-01'); 

SELECT TIMESTAMPDIFF(HOUR,'2018-03-02','2018-04-01');

SELECT MAX(sal) 
FROM emp;

SELECT MIN(sal) 최소
FROM emp;

SELECT COUNT(*) FROM emp;
SELECT empno FROM emp;

SELECT COUNT(ename)-1 FROM emp;

SELECT FORMAT(AVG(IFNULL(comm,0)),1) FROM emp;

SELECT CONVERT('1234',UNSIGNED)+1234;

SELECT STR_TO_DATE('2000-01-31','%Y-%m-%d');

SELECT DATE_FORMAT(NOW(), '%Y-%b-%d %p %h:%i:%s %W');

SELECT ename, RPAD(LEFT(ename,3),length(ename),'*')
FROM emp;

SELECT ename, comm, IFNULL(comm,0)
FROM emp; 
SELECT avg(comm) 
FROM emp; #550

SELECT truncate(avg(ifnull(comm,0)),2)
From emp;

# 부서별 급여의 총합을 구하시오
SELECT deptno, SUM(sal) 
FROM emp
GROUP BY deptno;

# 부서별 평균급여를 구하시오
SELECT deptno 부서, AVG(sal)평균급여
FROM emp
GROUP BY deptno; 

# 부서별 평균 급여를 구하시오(반올림해서 소수 첫째자리 까지만 구하기)
SELECT deptno 부서, round(AVG(sal),1) 평균급여
FROM emp
GROUP BY deptno;

# 직업별 최대 급여 구하시오
SELECT job 직업, MAX(sal)
FROM emp
GROUP BY job;

# 급여가 1000이상인 사원들의 부서별 평균 급여의 반올림 값을 부서별로 내림차순 정렬해 출력하시오
SELECT deptno 부서,round(AVG(sal),1) 평균급여
FROM emp
WHERE sal>=1000
GROUP BY deptno 
order by deptno DESC;

# 급여가 2000이상인 사원들의 부서별 평균 급여의 반올림 값을 평균 급여의 반올림 값으로 오름차순 정렬
SELECT deptno 부서, ROUND(AVG(sal)) 평균급여
FROM emp
WHERE sal>=2000
GROUP BY deptno
ORDER BY 평균급여 ASC;

# 각 부서별 같은 job을 하는 사람의 인원수를 구해서 부서번호, 업무, 인원수를 부서번호에 대해서 오름차순
SELECT deptno 부서번호, job 업무, COUNT(job) 인원수
FROM emp 
GROUP BY deptno,job
ORDER BY deptno ASC;

# 급여가 1000 이상인 사원들의 부서별 평균 급여를 출력. 단, 부서별 평균 급여가 2000이상인 부서만 출력
SELECT deptno 부서, AVG(sal) 평균급여
FROM emp
WHERE sal>=1000
GROUP BY deptno
HAVING AVG(sal)>=2000;


# emp테이블의 모든 사원들이 이름, 부서번호, 부서명 출력
SELECT * FROM dept;

SELECT ename 사원이름, emp.DEPTNO 부서번호 ,DNAME 부서명
FROM emp, dept
WHERE emp.DEPTNO=dept.DEPTNO;

# EMP 테이블의 모든 사원들의 이름,부서번호,부서명을 출력(ANSI JOIN)
SELECT ename 사원이름, e.deptno 부서번호, dname
FROM emp e JOIN dept d
USING(deptno);

SELECT ename 사원이름, emp.deptno 부서번호, dname
FROM emp JOIN dept
ON emp.DEPTNO=dept.DEPTNO;

# 급여가 3000에서 5000사이의 사원이름과 부서명을 출력
SELECT ename 사원이름, dname 부서명
FROM emp JOIN dept
WHERE emp.DEPTNO=dept.DEPTNO AND sal BETWEEN 3000 AND 5000;

# 부서명이 'ACCOUNTING'인 사원의 이름, 입사일, 부서번호, 부서명을 출력
SELECT ename 사원이름,  hiredate 입사일, emp.deptno 부서번호, dname 부서명
FROM emp JOIN dept
WHERE emp.DEPTNO=dept.DEPTNO AND dept.DNAME='accounting';

# 커미션이 null이 아닌 사원의 이름, 입사일, 부서명을 출력
SELECT ename 사원이름, hiredate 입사일, dname 부서명
FROM emp, dept
WHERE emp.deptno=dept.DEPTNO
AND comm IS NOT NULL;


CREATE TABLE test(
id VARCHAR(50) PRIMARY KEY,
sdate DATETIME,
edate DATETIME
);

INSERT INTO test(id, sdate, edate) 
VALUES ('jk04115',NOW(),ADDDATE(NOW(),INTERVAL 31 DAY));


INSERT INTO test(id, sdate, edate) 
VALUES ('lje1101',NOW(),ADDDATE(NOW(),INTERVAL 30 DAY));


INSERT INTO test(id, sdate, edate) 
VALUES ('kpc',NOW(),ADDDATE(NOW(),INTERVAL 20 DAY));


INSERT INTO test(id, sdate, edate) 
VALUES ('nayeon',NOW(),ADDDATE(NOW(),INTERVAL 31 hour));

SELECT * FROM test;

SELECT NOW(), SUBDATE(NOW(), INTERVAL 21 HOUR);

SELECT id, DATEDIFF(edate,sdate) diff
FROM test;

# emp테이블과 dept테이블을 조인하여 부서번호, 부서명, 이름, 급여 출력
SELECT emp.deptno 부서번호, dname 부서명, ename 이름, sal 급여
FROM emp, dept
WHERE emp.DEPTNO=dept.DEPTNO;

# 사원이름이 'allen'인 사원의 부서명 출력
SELECT ename 사원이름, dname 부서명
FROM emp, dept
WHERE emp.DEPTNO=dept.DEPTNO AND ename='allen';

# 모든 사원의 이름, 부서번호, 부서명, 급여를 출력. 단, emp 테이블에 없는 부서도 출력하기
SELECT emp.ename 사원이름, emp.deptno 부서번호, dept.dname 부서명, emp.sal 급여
FROM emp LEFT join dept
on emp.DEPTNO=dept.DEPTNO;

# 사원번호, 부서번호, 부서명을 출력하세요. 단, 사원이 근무하지 않은 부서명도 같이 출력
SELECT empno 사원번호, emp.DEPTNO 부서번호, dname 부서명
FROM emp LEFT JOIN dept
ON emp.DEPTNO=dept.DEPTNO;

# 사원의 이름과 급여, 급여 등급 출력
SELECT ename 이름, sal 급여, GRADE 급여 등급
FROM emp, salgrade
WHERE sal BETWEEN losal AND hisal;

SELECT * FROM salgrade;

# 'smith'가 근무하는 부서명을 서브쿼리를 이용해서 출력
SELECT dname 부서명
FROM dept
WHERE deptno=(SELECT deptno FROM emp WHERE ename='smith');

SELECT ename 이름, dname 부서명
FROM emp, dept
WHERE emp.DEPTNO=dept.DEPTNO AND emp.ENAME='smith';

# 'allen'과 같은 부서에서 근무하는 사원의 이름과 부서의 번호 출력하기
SELECT ename 이름, deptno 부서번호
FROM emp
WHERE deptno=(SELECT deptno FROM emp WHERE ename='allen');

# allen 과 동일한 직책을 가진 사원의 사번과 이름, 직책을 출력
SELECT empno 사번, ename 이름, job
FROM emp
WHERE job=(SELECT job FROM emp WHERE job='allen');

# allen의 급여와 동일하거나 더 많이 바든 사원의 이름과 급여 출력
SELECT  ename 이름, sal 급여
FROM emp
WHERE sal>=(SELECT sal FROM emp WHERE ename='allen');

# dallas에서 근무하는 사원의 이름, 부서번호를 출력
SELECT ename 사원이름, deptno 부서번호
FROM emp
WHERE deptno=(SELECT deptno FROM dept WHERE loc='dallas');

# sales 부서에서 근무하는 모든 사원의 이름과 급여를 출력하기
SELECT ename 이름,  sal 급여
FROM emp
WHERE deptno=(SELECT deptno FROM dept WHERE dname='sales');

# 자신의 직속 상관이 'king'인 사원의 이름과 급여를 출력
SELECT ename 이름, sal 급여
FROM emp
WHERE MGR=(SELECT empno FROM emp WHERE ename='king');

# 급여를 3000이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의 이름과 급여, 부서번호를 출력
SELECT ename 이름, sal 급여, deptno 부서번호
FROM emp
WHERE deptno in(SELECT deptno FROM emp WHERE sal>=3000);

# in 연산자를 이용하여 부서별로 가장 급여를 많이 받는 사원의 사원번호, 급여, 부서번호 출력
SELECT empno 사원번호, sal 급여, deptno 부서번호
FROM emp
WHERE sal IN(SELECT MAX(sal) FROM emp GROUP BY deptno);

SELECT * FROM dept;
# 직책이 manager인 사원이 속한 부서의 부서번호와 부서명과 부서의 위치 출력
SELECT deptno 부서번호, dname 부서명, loc 부서위치
FROM dept
WHERE deptno IN(SELECT deptno FROM emp WHERE job='manager');

# 직책이 salesman보다 급여를 많이받는 사원들의 이름과 급여 출력(any)
SELECT ename 이름, sal 급여
FROM emp
WHERE sal >ANY(SELECT sal FROM emp WHERE job='salesman'); 

# emp 테이블에 사원 추가 하기
INSERT INTO emp(empno,ename,job,mgr) VALUES (8000,'최수만','방장',7900);
DELETE FROM emp WHERE empno='최수만';