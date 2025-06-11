package fr.theshark34.openlauncherlib.minecraft.version;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Utility to download Minecraft version files from Mojang
 * version_manifest.json. Only a minimal implementation is
 * provided here.
 */
public class VersionManager {
    private static final String MANIFEST_URL = "https://launchermeta.mojang.com/mc/game/version_manifest.json";

    /**
     * Download the version manifest into the given file.
     *
     * @param output destination file
     * @throws IOException if download fails
     */
    public void downloadManifest(Path output) throws IOException {
        try (var stream = new URL(MANIFEST_URL).openStream()) {
            Files.copy(stream, output, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    /**
     * Placeholder for downloading a specific version.
     *
     * @param versionId version identifier
     * @param outputDir destination directory
     */
    public void downloadVersion(String versionId, File outputDir) {
        // TODO Implement download of jars, libraries and assets
    }
}
