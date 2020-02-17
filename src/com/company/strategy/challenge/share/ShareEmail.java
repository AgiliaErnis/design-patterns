package com.company.strategy.challenge.share;

import com.company.strategy.challenge.Share;

public class ShareEmail implements Share {
    @Override
    public void share() {
        System.out.println("Shared by email");
    }
}
