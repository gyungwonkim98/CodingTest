-- 대소문자 구분 없이 검색하는 방법은
-- 검색 대상과 검색어를 모두 대문자 or 소문자로 통일시켜 검색
-- UPPER() || LOWER()

-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS 
WHERE ANIMAL_TYPE = 'Dog'
AND UPPER(NAME) LIKE UPPER('%el%')
ORDER BY NAME