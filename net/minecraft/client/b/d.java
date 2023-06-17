/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.List;
import java.util.Set;
import net.minecraft.client.f.u;
import net.minecraft.u.ax;
import org.lwjgl.a.g;

public class d
implements Comparable {
    private static final List a = ov.a();
    private static final ax b = new ax();
    private static final Set c = aad.a();
    private final String d;
    private final int e;
    private final String f;
    private int g;
    private boolean h;
    private int i;

    public static void a(int n2) {
        d d2;
        if (n2 != 0 && (d2 = (d)b.a(n2)) != null) {
            ++d2.i;
        }
    }

    public static void a(int n2, boolean bl2) {
        d d2;
        if (n2 != 0 && (d2 = (d)b.a(n2)) != null) {
            d2.h = bl2;
        }
    }

    public static void a() {
        for (d d2 : a) {
            try {
                net.minecraft.client.b.d.a(d2.g, org.lwjgl.a.g.a(d2.g));
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                // empty catch block
            }
        }
    }

    public static void b() {
        for (d d2 : a) {
            d2.k();
        }
    }

    public static void c() {
        b.a();
        for (d d2 : a) {
            b.a(d2.g, d2);
        }
    }

    public static Set d() {
        return c;
    }

    public d(String string, int n2, String string2) {
        this.d = string;
        this.g = n2;
        this.e = n2;
        this.f = string2;
        a.add(this);
        b.a(n2, this);
        c.add(string2);
    }

    public boolean e() {
        return this.h;
    }

    public String f() {
        return this.f;
    }

    public boolean g() {
        if (this.i == 0) {
            return false;
        }
        --this.i;
        return true;
    }

    private void k() {
        this.i = 0;
        this.h = false;
    }

    public String h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public int j() {
        return this.g;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public int a(d d2) {
        int n2 = u.a(this.f, new Object[0]).compareTo(u.a(d2.f, new Object[0]));
        if (n2 == 0) {
            n2 = u.a(this.d, new Object[0]).compareTo(u.a(d2.d, new Object[0]));
        }
        return n2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((d)object);
    }
}

