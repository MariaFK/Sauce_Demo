package testData;

import models.LoginLombokModel;

public class LoginData {

    private static String password = "secret_sauce";

    public static LoginLombokModel loginStandartUser(){
        return LoginLombokModel.builder().username("standard_user").password(password).build();

    }

    public static LoginLombokModel loginLockedUser(){
        return LoginLombokModel.builder().username("locked_out_user").password(password).build();

    }

    public static LoginLombokModel loginProblemUser(){
        return LoginLombokModel.builder().username("problem_user").password(password).build();

    }

    public static LoginLombokModel loginPerfomanceGlitchUser(){
        return LoginLombokModel.builder().username("performance_glitch_user").password(password).build();

    }
}
