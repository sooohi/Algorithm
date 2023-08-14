# 백준 1152, 10989, 2675문제 풀이

## 1152 - 단어의 개수
- BufferedReader을 사용
- StringTokenizer을 사용해 " "을 기준으로 자름
- countTokens()은 StringTokenizer의 남아있는 토큰 갯수를 반환
####
- buffer을 사용하지 않고, 입력받은 문자열이 공백이면 cnt++해주는 방식으로 구현. -> 이것보다 BufferedReader을 이용하는 것이 더 효율적

## 10989 - 수 정렬하기 3
- BufferedReader을 사용해 시간 단축
- Arrays.sort 이용해 정렬
- print(arr[i])가 아닌 sb.append로 한번에 출력
####
- 런타임에러, 틀림, 시간 초과 등 다양한 오류 발생 
- 정렬 방법 간단하게 2가지(컬랙션과 배열) 공부

## 2675 - 문자열 반복
- 문자열로 받고 split메소드 이용해서 공백 기준으로 자름
- 위에서 자른 문자열을 또 한 글자씩 잘라 str에 넣음
- s[1]의 길이만큼 반복하며 r의 갯수만큼 문자 반복 출력