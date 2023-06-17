/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.main;

import java.io.File;
import net.minecraft.client.f.ae;
import net.minecraft.client.f.d;

public class i {
    public final File a;
    public final File b;
    public final File c;
    public final String d;

    public i(File file, File file2, File file3, String string) {
        this.a = file;
        this.b = file2;
        this.c = file3;
        this.d = string;
    }

    public d a() {
        return this.d == null ? new ae(this.c) : new d(this.c, this.d);
    }
}

