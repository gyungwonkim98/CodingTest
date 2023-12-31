-- 코드를 입력하세요
SELECT ANIMAL_ID , NAME
FROM(
    SELECT 
        AI.ANIMAL_ID, AI.NAME, AO.DATETIME-AI.DATETIME 
    FROM ANIMAL_INS AI 
    INNER JOIN ANIMAL_OUTS AO
        ON AI.ANIMAL_ID = AO.ANIMAL_ID
    ORDER BY 3 DESC
)
FETCH FIRST 2 ROWS ONLY;