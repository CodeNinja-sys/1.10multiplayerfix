/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.bo;
import net.minecraft.client.k.cf;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.de;
import net.minecraft.client.k.dn;
import net.minecraft.client.r;

public class bi
implements bo {
    private final r a = r.z();
    private final de b;
    private final de c;
    private de d;

    public bi(de de2, de de3) {
        this.b = de2;
        this.c = de3;
    }

    public de a() {
        return this.b;
    }

    public de b() {
        return this.c;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.a(this.b, n4, n7, n8, false);
        this.a(this.c, n4, n7, n8, false);
    }

    private void a(de de2, int n2, int n3, int n4, boolean bl2) {
        if (de2 != null) {
            if (de2 instanceof ch) {
                this.a((ch)de2, n2, n3, n4, bl2);
            } else if (de2 instanceof dn) {
                this.a((dn)de2, n2, bl2);
            } else if (de2 instanceof cf) {
                this.a((cf)de2, n2, n3, n4, bl2);
            }
        }
    }

    private void a(ch ch2, int n2, int n3, int n4, boolean bl2) {
        ch2.h = n2;
        if (!bl2) {
            ch2.c(this.a, n3, n4);
        }
    }

    private void a(dn dn2, int n2, boolean bl2) {
        dn2.b = n2;
        if (!bl2) {
            dn2.g();
        }
    }

    private void a(cf cf2, int n2, int n3, int n4, boolean bl2) {
        cf2.d = n2;
        if (!bl2) {
            cf2.a(this.a, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.a(this.b, n4, 0, 0, true);
        this.a(this.c, n4, 0, 0, true);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2 = this.a(this.b, n3, n4, n5);
        boolean bl3 = this.a(this.c, n3, n4, n5);
        return bl2 || bl3;
    }

    private boolean a(de de2, int n2, int n3, int n4) {
        if (de2 == null) {
            return false;
        }
        if (de2 instanceof ch) {
            return this.a((ch)de2, n2, n3, n4);
        }
        if (de2 instanceof dn) {
            this.a((dn)de2, n2, n3, n4);
        }
        return false;
    }

    private boolean a(ch ch2, int n2, int n3, int n4) {
        boolean bl2 = ch2.a(this.a, n2, n3);
        if (bl2) {
            this.d = ch2;
        }
        return bl2;
    }

    private void a(dn dn2, int n2, int n3, int n4) {
        dn2.a(n2, n3, n4);
        if (dn2.k()) {
            this.d = dn2;
        }
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.b(this.b, n3, n4, n5);
        this.b(this.c, n3, n4, n5);
    }

    private void b(de de2, int n2, int n3, int n4) {
        if (de2 != null && de2 instanceof ch) {
            this.b((ch)de2, n2, n3, n4);
        }
    }

    private void b(ch ch2, int n2, int n3, int n4) {
        ch2.a(n2, n3);
    }

    static /* synthetic */ de a(bi bi2) {
        return bi2.b;
    }

    static /* synthetic */ de b(bi bi2) {
        return bi2.c;
    }

    static /* synthetic */ de c(bi bi2) {
        return bi2.d;
    }
}

