# 백준 1152문제 풀이

## 1152 - 단어의 개수
- BufferedReader을 사용
- StringTokenizer을 사용해 " "을 기준으로 자름
- countTokens()은 StringTokenizer의 남아있는 토큰 갯수를 반환
####
- buffer을 사용하지 않고, 입력받은 문자열이 공백이면 cnt++해주는 방식으로 구현. -> 이것보다 BufferedReader을 이용하는 것이 더 효율적