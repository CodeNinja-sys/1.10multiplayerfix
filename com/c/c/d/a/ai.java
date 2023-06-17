/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.a.a.d.ov;
import com.c.c.a;
import com.c.c.d.a.aj;
import com.c.c.d.a.ak;
import com.c.c.d.a.al;
import com.c.c.d.a.am;
import java.util.List;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class ai
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final int b = 0;
    private static final String c = "realms:textures/gui/realms/accept_icon.png";
    private static final String d = "realms:textures/gui/realms/reject_icon.png";
    private final n e;
    private String s = null;
    private boolean t = false;
    private am u;
    private List v = ov.a();

    public ai(n n2) {
        this.e = n2;
    }

    @Override
    public void a() {
        super.a();
        this.u.h();
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.u = new am(this);
        new aj(this, "Realms-pending-invitations-fetcher").start();
        this.b(ai.a(0, this.r() / 2 - 75, this.s() - 32, 153, 20, ai.f("gui.done")));
    }

    @Override
    public void g() {
        super.g();
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 0: {
                net.minecraft.s.b.a(new a(this.e));
            }
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(new a(this.e));
        }
    }

    private void a(int n2) {
        this.v.remove(n2);
    }

    private void b(int n2) {
        if (n2 < this.v.size()) {
            new ak(this, "Realms-reject-invitation", n2).start();
        }
    }

    private void d(int n2) {
        if (n2 < this.v.size()) {
            new al(this, "Realms-accept-invitation", n2).start();
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.s = null;
        this.p();
        this.u.a(n2, n3, f2);
        this.a(ai.f("mco.invites.title"), this.r() / 2, 12, 0xFFFFFF);
        if (this.s != null) {
            this.a(this.s, n2, n3);
        }
        if (this.v.size() == 0 && this.t) {
            this.a(ai.f("mco.invites.nopending"), this.r() / 2, this.s() / 2 - 20, 0xFFFFFF);
        }
        super.a(n2, n3, f2);
    }

    protected void a(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = n2 + 12;
        int n5 = n3 - 12;
        int n6 = this.e(string);
        this.b(n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
        this.c(string, n4, n5, 0xFFFFFF);
    }

    static /* synthetic */ List a(ai ai2, List list) {
        ai2.v = list;
        return ai2.v;
    }

    static /* synthetic */ d b() {
        return a;
    }

    static /* synthetic */ boolean a(ai ai2, boolean bl2) {
        ai2.t = bl2;
        return ai2.t;
    }

    static /* synthetic */ List a(ai ai2) {
        return ai2.v;
    }

    static /* synthetic */ void a(ai ai2, int n2) {
        ai2.a(n2);
    }

    static /* synthetic */ String a(ai ai2, String string) {
        ai2.s = string;
        return ai2.s;
    }

    static /* synthetic */ void b(ai ai2, int n2) {
        ai2.d(n2);
    }

    static /* synthetic */ void c(ai ai2, int n2) {
        ai2.b(n2);
    }
}

