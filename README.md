# DI (Dependency Injection)

- Constructor 에서 필요로 하는 객체 파라미터를 외부에서 전달해 주는 것.
- Map 에서 특정 클래스의 인스턴스를 싱글턴으로 생성해서 보관하고 있다가 필요로 하는 생성자에 전달.
- 그 필요로 하는 생성자도 Map 에서 보관.
- 이 역할을 하는 것이 Spring Container 이다.