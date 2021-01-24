package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2021/01/24
 */
class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    void afterEach() {
        repository.clearStore();
    }

    @Test
    void save() {
        final Member member = new Member();
        member.setName("spring");

        repository.save(member);

        final Member result = repository.findById(member.getId()).get();

        assertThat(member).isEqualTo(result);
    }

    @Test
    void findByName() {
        final Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        final Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        final Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    void findAll() {
        final Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        final Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        final List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
