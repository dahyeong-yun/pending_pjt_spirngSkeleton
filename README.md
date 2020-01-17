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



## Step 2.  Eclipse Setting

- utf-8
- Eclipse Market Place 
  - Memory Analyzer
  - STS
  

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
  
- `web.xml`

  - context configuration
    - 설정파일에 맞는 .xml 설정
  - context loader listener
  - dispatcher servlet 설정
    - 설정파일에 맞는 .xml 설정
  - filter(한글)

  ```
  
  ```
  

## Step 4. Database(Oracle)
- db jdbc
- spring-jdbc
- web.xml > applicationContext -> root-context.xml(datasource.xml)


## Step 5. Log(log4j)

- `pom.xml`에 maven 의존성 추가 
- `web.xml` 에 설정파일 경로 추가
	- source
		```xml
			<!-- log4j setting -->
			<context-param>
				<param-name>log4jConfigLocation</param-name>
				<param-value>/WEB-INF/config/log4j.xml</param-value>
			</context-param>
		```
	