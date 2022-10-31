/*예제 6-01*/
var integer = 10;
var double = 10.0;
var negative = -20;
// 모두 숫자 타입

/*예제 6-02 */
var binary = 0b01000001; //2진수
var octal = 0o101; //8진수
var hex = 0x41; //16진수

/*예제 6-03 */
//숫자 타입은 모두 실수로 처리됨
console.log(1 == 1.0); //true

/*예제 6-04 */
console.log(10 /0 ); //infinity
console.log(10/-0); //-infinity
console.log(1 * 'String'); //NaN

/*예제 6-06*/
var string;
string = '작은따옴표';
string = "큰따옴표";
string = `백틱`;
string = "큰따옴표로 감싼 문자열 내의 '작은따옴표'는 문자열로 인식된다.";
string = '작은따옴표로 감싼 문자열 내의 "큰따옴표"는 문자열로 인식된다.';

/*예제 6-06*/
var template = `template literal`;
console.log(template);

/*예제 6-11 */
var template = `<ul>
    <li><a href="#">HOME</a></li>
</ul>`;

/*예제 6-13*/
var first = 'ung-mo';
var last = 'lee';
//ES6 표현식 삽입
console.log(`my name is ${first} ${last}.`);

/*예제 6-16*/
var foo = true;
console.log(foo); //true

/*예제 6-17*/
var foo;
console.log(foo); // undefined

/*예제 6-18*/
var foo = 'Lee';
foo = null; //foo변수에 대해 이전 참조 제거

/*예제 6-20*/
var key = Symbol('key');
console.log(typeof key); //symbol
var obj = {}; //객체 생성
oby[key]='value'; //프로퍼티 키 사용

/*예제 6-23*/
var foo;
console.log(typeof foo); //undefined
foo = 3;
console.log(typeof foo); //number
foo = 'Hello';
console.log(typeof foo); //String
foo = true;
console.log(typeof foo); //boolean
foo = null;
console.log(typeof foo); //object
foo = Symbol();
console.log(typeof foo); //symbol
foo = {};
console.log(typeof foo); //객체
foo = [];
console.log(typeof foo); //배열
foo = (){};
console.log(typeof foo); //함수