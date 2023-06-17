/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.c.a.e;
import com.c.d.b;
import java.util.UUID;
import net.minecraft.u.bt;

public class bs {
    private final String a;
    private final String b;
    private final String c;
    private final bt d;

    public bs(String string, String string2, String string3, String string4) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = bt.a(string4);
    }

    public String a() {
        return "token:" + this.c + ":" + this.b;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public e e() {
        try {
            UUID uUID = com.c.d.b.b(this.b());
            return new e(uUID, this.c());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new e(null, this.c());
        }
    }
}

