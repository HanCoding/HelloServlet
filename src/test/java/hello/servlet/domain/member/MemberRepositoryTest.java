package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    public void memberStoreTest() {
        // given
        Member member = new Member("memberA", 20);

        // when
        Member savedMember = memberRepository.save(member);

        // then
        Member byId = memberRepository.findById(savedMember.getId());
        Assertions.assertThat(byId).isEqualTo(savedMember);
    }
}