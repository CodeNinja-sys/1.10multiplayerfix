/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.b.i;
import com.c.c.c.b;
import com.c.c.d.a.ae;
import com.c.c.d.e;
import com.c.c.e.j;
import com.c.c.e.s;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import net.minecraft.s.f;
import net.minecraft.s.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class bg
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final int b = 1;
    private static final int c = 2;
    private final n d;
    private final i e;
    private f s;
    private boolean t = false;
    private String u = "https://minecraft.net/realms/terms";

    public bg(n n2, i i2) {
        this.d = n2;
        this.e = i2;
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        int n2 = this.r() / 4;
        int n3 = this.r() / 4 - 2;
        int n4 = this.r() / 2 + 4;
        this.s = bg.a(1, n2, com.c.c.d.e.a(12), n3, 20, bg.f("mco.terms.buttons.agree"));
        this.b(this.s);
        this.b(bg.a(2, n4, com.c.c.d.e.a(12), n3, 20, bg.f("mco.terms.buttons.disagree")));
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 2: {
                net.minecraft.s.b.a(this.d);
                break;
            }
            case 1: {
                this.b();
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.d);
        }
    }

    private void b() {
        m m2 = com.c.c.a.m.a();
        try {
            m2.m();
            ae ae2 = new ae(this.d, new j(this.d, this.e));
            ae2.b();
            net.minecraft.s.b.a(ae2);
        }
        catch (b b2) {
            a.b("Couldn't agree to TOS");
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.t) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(this.u), null);
            com.c.c.e.s.a(this.u);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(bg.f("mco.terms.title"), this.r() / 2, 17, 0xFFFFFF);
        this.b(bg.f("mco.terms.sentence.1"), this.r() / 2 - 120, com.c.c.d.e.a(5), 0xFFFFFF);
        int n4 = this.e(bg.f("mco.terms.sentence.1"));
        int n5 = this.r() / 2 - 121 + n4;
        int n6 = com.c.c.d.e.a(5);
        int n7 = n5 + this.e("mco.terms.sentence.2") + 1;
        int n8 = n6 + 1 + this.t();
        if (n5 <= n2 && n2 <= n7 && n6 <= n3 && n3 <= n8) {
            this.t = true;
            this.b(" " + bg.f("mco.terms.sentence.2"), this.r() / 2 - 120 + n4, com.c.c.d.e.a(5), 7107012);
        } else {
            this.t = false;
            this.b(" " + bg.f("mco.terms.sentence.2"), this.r() / 2 - 120 + n4, com.c.c.d.e.a(5), 0x3366BB);
        }
        super.a(n2, n3, f2);
    }
}

