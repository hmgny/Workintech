package com.workintech.s19d2.service;

import com.workintech.s19d2.entity.Account;
import com.workintech.s19d2.entity.Member;
import com.workintech.s19d2.entity.Role;
import com.workintech.s19d2.repository.MemberRepository;
import com.workintech.s19d2.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthenticationService {

    public static final String ROLE_USER="USER";
    public static final String ROLE_ADMIN = "ADMIN";
    private final MemberRepository memberRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public Member register(String email, String password){
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        if(optionalMember.isPresent()){
            throw new RuntimeException("User with given email already exists! Email: " + email);
        }

        List<Role> roleList =new ArrayList<>();
        addRoleUser(roleList);

        Member member = new Member();
        member.setEmail(email);
        String encodedPassword = passwordEncoder.encode(password);
        member.setPassword(encodedPassword);
        member.setRoles(roleList);
        return memberRepository.save(member);
    }

    private void addRoleAdmin(List<Role> roleList) {
        Optional<Role> roleAdmin = roleRepository.findByAuthority(ROLE_ADMIN);
        Role roleAdminEntity;

        if (!roleAdmin.isPresent()) {
            roleAdminEntity = new Role();
            roleAdminEntity.setAuthority(ROLE_ADMIN);
            roleAdminEntity = roleRepository.save(roleAdminEntity);
        } else {
            roleAdminEntity = roleAdmin.get();
        }

        if (roleAdminEntity != null) {
            roleList.add(roleAdminEntity);
        }
    }

    private void addRoleUser(List<Role> roleList) {
        Optional<Role> roleUser = roleRepository.findByAuthority(ROLE_USER);
        Role roleUserEntity;

        if (!roleUser.isPresent()) {
            roleUserEntity = new Role();
            roleUserEntity.setAuthority(ROLE_USER);
            roleUserEntity = roleRepository.save(roleUserEntity);
        } else {
            roleUserEntity = roleUser.get();
        }

        if (roleUserEntity != null) {
            roleList.add(roleUserEntity);
        }
    }



}
