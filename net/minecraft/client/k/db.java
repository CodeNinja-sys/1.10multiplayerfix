/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.cc;
import net.minecraft.u.as;

public class db
extends cc
implements as {
    private String a = "";
    private String b = "";
    private int c;
    private boolean d;

    @Override
    public void a(String string) {
        this.b(string);
    }

    @Override
    public void b(String string) {
        this.a = string;
        this.c("Working...");
    }

    @Override
    public void c(String string) {
        this.b = string;
        this.a(0);
    }

    @Override
    public void a(int n2) {
        this.c = n2;
    }

    @Override
    public void a() {
        this.d = true;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.d) {
            if (!this.n.ag()) {
                this.n.a((cc)null);
            }
        } else {
            this.m();
            this.a(this.u, this.a, this.p / 2, 70, 0xFFFFFF);
            this.a(this.u, String.valueOf(this.b) + " " + this.c + "%", this.p / 2, 90, 0xFFFFFF);
            super.a(n2, n3, f2);
        }
    }
}

