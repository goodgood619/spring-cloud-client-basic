# Spring Cloud Config Client 기본

spring cloud client 관련 예제



출처 : [관련예제](https://yaboong.github.io/spring-cloud/2018/11/25/spring-cloud-config/)

문제 해결
1. resources/application.yml - No spring.config.import property 문제https://stackoverflow.com/questions/67507452/no-spring-config-import-property-has-been-defined  
결론 : pom.xml에 spring-cloud-starter-bootstrap을 추가하면됨  
   시도 1. VMOptions에 -Dspring.profiles.active 활성화 (실패)

---

# Spring Cloud Netflix Eureka Client

구축된 Eureka Server에 Client에서 Eureka서버를 등록하는 예제

git commit을 참고  
  
출처 : https://mr-spock.tistory.com/44
