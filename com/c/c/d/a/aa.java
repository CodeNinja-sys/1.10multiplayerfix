/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.c.b;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class aa
extends n {
    private final n a;
    private static final int b = 10;
    private String c;
    private String d;

    public aa(b b2, n n2) {
        this.a = n2;
        this.a(b2);
    }

    public aa(String string, n n2) {
        this.a = n2;
        this.a(string);
    }

    public aa(String string, String string2, n n2) {
        this.a = n2;
        this.a(string, string2);
    }

    private void a(b b2) {
        if (b2.c != -1) {
            this.c = "Realms (" + b2.c + "):";
            String string = "mco.errorMessage." + b2.c;
            String string2 = aa.f(string);
            this.d = string2.equals(string) ? b2.d : string2;
        } else {
            this.c = "An error occurred (" + b2.a + "):";
            this.d = b2.b;
        }
    }

    private void a(String string) {
        this.c = "An error occurred: ";
        this.d = string;
    }

    private void a(String string, String string2) {
        this.c = string;
        this.d = string2;
    }

    @Override
    public void d() {
        this.u();
        this.b(aa.a(10, this.r() / 2 - 100, this.s() - 52, 200, 20, "Ok"));
    }

    @Override
    public void g() {
        super.g();
    }

    @Override
    public void a(f f2) {
        if (f2.c() == 10) {
            net.minecraft.s.b.a(this.a);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(this.c, this.r() / 2, 80, 0xFFFFFF);
        this.a(this.d, this.r() / 2, 100, 0xFF0000);
        super.a(n2, n3, f2);
    }
}

