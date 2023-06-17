/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import net.minecraft.j.f;
import net.minecraft.j.l;
import net.minecraft.j.r;

public class j {
    private final r a;
    private final String b;
    private final f c;
    private l d;
    private String e;

    public j(r r2, String string, f f2) {
        this.a = r2;
        this.b = string;
        this.c = f2;
        this.e = string;
        this.d = f2.b();
    }

    public r a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public f c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
        this.a.b(this);
    }

    public l e() {
        return this.d;
    }

    public void a(l l2) {
        this.d = l2;
        this.a.b(this);
    }
}

