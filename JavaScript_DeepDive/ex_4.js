/*예제 04 2 ~ 3*/
var userdId = 1;
var userName = 'LEE';

var user = {id: 1, name: 'LEE' };

var users = [
    {id: 1, name: 'LEE'},
    {id: 2, name: 'Kim'}
]

var result = 10 + 20;

/*예제 04 4 ~ 8*/
var score; //변수 선언  

var score; //변수선언
score = 80; // 값을 할당

var score = 80; // 변수 선언과 동시에 값 할당, 단축하여 적었다 해도 자바스크립트 엔진은 2개의 문으로 나누어 각각 실행

console.log(score); // 변수 선언 but undefined 상태
var score; // 변수선언, 변수 호이스팅됨
score = 80; // 값 할당
console.log(score); //80

/*예제 04 12 ~ 15*/
var person, $elem, _name, first_name, val1;

var fisrt-name; // (-) 사용불가
var 1st; // 숫자로 시작 불가
var this; // 예약어 사용 불가

// 셋 다 각각 별개의 변수임
var firstname;
var firstName;
var FIRSTNAME;

/*예제 4-18*/
var firstName; //카멜케이스
var first_name; //스네이크케이스
var FirstNmae; // 파스칼케이스
// 헝가리언 케이스
var strFirtName //변수타입+식별자
var $elem = document.getElementById('myId'); //DOM 노드
var observable$ = FormEvent(document, 'click'); //RxJS 옵저버블
