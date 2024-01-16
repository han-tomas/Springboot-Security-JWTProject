package com.example.springjwt.repository;

import com.example.springjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    /*JpaRepository는 두가지 인자를 받는데,
    첫번째는 Repository가 해당 하는 Entity
    두번째는 Entity Id값의 Type(Reference Type ex. Integer)
    # ddl-auto=create설정을 통해 스프링 부트 Entity 클래스 기반으로 테이블이 자동 생성된다.
    # ddl-auto=none -> application을 실행해주고 다시 none으로 설정해주어야 한다 => 기존에 있던걸 삭제시키고 재 생성하기 때문에
    */
    Boolean existsByUsername(String username); //existByUsername => username이 DB에 존재 하는지 않하는지
}
