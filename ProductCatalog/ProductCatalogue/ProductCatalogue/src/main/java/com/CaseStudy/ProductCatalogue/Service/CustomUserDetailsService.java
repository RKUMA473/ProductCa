package com.CaseStudy.ProductCatalogue.Service;

import com.CaseStudy.ProductCatalogue.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=repository.findByUsername(username);
        if(user!=null){
            CustomUserDetails userDetails = new CustomUserDetails();
            userDetails.setUser(user);
        }else{
            throw new UsernameNotFoundException("User not exist with name: "+ username);
        }
        return null;
    }
}
