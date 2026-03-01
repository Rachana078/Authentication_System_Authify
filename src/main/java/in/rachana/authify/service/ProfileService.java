package in.rachana.authify.service;

import in.rachana.authify.io.ProfileRequest;
import in.rachana.authify.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);
}
