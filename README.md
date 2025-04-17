2025_1 JAVA Programing(OOP) 
---
### 새로운 환경에서 실행할때
    폴더를 만들고 해당 폴더에서 프로젝트를 github에 있는 폴더명과 똑같이 하면 된다.
    week01프로젝트가 github에 있을때 이것을 git clone하여 로컬 폴더에 저장한뒤 이클립스에선 week01프로젝트를 찾지 못한다.
    그럴때 새 프로젝트를 생성하는데, 이름을 week01로 하면 이클립스가 week01폴더를 인식해서 기존 프로젝트를 이어갈 수 있다.

## eclipse ver.2023-12 단축키
```
실행 : ctrl + F11
디버깅 : F11
디버깅시 한줄씩 실행 : F6
들여쓰기 정리 : ctrl + shift + F
라인 복사 : ctrl + alt + UP/DOWN 
한줄 삭제 : ctrl + D
한줄 주석 : ctrl + /
활성화 탭 한번에 삭제 : 탭 우클릭 후 삭제
다중선택 : alt + 클릭시 커서 생김.

```
week03
---
5 < 3 && 3 > 5

3 > 5 는 연산 안됨.

5 < 3 & 3 > 5 는 연산 됨.

~ tild연산자 비트반전. -(x+1) 
1의 보수 = ~
1의보수 = 2의보수 - 1(2의보수 = x의 음수)
왜냐? ``2의보수 = 1의보수 + 1``

즉 2의보수로 음수표현할때 사용.
원본 값의 음수값을 알고싶다면 +1 해주면 됨.

x = 5일떄
~x = -6

-~x = 6
~-x = 4


week04
---

pass

week06
---
### String 클래스의 메소드들
- ``char charAt(index)`` : index에 해당하는 char 리턴
- ``String replace(oldstr, newstr)`` : oldstr을 newstr로 바꾼 String 반환
- ``String substring(startindex, endindex)`` : startindex부터 endindex까지. (endindex직전까지)
- ``int indexOf(String)`` : 파라미터와 일치하는 문자열이 존재하면 해당 문자열의 시작인덱스 반환, 없으면 -1
- ``String[] split(String)`` : 파라미터를 기준으로 문자열을 나눠서 배열로 반환. 기준이 되는 문자열은 삭제됨.
- **String 클래스의 필드** ``int length`` : 문자열 길이 반환

### ArrayList 클래스의 메소드들
    ``Array``는 배열 이라고 불린다. List와 Array는 다르다. List를 배열(Array)과 혼동하지 말자. 
    ArrayList 클래스는 List 컬렉션에 속해있는 클래스다.
    Array의 인덱스접근 방식과 동적 크기를 합친 개념이다.

- ``int size()`` : 데이터 개수 출력
- ``void set(index, Object)`` : index의 값을 Object로 수정함.
- ``object remove(index)`` : index를 넣으면 해당 index를 삭제하고 값 반환
- ``void clear()`` : 값 전체 삭제
- ``boolean contains(Object)`` : Object가 있으면 true, 없으면 false
- ``int indexOf(Object)`` : Object가 있으면 index출력, 없으면 -1
- ``boolean isEmpty()`` : 비어있다면 true, 값이있다면 false

week07
---
- 클래스 생성시 파일명과 클래스명이 동일해야한다.
- 소스파일에 파일명과 동일한 클래스는 반드시 public이다.
- 하나의 소스파일안에 2개이상의 클래스를 만들 수 있다.
