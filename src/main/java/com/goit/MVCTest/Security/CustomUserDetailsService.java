//package com.goit.MVCTest.Security;
//
//import lombok.Builder;
//import lombok.Data;
//import lombok.RequiredArgsConstructor;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Map;
//
//@RequiredArgsConstructor
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//    private final NamedParameterJdbcTemplate jdbcTemplate;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserData userData = getById(username);
//        if (userData == null) {
//            throw new UsernameNotFoundException(username);
//        }
//        return new UserDetails() {
//            @Override
//            public Collection<? extends GrantedAuthority> getAuthorities() {
//                return Collections.singleton(new GrantedAuthority() {
//                    @Override
//                    public String getAuthority() {
//                        return userData.getRole();
//                    }
//                });
//            }
//
//            @Override
//            public String getPassword() {
//
//                return userData.getPassword();
//            }
//
//            @Override
//            public String getUsername() {
//                return username;
//            }
//
//            @Override
//            public boolean isAccountNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isAccountNonLocked() {
//                return true;
//            }
//
//            @Override
//            public boolean isCredentialsNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isEnabled() {
//                return true;
//            }
//        };
//    }
//
//    private UserData getById(String username){
//        String sql = "SELECT password, role FROM authe WHERE username = :username";
//        return jdbcTemplate.queryForObject(
//                sql,
//                Map.of(username,username),
//                UserData.class
//        );
//    }
//
//    @Builder
//    @Data
//    private static class UserData {
//        private String password;
//        private String role;
//    }
//}
