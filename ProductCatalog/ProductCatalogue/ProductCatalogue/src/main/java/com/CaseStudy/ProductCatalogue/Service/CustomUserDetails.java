package com.CaseStudy.ProductCatalogue.Service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

@Getter
@Setter
public class CustomUserDetails  implements UserDetails {

    private User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return user.getRoles().stream().map(role->new SimpleGrantedAuthority("ROLE" + role))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword(){
        return user.getPassword();
    }

    @Override
    public String getUsername(){
        return null;
    }

    @Override
    public boolean isAccountNonExpired(){
        return false;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
