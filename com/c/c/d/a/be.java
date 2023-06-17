/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.b.i;
import com.c.c.b.x;
import com.c.c.b.y;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.ac;
import com.c.c.d.a.ad;
import com.c.c.d.a.bf;
import com.c.c.d.e;
import com.c.c.e.s;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import net.minecraft.s.f;
import net.minecraft.s.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class be
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private final n b;
    private final i c;
    private final n d;
    private final int e = 0;
    private final int s = 1;
    private int t;
    private String u;
    private y v;
    private final String w = "https://account.mojang.com/buy/realms";
    private boolean x;

    public be(n n2, i i2, n n3) {
        this.b = n2;
        this.c = i2;
        this.d = n3;
    }

    @Override
    public void d() {
        this.a(this.c.a);
        org.lwjgl.a.g.a(true);
        this.b(be.a(0, this.r() / 2 - 100, com.c.c.d.e.a(12), be.f("gui.back")));
        if (this.c.k) {
            this.b(be.a(1, this.r() / 2 - 100, com.c.c.d.e.a(10), be.f("mco.configure.world.delete.button")));
        }
    }

    private void a(long l2) {
        m m2 = com.c.c.a.m.a();
        try {
            x x2 = m2.h(l2);
            this.t = x2.b;
            this.u = this.b(x2.a);
            this.v = x2.c;
        }
        catch (b b2) {
            a.b("Couldn't get subscription");
            net.minecraft.s.b.a(new aa(b2, this.b));
        }
        catch (IOException iOException) {
            a.b("Couldn't parse response subscribing");
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 1 && bl2) {
            new bf(this, "Realms-delete-realm").start();
        }
        net.minecraft.s.b.a(this);
    }

    private String b(long l2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(l2);
        return SimpleDateFormat.getDateTimeInstance().format(gregorianCalendar.getTime());
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
        if (f2.c() == 0) {
            net.minecraft.s.b.a(this.b);
        } else if (f2.c() == 1) {
            String string = be.f("mco.configure.world.delete.question.line1");
            String string2 = be.f("mco.configure.world.delete.question.line2");
            net.minecraft.s.b.a(new ac(this, ad.a, string, string2, true, 1));
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.b);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.x) {
            String string = "https://account.mojang.com/buy/realms?sid=" + this.c.b + "&pid=" + net.minecraft.s.b.g();
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(string), null);
            com.c.c.e.s.a(string);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        int n4 = this.r() / 2 - 100;
        this.a(be.f("mco.configure.world.subscription.title"), this.r() / 2, 17, 0xFFFFFF);
        this.b(be.f("mco.configure.world.subscription.start"), n4, com.c.c.d.e.a(0), 0xA0A0A0);
        this.b(this.u, n4, com.c.c.d.e.a(1), 0xFFFFFF);
        if (this.v == y.a) {
            this.b(be.f("mco.configure.world.subscription.timeleft"), n4, com.c.c.d.e.a(3), 0xA0A0A0);
        } else if (this.v == y.b) {
            this.b(be.f("mco.configure.world.subscription.recurring.daysleft"), n4, com.c.c.d.e.a(3), 0xA0A0A0);
        }
        this.b(this.a(this.t), n4, com.c.c.d.e.a(4), 0xFFFFFF);
        this.b(be.f("mco.configure.world.subscription.extendHere"), n4, com.c.c.d.e.a(6), 0xA0A0A0);
        int n5 = com.c.c.d.e.a(7);
        int n6 = this.e("https://account.mojang.com/buy/realms");
        int n7 = this.r() / 2 - n6 / 2 - 1;
        int n8 = n5 - 1;
        int n9 = n7 + n6 + 1;
        int n10 = n5 + 1 + this.t();
        if (n7 <= n2 && n2 <= n9 && n8 <= n3 && n3 <= n10) {
            this.x = true;
            this.b("https://account.mojang.com/buy/realms", this.r() / 2 - n6 / 2, n5, 7107012);
        } else {
            this.x = false;
            this.b("https://account.mojang.com/buy/realms", this.r() / 2 - n6 / 2, n5, 0x3366BB);
        }
        super.a(n2, n3, f2);
    }

    private String a(int n2) {
        if (n2 == -1 && this.c.k) {
            return be.f("mco.configure.world.subscription.expired");
        }
        if (n2 <= 1) {
            return be.f("mco.configure.world.subscription.less_than_a_day");
        }
        int n3 = n2 / 30;
        int n4 = n2 % 30;
        StringBuilder stringBuilder = new StringBuilder();
        if (n3 > 0) {
            stringBuilder.append(n3).append(" ");
            if (n3 == 1) {
                stringBuilder.append(be.f("mco.configure.world.subscription.month").toLowerCase());
            } else {
                stringBuilder.append(be.f("mco.configure.world.subscription.months").toLowerCase());
            }
        }
        if (n4 > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(n4).append(" ");
            if (n4 == 1) {
                stringBuilder.append(be.f("mco.configure.world.subscription.day").toLowerCase());
            } else {
                stringBuilder.append(be.f("mco.configure.world.subscription.days").toLowerCase());
            }
        }
        return stringBuilder.toString();
    }

    static /* synthetic */ i a(be be2) {
        return be2.c;
    }

    static /* synthetic */ d b() {
        return a;
    }

    static /* synthetic */ n b(be be2) {
        return be2.d;
    }
}

