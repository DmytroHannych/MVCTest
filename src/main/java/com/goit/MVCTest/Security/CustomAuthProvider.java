package com.goit.MVCTest.Security;

//@Service
//@RequiredArgsConstructor
//public class CustomAuthProvider implements AuthenticationProvider {
//    private final CustomUserDetailsService userDetailsService;
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//
//        UserDetails user = userDetailsService.loadUserByUsername(username);
//        return new UsernamePasswordAuthenticationToken(user,password);
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(aClass);
//    }
//
//    private Authentication checkPassword(UserDetails user, String rawPassword){
//        if(Objects.equals(rawPassword, user.getPassword())){
//         org.springframework.security.core.userdetails.User innerUser = new User(
//                 user.getUsername(),
//                 user.getPassword(),
//                 user.getAuthorities()
//         );
//            return new UsernamePasswordAuthenticationToken(innerUser,user.getPassword(),user.getAuthorities());
//        }
//        throw  new BadCredentialsException("Bad password");
//    }
//}
