-- 코드를 입력하세요
SELECT 
    MEM.MEMBER_NAME
    ,RE.REVIEW_TEXT
    ,TO_CHAR(RE.REVIEW_DATE,'YYYY-MM-DD')MEMBER_NAME
FROM REST_REVIEW RE
LEFT JOIN MEMBER_PROFILE MEM ON RE.MEMBER_ID = MEM.MEMBER_ID
WHERE MEM.MEMBER_ID = (
     SELECT 
        MEMBER_ID
    FROM REST_REVIEW 
    GROUP BY MEMBER_ID
    ORDER BY COUNT(*) DESC
    FETCH FIRST 1 ROW ONLY
)
ORDER BY RE.REVIEW_DATE, RE.REVIEW_TEXT;



   