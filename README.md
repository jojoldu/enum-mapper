
**JobType.class**

```
public enum JobType implements EnumMapperType {
    STUDENT("학생"),
    ENGINEER("엔지니어"),
    DOCTOR("의사"),
    DRIVER("운전사");

    private String title;

    JobType(String title) {
        this.title = title;
    }

    @Override
    public String getCode() {
        return name();
    }

    @Override
    public String getTitle() {
        return title;
    }
}
```

> getCode와 getTitle을 원하는 값으로 override    
여기서는 enum의 name을 code값으로, title 멤버변수를 title로 지정

![Test1](./images/test1.png)

![Test2](./images/test2.png)