## 1인 프로젝트
### 토스페이먼츠 API 기반의 결제 시스템 구축
- CI/CD 설정
  - Github Action, AWS CodeDeploy
  - .github/workflows/CI.yml & .github/workflows/CD.yml를 통해 CI/CD 설정
  - scripts/deploy.sh를 통해 AWS CodeDeploy 설정
  - https://techblogs.tistory.com/229
- Logback
  - src/main/resources/logback-spring.xml
  - 패턴 및 색상 지정
  - 기존에 콘솔에서만 확인 가능했던 로그를 파일에도 저장
    - 파일 크기에 따라 파일 분할
    - 파일 저장 기간이 30일 지나면 파일 삭제
  - 원래 default는 info 레벨까지만 찍는데 debug까지 찍도록 설정
    - error - warning - info - debug - trace
    - <logger lever = “”>
  - 멀티 프로필따라 설정
    - local, dev, stg, prod
    - 각 환경마다 로그 레벨 설정
  - https://techblogs.tistory.com/230
- Multi Profile
  - local, dev, stg, prod
  - 각 환경마다 DB 설정
  - https://techblogs.tistory.com/232
- Swagger
  - swagger 설정, config 파일 추가
  - controller나 dto에 특정 annotation 붙여서 swagger 설정 덧붙일 수 있음
  - http://localhost:8080/swagger-ui/index.html
  - https://techblogs.tistory.com/231
- 시스템 기능
  - 로그인 기능 개발
    - 이메일, 비밀번호 맞는지 확인해서 response entity로 각 httpstatuscode랑 msg 출력
  - 결제 API 개발
 
### 개념 학습
- Git Flow
  - https://techblogs.tistory.com/227
- 웹서버, WAS
  - https://techblogs.tistory.com/228
