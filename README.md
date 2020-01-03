# spring-skeleton

**Spring MVC Defalut Setting Project**

- IDE : eclipse

- Bulid tool : Maven

- JVM : Java 8

- WAS : Apache Tomcat 8.0

- Database : Oracle 11g

  

## Step 1. Setting Git

### 1.1 gitignore 설정

- 자동생성 서비스 : https://www.gitignore.io/



## Step 2.  Eclipse prepference

- utf-8

  

## Step 3. Maven Project

### 3.1 Project 생성
- groupId : 전체 프로젝트. 가장 상위
- artifactId : 모듈 별
- preference 설정
  - Java Bulid Path : JRE 설정
  - Java Compiler : JRE와 맞추기
  - Project Facet
     - Dynamic Web Module 
     - Java
     - Runtime
  

### 3.2 Spring MVC 입히기
- webapp directory 생성
  
  - WebContent를 src > main 하위로 이동 하고 webapp으로 변경
  - META-INF는 resource의 하위로 이동
  
- `pom.xml`
  
  ```xml
  
  ```
