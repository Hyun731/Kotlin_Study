//컴파일 타임 상수 const/탑레벨 상수 이렇게 const를 붙이면 main 함수보다 먼저 만들어짐/이렇게 사용하면 성능상 우위를 가져올 수 있다고 함
const val n = 20
fun main() {
    //코틀린은 기본적으로 타입 추론이 있기 때문에 타입을 선언하지 않아도 됨
    var i = 10
    var name = "Gilhyun"
    var point = 1.0
    //하지만 타입을 명시적으로 선언하고 싶은 경우 아래와 같이 선언하면 됨
    //타입은 참조 타입을 가지고 있음
    var ii : Int = 0
    var name1 : String = "Gilhyun"
    var point2 : Double = 1.0

    //val은 상수임.
    val num = 20

    var iii = 10;
    var l = 10L;

    l = iii.toLong() //코틀린에서는 타입이 다르면 자신 보다 큰 타입이여도 값을 넣을 수 없음. 그래서 이 코드와 같이 타입 캐스팅을 명시해줘야함
    iii = l.toInt()

    var name2 = ""
    name = i.toString()

    var number = "10"
    var k = number.toInt() //이런 것도 가능함!
}