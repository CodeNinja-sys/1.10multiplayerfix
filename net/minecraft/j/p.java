/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import java.util.Comparator;
import net.minecraft.j.j;
import net.minecraft.j.o;
import net.minecraft.j.r;

public class p {
    public static final Comparator a = new o();
    private final r b;
    private final j c;
    private final String d;
    private int e;
    private boolean f;
    private boolean g;

    public p(r r2, j j2, String string) {
        this.b = r2;
        this.c = j2;
        this.d = string;
        this.g = true;
    }

    public void a(int n2) {
        if (this.c.c().a()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.b() + n2);
    }

    public void b(int n2) {
        if (this.c.c().a()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.b() - n2);
    }

    public void a() {
        if (this.c.c().a()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.a(1);
    }

    public int b() {
        return this.e;
    }

    public void c(int n2) {
        int n3 = this.e;
        this.e = n2;
        if (n3 != n2 || this.g) {
            this.g = false;
            this.e().a(this);
        }
    }

    public j c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public r e() {
        return this.b;
    }

    public boolean f() {
        return this.f;
    }

    public void a(boolean bl2) {
        this.f = bl2;
    }
}

