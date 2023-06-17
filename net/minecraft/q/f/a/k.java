/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import java.io.File;
import java.io.FilenameFilter;
import net.minecraft.q.f.a.l;

class k
implements FilenameFilter {
    final /* synthetic */ l a;

    k(l l2) {
        this.a = l2;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }
}

