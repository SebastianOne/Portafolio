package com.rueda.main.controller;


import com.rueda.main.entity.AuthenticationRequest;
import com.rueda.main.entity.AuthenticationResponse;
import com.rueda.main.entity.Turno;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.jwt.UserSecurityService;
import com.rueda.main.service.ITurnoService;
import com.rueda.main.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/turnos")
@CrossOrigin(origins = "*")
public class TurnoController {

    @Autowired
    @Qualifier("TurnoService")
    private ITurnoService turnoService;


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserSecurityService userSecurityService;

    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
        }catch (BadCredentialsException e) {
            throw new Exception("Incorrect", e);
        }
        final UserDetails userDetails = userSecurityService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse((jwt)));
    };


    @GetMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<Turno>> readALl(){
        return new ResponseEntity<>(turnoService.readAll(), HttpStatus.OK);
    };

    @PostMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public  ResponseEntity<Turno> insert(@RequestBody Turno turno) throws IncompleteDataException {
        return new ResponseEntity<>(turnoService.insert(turno),HttpStatus.OK);
    };

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public  ResponseEntity<Boolean> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return new ResponseEntity<>(turnoService.delete(id),HttpStatus.OK);
    };

    @PutMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public  ResponseEntity<Boolean> update(@RequestBody Turno turno) throws IncompleteDataException, ResourceNotFoundException {
        return new ResponseEntity<>(turnoService.update(turno),HttpStatus.OK);
    };
















}
