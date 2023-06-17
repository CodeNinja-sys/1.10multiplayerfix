/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f.a;

import com.a.b.k;
import com.a.b.r;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.f.a.a;
import net.minecraft.client.f.a.f;
import net.minecraft.client.f.a.q;
import net.minecraft.u.ak;
import net.minecraft.u.d.b;
import net.minecraft.u.d.c;
import net.minecraft.u.d.e;

public class d {
    private final net.minecraft.u.c.a a = new net.minecraft.u.c.e();
    private final r b = new r();
    private k c;

    public d() {
        this.b.a(net.minecraft.u.d.a.class, (Object)new b());
        this.b.a(c.class, (Object)new e());
        this.b.a(new ak());
    }

    public void a(f f2, Class class_) {
        this.a.a(f2.a(), new q(this, f2, class_, null));
        this.b.a((Type)class_, (Object)f2);
        this.c = null;
    }

    public a a(String string, z z2) {
        if (string == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!z2.b(string)) {
            return null;
        }
        if (!z2.c(string).q()) {
            throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + z2.c(string));
        }
        q q2 = (q)this.a.a(string);
        if (q2 == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
        }
        return (a)this.a().a((w)z2.f(string), q2.b);
    }

    private k a() {
        if (this.c == null) {
            this.c = this.b.i();
        }
        return this.c;
    }
}

