/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.FileFilter;

final class bdc
implements FileFilter {
    bdc() {
    }

    @Override
    public boolean accept(File file) {
        boolean bl2 = file.isFile() && file.getName().endsWith(".zip");
        boolean bl3 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
        return bl2 || bl3;
    }
}

