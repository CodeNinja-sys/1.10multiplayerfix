/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.dg;
import com.a.a.d.ov;
import net.minecraft.client.f.u;
import net.minecraft.client.k.az;
import net.minecraft.client.k.br;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cs;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class dm
extends cc
implements bu {
    private static final d c = org.apache.logging.log4j.c.c();
    protected cc a;
    protected String b = "Select world";
    private String d;
    private ch e;
    private ch f;
    private ch g;
    private ch h;
    private az i;

    public dm(cc cc2) {
        this.a = cc2;
    }

    @Override
    public void ct_() {
        this.b = net.minecraft.client.f.u.a("selectWorld.title", new Object[0]);
        this.i = new az(this, this.n, this.p, this.q, 32, this.q - 64, 36);
        this.f();
    }

    @Override
    public void cp_() {
        super.cp_();
        this.i.cr_();
    }

    public void f() {
        this.f = this.b(new ch(1, this.p / 2 - 154, this.q - 52, 150, 20, net.minecraft.client.f.u.a("selectWorld.select", new Object[0])));
        this.b(new ch(3, this.p / 2 + 4, this.q - 52, 150, 20, net.minecraft.client.f.u.a("selectWorld.create", new Object[0])));
        this.g = this.b(new ch(4, this.p / 2 - 154, this.q - 28, 72, 20, net.minecraft.client.f.u.a("selectWorld.edit", new Object[0])));
        this.e = this.b(new ch(2, this.p / 2 - 76, this.q - 28, 72, 20, net.minecraft.client.f.u.a("selectWorld.delete", new Object[0])));
        this.h = this.b(new ch(5, this.p / 2 + 4, this.q - 28, 72, 20, net.minecraft.client.f.u.a("selectWorld.recreate", new Object[0])));
        this.b(new ch(0, this.p / 2 + 82, this.q - 28, 72, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.f.k = false;
        this.e.k = false;
        this.g.k = false;
        this.h.k = false;
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            br br2 = this.i.e();
            if (ch2.j == 2) {
                if (br2 != null) {
                    br2.b();
                }
            } else if (ch2.j == 1) {
                if (br2 != null) {
                    br2.a();
                }
            } else if (ch2.j == 3) {
                this.n.a(new cs(this));
            } else if (ch2.j == 4) {
                if (br2 != null) {
                    br2.c();
                }
            } else if (ch2.j == 0) {
                this.n.a(this.a);
            } else if (ch2.j == 5 && br2 != null) {
                br2.d();
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.d = null;
        this.i.a(n2, n3, f2);
        this.a(this.u, this.b, this.p / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.d != null) {
            this.a(ov.a(dg.a("\n").a(this.d)), n2, n3);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.i.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        this.i.c(n2, n3, n4);
    }

    public void a(String string) {
        this.d = string;
    }

    public void a(br br2) {
        boolean bl2;
        this.f.k = bl2 = br2 != null;
        this.e.k = bl2;
        this.g.k = bl2;
        this.h.k = bl2;
    }
}

