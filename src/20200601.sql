SELECT * FROM emp;
SELECT * FROM dept;

# 커미션이  null이 아닌 사원의 이름, 인사일, 부서명 출력\
# 단 입사일은 2020년 11월 20일 형식으로 출력
SELECT ename 사원이름, date_format(hiredate,'%Y년 %m월 %d일') 인사일, DNAME 부서명
FROM emp, dept
WHERE comm IS NOT NULL AND emp.deptno=dept.DEPTNO;

# 부서명이 'accounting'인 사원의 이름, 입사일, 부서번호, 부서명
# 단 입사일은 2020년 11월 20일 형식으로 출력
SELECT ename 사원이름, date_format(hiredate,'%Y년 %m월 %d일') 입사일, dept.deptno 부서번호, DNAME 부서명
FRom emp, dept
WHERE dept.DEPTNO=emp.DEPTNO AND dname='accounting';

# 삽입
INSERT INTO emp(empno, ename, job,mgr,hiredate,sal,comm) VALUES(8001,'ERIC','CLERK',7900,'1983-02-25',500,NULL);
SELECT * FROM emp WHERE empno=8001;

# 사원번호, 부서번호, 부서명을 출력
# 단, 사원이 근무하지 않는 부서명도 같이 출력하기
SELECT empno 사원번호, emp.DEPTNO 부서번호, dname 부서명
FROM emp LEFT join dept
on dept.DEPTNO=emp.DEPTNO;

# emp 테이블과 dept 테이블을 조인하여 부서번호, 부서명, 이름, 급여 출력
SELECT emp.deptno 부서번호, dname 부서명, ename 이름, sal 급여
FROM emp , dept
where emp.deptno=dept.DEPTNO

# 사원의 이름이 'allen'인 사원의 이름과 부서명을 출력
SELECT ename 이름, dname 부서명
FROM emp join dept
on dept.deptno=emp.DEPTNO AND ename='allen';

# 모든 사원의 이름, 부서번호, 부서명, 급여를 출력
# 단, emp 테이블에 없는 부서도 출력
SELECT ename 이름, emp.deptno 부서번호, dname 부셔명, sal 급여
FROM emp LEFT JOIN dept
ON emp.deptno=dept.DEPTNO;

# 사원의 이름과 급여, 급여의 등급을 출력
SELECT ename 이름, sal 급여, grade 등급
FROM emp join salgrade
WHERE (sal BETWEEN losal AND hisal);

# 사원의 이름과 부서명, 급여의 등급을 출력
SELECT ename 이름, dname 부서명, grade 급여등급
FROM emp join salgrade join dept
WHERE (sal BETWEEN losal AND hisal) AND emp.deptno=dept.DEPTNO;

UPDATE emp SET sal=500 WHERE ename = 'eric';

# smith가 근무하는 부서명을 서브쿼리를 이용해서 출력
SELECT ename 사원이름, dname 부서명
FROM emp, dept
WHERE dept.DEPTNO=emp.DEPTNO AND ename='smith';
# subquery를 사용하여 출력
SELECT dname 부서명
FROM dept
WHERE deptno=(SELECT deptno FROM emp WHERE ename='smith');

# allen 과 같은 부서에서 근무하는 사원의 이름과 부서의 번호를출력
SELECT ename 사원이름, deptno 부서번호
FROM emp
WHERE deptno = (SELECT deptno FROM emp WHERE ename='allen');

# 'allen'과 동일한 직책을 가진 사원의 사번과 이름, 직책 출력
SELECT empno 사번, ename 이름, job 직책
FROM emp
WHERE job=(SELECT job FROM emp WHERE ename='allen');

# 'allen'의 급여와 동일하거나 더 많이 받는 사원의 이름과 급여를 출력
SELECT ename 이름, sal 급여
FROM emp
WHERE sal >=(SELECT sal FROM emp WHERE ename='allen');

# 'DALLAS'에서 근무하는 사원의 이름, 부서번호 
SELECT ename 사원이름, deptno 부서번호
FROM emp
WHERE deptno=(SELECT deptno FROM dept WHERE loc='dallas');

# 'sales'부서에서 근무하는 모든 사원의 이름과 급여 출력
SELECT ename 이름, sal 급여
FROM emp
WHERE deptno=(SELECT deptno FROM dept WHERE dname='sales');

# 자신의 직속상관이 king인 사원의 이름과 급여를 출력
SELECT ename 이름, sal 급여
FROM emp
WHERE mgr=(SELECT empno FROM emp WHERE ename='king');

# 직업이 'salesman'인사람의 사원번호와 직업을 출력
SELECT empno 사원번호, job 직업
FROM emp
WHERE job='salesman';