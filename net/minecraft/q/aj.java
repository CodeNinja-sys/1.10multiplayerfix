/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.q.a.d;
import net.minecraft.q.ab;
import net.minecraft.q.am;

public final class aj {
    private final long a;
    private final am b;
    private final boolean c;
    private final boolean d;
    private final ab e;
    private boolean f;
    private boolean g;
    private String h = "";

    public aj(long l2, am am2, boolean bl2, boolean bl3, ab ab2) {
        this.a = l2;
        this.b = am2;
        this.c = bl2;
        this.d = bl3;
        this.e = ab2;
    }

    public aj(d d2) {
        this(d2.a(), d2.q(), d2.r(), d2.s(), d2.t());
    }

    public aj a() {
        this.g = true;
        return this;
    }

    public aj b() {
        this.f = true;
        return this;
    }

    public aj a(String string) {
        this.h = string;
        return this;
    }

    public boolean c() {
        return this.g;
    }

    public long d() {
        return this.a;
    }

    public am e() {
        return this.b;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.c;
    }

    public ab h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public static am a(int n2) {
        return am.a(n2);
    }

    public String j() {
        return this.h;
    }
}

