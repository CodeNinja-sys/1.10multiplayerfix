/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.net.URI;
import net.minecraft.client.b.a;
import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.u.bp;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class df
extends cc {
    private static final d a = c.c();
    private static final bp b = new bp("textures/gui/demo_background.png");

    @Override
    public void ct_() {
        this.r.clear();
        int n2 = -16;
        this.r.add(new ch(1, this.p / 2 - 116, this.q / 2 + 62 + -16, 114, 20, net.minecraft.client.f.u.a("demo.help.buy", new Object[0])));
        this.r.add(new ch(2, this.p / 2 + 2, this.q / 2 + 62 + -16, 114, 20, net.minecraft.client.f.u.a("demo.help.later", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        switch (ch2.j) {
            case 1: {
                ch2.k = false;
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class_.getMethod("browse", URI.class).invoke(object, new URI("http://www.minecraft.net/store?source=demo"));
                }
                catch (Throwable throwable) {
                    a.b("Couldn't open link", throwable);
                }
                break;
            }
            case 2: {
                this.n.a((cc)null);
                this.n.o();
            }
        }
    }

    @Override
    public void bY_() {
        super.bY_();
    }

    @Override
    public void m() {
        super.m();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(b);
        int n2 = (this.p - 248) / 2;
        int n3 = (this.q - 166) / 2;
        this.a_(n2, n3, 0, 0, 248, 166);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        int n4 = (this.p - 248) / 2 + 10;
        int n5 = (this.q - 166) / 2 + 8;
        this.u.a(net.minecraft.client.f.u.a("demo.help.title", new Object[0]), n4, n5, 0x1F1F1F);
        a a2 = this.n.w;
        this.u.a(net.minecraft.client.f.u.a("demo.help.movementShort", net.minecraft.client.b.a.a(a2.S.j()), net.minecraft.client.b.a.a(a2.T.j()), net.minecraft.client.b.a.a(a2.U.j()), net.minecraft.client.b.a.a(a2.V.j())), n4, n5 += 12, 0x4F4F4F);
        this.u.a(net.minecraft.client.f.u.a("demo.help.movementMouse", new Object[0]), n4, n5 + 12, 0x4F4F4F);
        this.u.a(net.minecraft.client.f.u.a("demo.help.jump", net.minecraft.client.b.a.a(a2.W.j())), n4, n5 + 24, 0x4F4F4F);
        this.u.a(net.minecraft.client.f.u.a("demo.help.inventory", net.minecraft.client.b.a.a(a2.Z.j())), n4, n5 + 36, 0x4F4F4F);
        this.u.a(net.minecraft.client.f.u.a("demo.help.fullWrapped", new Object[0]), n4, n5 + 68, 218, 0x1F1F1F);
        super.a(n2, n3, f2);
    }
}

