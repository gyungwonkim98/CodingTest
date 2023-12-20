-- 코드를 입력하세요

-- Oracle에서 0시부터 24시까지의 시간을 열로 나열하려면 CONNECT BY 절을 사용하여 시간을 생성하고, 
-- 그에 따른 LEVEL 값을 활용할 수 있습니다.
-- SELECT TO_CHAR(TRUNC(SYSDATE) + (LEVEL - 1)/24, 'HH24:MI:SS') AS hour
-- FROM dual
-- CONNECT BY LEVEL <= 25;


SELECT TO_NUMBER(A.HOUR) AS HOUR, NVL(B.COUNT,0) AS COUNT 
FROM (
    SELECT TO_CHAR(TRUNC(SYSDATE) + (LEVEL - 1)/24, 'HH24') AS hour
    FROM dual
    CONNECT BY LEVEL <= 24
) A 
LEFT JOIN (
    SELECT HOUR, COUNT(*) AS COUNT FROM (
        SELECT 
            TO_CHAR(DATETIME, 'HH24') AS HOUR
            FROM ANIMAL_OUTS 
        )
    GROUP BY HOUR
    ORDER BY HOUR
) B ON A.HOUR = B.HOUR
ORDER BY A.HOUR


