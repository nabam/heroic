package com.spotify.heroic.shell;

import com.spotify.heroic.HeroicCore;

public abstract class AbstractShellTask implements ShellTask {
    @Override
    public void configure(HeroicCore.Builder builder) {
    }
}