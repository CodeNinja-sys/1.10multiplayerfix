/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.al;
import net.minecraft.client.r;
import net.minecraft.u.b.s;

public class e {
    private final String b;
    private long c;
    private s d;
    final /* synthetic */ al a;

    public e(al al2, String string, s s2) {
        this.a = al2;
        this.b = string;
        this.d = s2;
        this.c = r.I();
    }

    public String a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public s c() {
        return this.d;
    }

    public void a(s s2) {
        this.d = s2;
        this.c = r.I();
    }
}

