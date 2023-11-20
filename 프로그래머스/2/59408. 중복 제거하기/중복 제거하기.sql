-- 코드를 입력하세요
-- 중복 제거된 모든 행의 개수를 구하려면 COUNT(DISTINCT column)을 사용
-- COUNT(DISTINCT your_column)은 해당 열에 대해 중복을 제거한 값을 세는 것이며, 결과로 중복이 제거된 행의 개수가 반환됩니다.


SELECT COUNT(DISTINCT NAME)
FROM ANIMAL_INS 
WHERE NAME IS NOT NULL
