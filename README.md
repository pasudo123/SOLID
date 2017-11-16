# SOLID
SOLID (Object-Oriented Design)
- 소프트웨어 설계를 보다 더 잘 이해하고 유연하게 유지보수 할 수 있도록 설계된 다섯가지 설계 원칙의 약칭이다.

객체 지향 프로그래밍의 5가지 SOLID 디자인 규칙의 예시가 포함.

자바 코드로 구현하였고, 
각 예시는 해당하는 원칙에 맞는 '좋은' 예시와 '나쁜' 예시가 존재.

************************************************************************
**S : Single Response Principle ( SRP )**
- a class should have only single responsibility.
- 작성된 클래스는 하나의 기능만을 가지며, 클래스가 제공하는 서비스는 해당되는 하나의 책임을 수행하는데 집중되어야 한다.

**O : Open / Close Principle ( OCP )**
- software entities … should be open for extension, but closed for modification.
- 소프트웨어 컴포넌트는 확장에 열려있어야 하지만, 수정 및 변경에는 닫혀이었야 한다.

**L : Liskov Substitution Principle ( LSP )**
- objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
- 서브 타입은 언제나 기반 타입으로 대체할 수 있어야 한다. 확장에 대한 인터페이스를 준수해야 한다.

**I : Interface Segregation Principle ( ISP )**
- many client-specific interfaces are better than one general-purpose interface.
- 다수의 클라이언트에 대한 특정한 인터페이스는 범용적인 인터페이스보다 우수하다.

**D : Dependency Inversion Principle ( DIP )**
- depend upon abstractions, [not] concretions.
- 구체화가 아닌, 추상화에 의존해야 한다.
************************************************************************

- reference 
1. https://github.com/mikeknep/SOLID
2. http://www.nextree.co.kr/p6960/

- Blog 
http://blog.naver.com/pasudo123/221139719457
