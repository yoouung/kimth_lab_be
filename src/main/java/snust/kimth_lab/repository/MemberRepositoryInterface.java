package snust.kimth_lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import snust.kimth_lab.entity.Member;

public interface MemberRepositoryInterface extends JpaRepository<Member, Long> {
}
