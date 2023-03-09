package pl.coderslab.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return User
                .builder()
                .username(username)
                .password("{bcrypt}$2a$12$J1rA0tGIbtXKK9Z.oyXDheyz2s9QDsfH77pJQ70RygvIehNJlRPzO")
                .roles("ADMIN", "USER")
                .build();
    }
}
