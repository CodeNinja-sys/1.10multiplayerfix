/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.io.File;
import net.minecraft.client.f.d;
import net.minecraft.u.bp;

public class ae
extends d {
    private final File a;

    public ae(File file) {
        this.a = file;
    }

    @Override
    public File a(bp bp2) {
        return new File(this.a, bp2.toString().replace(':', '/'));
    }

    @Override
    public File a() {
        return new File(this.a, "pack.mcmeta");
    }
}

