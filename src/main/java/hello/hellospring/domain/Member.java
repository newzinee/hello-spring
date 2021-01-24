package hello.hellospring.domain;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2021/01/24
 */
public class Member {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
