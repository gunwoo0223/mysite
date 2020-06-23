# mysite
toy project my site

사용될 기술<br>
백엔드: 스프링부트, JPA<br>
프론트엔드: Vue<br>
웹서버: 스프링부트 내장 Tomcat서버(WAS) + NginX(프론트용 웹서버) = 프론트엔드와 백엔드 서버를 따로 두어 관리 (서버를 독립적으로 두어 프론트를 여러개 운영하고 싶은 마음에..)
<br><br>
목표<br>
1. 최소한의 기능으로 aws서버 배포 및 운영<br>
2. 백엔드는 최대한 RESTFUL하게..<br>
3. 백엔드에 많은 기술 적용해보기..Redis,,MQ,,LocalCaching,,보안토큰(기본),,로깅(기본),,<br>
4. GitHub-JenKins연동으로 자동배포 해보기..<br>
5. 기능별로 api분리해서 Docker, 쿠버네티스, MSA 사용해보기<br>
<br><br>
<b>우선 1번만으로도 대만족할만한 기쁨을 누릴것 같다.. 화이팅</b>
<br><br>
1. Logback으로 로깅을 설정 해보았다. Exception이 예상되는 곳에 적어두도록 하자.
