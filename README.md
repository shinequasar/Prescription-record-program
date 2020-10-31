# 진료 처방전 기록 시스템(Prescription-record-program)
This is a assignment on Java practice. (2019년 2학년 1학기)
<br><br>

## 목차
1. 기능설계
    - 클래스 다이어그램
    - 유즈케이스(Use Case) 다이어그램
2. 프로젝트 개요
    - 의약품 등록
    - 질병, 처방의약품 관리
    - 환자 정보 관리
3. 인터페이스 및 클래스 목록
4. 구현결과

## 1. 기능설계

### 클래스 다이어그램
![111](https://user-images.githubusercontent.com/40741363/97786334-32993580-1bee-11eb-8895-7964e4dcbd4f.png)

### 유즈케이스(Use Case) 다이어그램
![222](https://user-images.githubusercontent.com/40741363/97786339-3c229d80-1bee-11eb-9f8a-9907122e6215.png)


## 2. 프로젝트 개요
■ 주제 :  진료 처방전 기록 시스템
<br><br>
## 1) 의약품 등록
소메뉴출력(1.등록, 2.검색, 3.목록, 4.삭제, 0.메인으로) -> 
#### 1-1) 의약품 등록
의약품명 입력 -> 제조일자 입력 -> 사용기한 입력 -> 등록됨

#### 1-2) 의약품 검색
검색할 의약품 명 입력 -> 검색결과 출력

#### 1-3) 의약품 목록
검색결과 출력

#### 1-4) 의약품 삭제
삭제할 의약품 명 입력 -> 삭제

#### 1-0) 메뉴창으로 되돌아가기
메뉴창으로 되돌아감

<br><br><br>
## 2) 질병, 처방의약품 관리
소메뉴출력(1.등록, 2.검색, 3.목록, 4.삭제, 0.메인으로) -> 
#### 2-1) 질병 등록
‘메인메뉴 1)’ 에서 입력한 의약품 목록출력 -> 질병 명 입력 -> 위험도 입력 -> 질환분류 입력 -> 처방의약 품명을 원하는 만큼 입력.(입력을 그만하고 싶으면 # 입력) -> 등록됨

#### 2-2) 질병 검색
검색할 질병 명 입력 -> 검색결과 출력

#### 2-3) 질병 목록
검색결과 출력

#### 2-4) 질병 삭제
삭제할 질병 명 입력 -> 삭제

#### 2-0) 메뉴 창으로 되돌아가기
메뉴 창으로 되돌아감

<br><br><br>
## 3) 환자 정보 관리
소메뉴출력(1.등록, 2.검색, 3.목록, 4.삭제, 0.메인으로) -> 
#### 3-1) 환자 등록
성함 입력 -> 병명 입력 -><br>
	1.  메뉴 2번의 질병 목록에 미리 등록되어 있으면? -> 나이, 성별, 주민등록번호, 형액형 입력 -> 등록됨<br>
	2.  등록되어 있지 않으면? -> **질병목록에 존재하지 않습니다. 등록을 먼저해주십시오. -> 처음으로<br>

#### 3-2) 환자 검색
검색할 환자 명 입력 -> 검색결과 출력

#### 3-3) 환자 목록
검색결과 출력

#### 3-4) 환자 삭제
삭제할 환자 명 입력 -> 삭제

#### 3-0) 메뉴 창으로 되돌아가기
메뉴 창으로 되돌아감

<br><br><br>
## 4) 진료 처방전 출력
소메뉴출력(1.생성, 2.검색, 3.목록, 4.삭제, 0.메인페이지로) -> 
#### 3-1) 진료처방전 생성
- 처방전을 생성할 환자이름 입력<br>
  	 1.  메뉴 3번의 환자 목록에 미리 등록되어 있으면?<br>
     담당의사, 처방일수 입력 -> 진료처방전 생성(그동안 저장된 약품, 질병, 환자정보가 모두 양식에 맞게 출력되며, 질환의 분류에 따라 알맞은 종류의 주의사항이 파일입출력으로 출력)
  	<br><br> 2.  등록되어 있지 않으면? <br>
     **환자 목록에 존재하지 않습니다. 등록을 먼저해주십시오. -> 처음으로

#### 3-2) 진료처방전 검색
검색할 환자 명 입력 -> 검색결과 출력

#### 3-3) 진료처방전 목록
검색결과 출력

#### 3-4) 진료처방전 삭제
삭제할 환자 명 입력 -> 삭제

#### 3-0) 메뉴 창으로 되돌아가기
메뉴 창으로 되돌아감

0) 프로그램 종료
프로그램을 종료합니다.<br><br><br>


## 인터페이스 및 클래스 목록
![333](https://user-images.githubusercontent.com/40741363/97787569-7c861980-1bf6-11eb-82ca-edf1371125e7.PNG)
![444](https://user-images.githubusercontent.com/40741363/97787570-7db74680-1bf6-11eb-92cf-ab534f4c9b92.PNG)
![555](https://user-images.githubusercontent.com/40741363/97787571-7e4fdd00-1bf6-11eb-9830-e7d2b7229813.PNG)
![666](https://user-images.githubusercontent.com/40741363/97787572-7ee87380-1bf6-11eb-8ba3-c782e4eb1275.PNG)

<br><br><br>
## 구현결과인터페이스 및 클래스 목록
![777](https://user-images.githubusercontent.com/40741363/97787574-7f810a00-1bf6-11eb-95d7-3197c72968c6.PNG)
![888](https://user-images.githubusercontent.com/40741363/97787577-80b23700-1bf6-11eb-8268-64951ef24a27.PNG)
![999](https://user-images.githubusercontent.com/40741363/97787578-81e36400-1bf6-11eb-86fb-3c9a435c0a27.PNG)
![1010](https://user-images.githubusercontent.com/40741363/97787580-83ad2780-1bf6-11eb-8d7f-44543999b0c7.PNG)
![1111](https://user-images.githubusercontent.com/40741363/97787582-8576eb00-1bf6-11eb-8ac6-7d6eae34a8bf.PNG)
![1212](https://user-images.githubusercontent.com/40741363/97787583-86a81800-1bf6-11eb-9092-327a622cdbf6.PNG)
![1313](https://user-images.githubusercontent.com/40741363/97787593-9889bb00-1bf6-11eb-81c8-cae9165aeac4.PNG)
![1414](https://user-images.githubusercontent.com/40741363/97787595-99bae800-1bf6-11eb-93fc-0f9c820305ee.PNG)




