/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.io.File;
import java.io.FileFilter;

class x
implements FileFilter {
    x() {
    }

    @Override
    public boolean accept(File file) {
        boolean bl2;
        boolean bl3 = file.isFile() && file.getName().endsWith(".zip");
        boolean bl4 = bl2 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
        return bl3 || bl2;
    }
}

