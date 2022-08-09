

package com.portfolio.charlystone.Security.Entity;

import java.util.Collection;

public class UsuarioPrincipal implements UserDetails{
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    
}
