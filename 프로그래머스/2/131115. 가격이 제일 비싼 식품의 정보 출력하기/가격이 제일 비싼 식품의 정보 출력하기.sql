-- MYSQL 이라면 MAX에 LIMIT1 쓰면 될듯하지만,
-- 오라클에는 LIMIT가 존재하지 않아, 서브쿼리를 통해 도출해야 할 것으로 보임.
---------------------------------------------------------------------------
-- Oracle 데이터베이스에서 최대값을 가진 행을 가져오는 방법은 여러 가지가 있습니다. 아래는 그 중 일부 방법입니다.

-- 1) 서브쿼리와 ORDER BY:
-- SELECT *
-- FROM your_table
-- ORDER BY your_column DESC
-- FETCH FIRST 1 ROW ONLY;
-- 이 쿼리는 특정 열을 기준으로 내림차순으로 정렬하고, 가장 상단의 행만 가져옵니다.

-- 2) 서브쿼리와 MAX 함수:
-- SELECT *
-- FROM your_table
-- WHERE your_column = (SELECT MAX(your_column) FROM your_table);
-- 이 방법은 서브쿼리를 사용하여 최대값을 찾고, 해당 최대값과 일치하는 행을 선택합니다.

-- 3) RANK() 함수 사용:
-- SELECT *
-- FROM (
--    SELECT 
--       your_column, 
--       RANK() OVER (ORDER BY your_column DESC) AS rnk
--    FROM your_table
-- )
-- WHERE rnk = 1;
-- RANK() 함수를 사용하여 각 행에 순위를 할당하고, 그 중 순위가 1인 행을 선택합니다.
---------------------------------------------------------------------------
-- 코드를 입력하세요
SELECT * FROM FOOD_PRODUCT
ORDER BY PRICE DESC
FETCH FIRST 1 ROW ONLY;