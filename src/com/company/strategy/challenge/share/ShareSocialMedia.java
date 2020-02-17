package com.company.strategy.challenge.share;

import com.company.strategy.challenge.Share;

public class ShareSocialMedia implements Share {
    @Override
    public void share() {
        System.out.println("Shared on Social Media");
    }
}
