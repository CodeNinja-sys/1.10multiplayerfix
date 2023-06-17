/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.e;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cp;
import net.minecraft.client.r;

public class bz
implements bo {
    private final r a = r.z();
    private final ch b;
    private final ch c;

    public bz(ch ch2, ch ch3) {
        this.b = ch2;
        this.c = ch3;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        if (this.b != null) {
            this.b.h = n4;
            this.b.c(this.a, n7, n8);
        }
        if (this.c != null) {
            this.c.h = n4;
            this.c.c(this.a, n7, n8);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.b.a(this.a, n3, n4)) {
            if (this.b instanceof cp) {
                this.a.w.a(((cp)this.b).a(), 1);
                this.b.i = this.a.w.c(e.a(this.b.j));
            }
            return true;
        }
        if (this.c != null && this.c.a(this.a, n3, n4)) {
            if (this.c instanceof cp) {
                this.a.w.a(((cp)this.c).a(), 1);
                this.c.i = this.a.w.c(e.a(this.c.j));
            }
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.b != null) {
            this.b.a(n3, n4);
        }
        if (this.c != null) {
            this.c.a(n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }
}

