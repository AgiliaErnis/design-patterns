package com.company.strategy.challenge;

import com.company.strategy.challenge.cameraapp.BasicCameraApp;
import com.company.strategy.challenge.cameraapp.CameraPlusApp;
import com.company.strategy.challenge.share.ShareSocialMedia;
import com.company.strategy.challenge.share.ShareText;

public class CameraAppDemo {
    public static void main(String[] args) {
        BasicCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.setShare(new ShareSocialMedia());
        basicCameraApp.getShare().share();
        basicCameraApp.setShare(new ShareText());
        basicCameraApp.getShare().share();
        basicCameraApp.edit();

        CameraPlusApp cameraPlusApp = new CameraPlusApp();
        cameraPlusApp.setShare(new ShareSocialMedia());
        cameraPlusApp.getShare().share();
        cameraPlusApp.setShare(new ShareText());
        cameraPlusApp.getShare().share();
        cameraPlusApp.edit();
    }
}
