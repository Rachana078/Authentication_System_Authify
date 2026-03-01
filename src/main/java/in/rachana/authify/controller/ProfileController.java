package in.rachana.authify.controller;

import in.rachana.authify.io.ProfileRequest;
import in.rachana.authify.io.ProfileResponse;
import in.rachana.authify.service.ProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse register(@Valid @RequestBody ProfileRequest request) {
        ProfileResponse response = profileService.createProfile(request);
        //TODO: send welcome email
        return response;
    }
}
