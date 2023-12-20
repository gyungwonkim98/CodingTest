-- 코드를 입력하세요
SELECT CART_ID
FROM (
    -- 예를 들어 장바구니에 Milk가 2개있을경우 제외하기 위해 group by 사용하여 중복제거
    SELECT
        CART_ID, NAME
    FROM CART_PRODUCTS 
    WHERE NAME IN ('Milk','Yogurt')
    GROUP BY CART_ID, NAME
)
GROUP BY CART_ID HAVING COUNT(*)>1
ORDER BY  CART_ID