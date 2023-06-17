/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import com.c.a.e;
import java.util.UUID;
import net.minecraft.c.b.aa;

public class g
extends aa {
    private final int a;
    private final boolean b;

    public g(e e2, int n2, boolean bl2) {
        super(e2);
        this.a = n2;
        this.b = bl2;
    }

    public g(z z2) {
        super(g.b(z2), z2);
        this.a = z2.b("level") ? z2.c("level").j() : 0;
        this.b = z2.b("bypassesPlayerLimit") && z2.c("bypassesPlayerLimit").n();
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    @Override
    protected void a(z z2) {
        if (this.c() != null) {
            z2.a("uuid", ((e)this.c()).a() == null ? "" : ((e)this.c()).a().toString());
            z2.a("name", ((e)this.c()).b());
            super.a(z2);
            z2.a("level", this.a);
            z2.a("bypassesPlayerLimit", this.b);
        }
    }

    private static e b(z z2) {
        if (z2.b("uuid") && z2.b("name")) {
            UUID uUID;
            String string = z2.c("uuid").d();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new e(uUID, z2.c("name").d());
        }
        return null;
    }
}

