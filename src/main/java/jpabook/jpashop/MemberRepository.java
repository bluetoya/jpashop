package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
        // command와 쿼리 분리
        // 저장 후 리턴 값은 아이디만 조회하도록
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
