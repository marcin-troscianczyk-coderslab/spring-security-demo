package pl.coderslab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.RoleEntity;
import pl.coderslab.entity.UserEntity;
import pl.coderslab.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        final UserEntity userEntity =
                userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found!"));

        return User.builder()
                .username(username)
                .password(userEntity.getPassword())
                .roles(prepareRoles(userEntity.getRoles()))
                .build();
    }

    private String[] prepareRoles(List<RoleEntity> roles) {

        return roles
                .stream()
                .map(RoleEntity::getName)
                .toArray(String[]::new);
    }
}
