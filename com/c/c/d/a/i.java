/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.a;
import com.c.c.d.a.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.n;
import org.lwjgl.a.g;

public class i
extends n {
    private final n c;
    private final int d = 0;
    private final a e;
    private List s = new ArrayList();
    private j t;
    String[] a = new String[]{com.c.c.d.a.i.f("options.difficulty.peaceful"), com.c.c.d.a.i.f("options.difficulty.easy"), com.c.c.d.a.i.f("options.difficulty.normal"), com.c.c.d.a.i.f("options.difficulty.hard")};
    String[] b = new String[]{com.c.c.d.a.i.f("selectWorld.gameMode.survival"), com.c.c.d.a.i.f("selectWorld.gameMode.creative"), com.c.c.d.a.i.f("selectWorld.gameMode.adventure")};

    public i(n n2, a a2) {
        this.c = n2;
        this.e = a2;
        if (a2.e != null) {
            for (Map.Entry entry : a2.e.entrySet()) {
                this.s.add(entry.getKey());
            }
        }
    }

    @Override
    public void a() {
        super.a();
        this.t.h();
    }

    @Override
    public void g() {
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.b(com.c.c.d.a.i.a(0, this.r() / 2 - 100, this.s() / 4 + 120 + 24, com.c.c.d.a.i.f("gui.back")));
        this.t = new j(this);
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
            net.minecraft.s.b.a(this.c);
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.c);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a("Changes from last backup", this.r() / 2, 10, 0xFFFFFF);
        this.t.a(n2, n3, f2);
        super.a(n2, n3, f2);
    }

    private String a(String string, String string2) {
        String string3 = string.toLowerCase();
        if (string3.contains("game") && string3.contains("mode")) {
            return this.b(string2);
        }
        if (string3.contains("game") && string3.contains("difficulty")) {
            return this.a(string2);
        }
        return string2;
    }

    private String a(String string) {
        try {
            return this.a[Integer.parseInt(string)];
        }
        catch (Exception exception) {
            return "UNKNOWN";
        }
    }

    private String b(String string) {
        try {
            return this.b[Integer.parseInt(string)];
        }
        catch (Exception exception) {
            return "UNKNOWN";
        }
    }

    static /* synthetic */ a a(i i2) {
        return i2.e;
    }

    static /* synthetic */ List b(i i2) {
        return i2.s;
    }

    static /* synthetic */ String a(i i2, String string, String string2) {
        return i2.a(string, string2);
    }
}

