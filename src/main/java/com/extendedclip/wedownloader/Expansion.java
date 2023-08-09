package com.extendedclip.wedownloader;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class Expansion extends PlaceholderExpansion {

    @Override
    public @NotNull String getIdentifier() {
        return "wedownloader";
    }

    @Override
    public @NotNull String getAuthor() {
        return "HydraStudio";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(@Nullable Player player, @NotNull String identifier) {
        if (identifier.equals("version"))
            return getVersion();

        if (identifier.equals("author"))
            return getAuthor();

        if (identifier.equals("name"))
            return getIdentifier();

        return null;
    }
}
