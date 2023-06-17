/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.e.b;

import com.c.a.e;
import java.util.UUID;
import net.minecraft.x.e.a;
import net.minecraft.x.p;

public class d
implements p {
    private e a;

    public d() {
    }

    public d(e e2) {
        this.a = e2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        String string = a2.e(36);
        String string2 = a2.e(16);
        UUID uUID = UUID.fromString(string);
        this.a = new e(uUID, string2);
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        UUID uUID = this.a.a();
        a2.a(uUID == null ? "" : uUID.toString());
        a2.a(this.a.b());
    }

    public void a(a a2) {
        a2.a(this);
    }

    public e a() {
        return this.a;
    }
}

